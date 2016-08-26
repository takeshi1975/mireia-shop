package com.jac.amazon;

import com.jac.amazon.srcgen.Item;
import com.jac.amazon.srcgen.ItemSearchResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.sun.org.apache.xml.internal.security.utils.Base64;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import org.apache.log4j.Logger;

public class Amazon {

    private final Logger log = Logger.getLogger(Amazon.class);
    private static final String UTF8_CHARSET = "UTF-8";
    private static final String HMAC_SHA256_ALGORITHM = "HmacSHA256";
    private static final String REQUEST_URI = "/onca/xml";
    private static final String REQUEST_METHOD = "GET";

    private String endpoint = "webservices.amazon.com"; // must be lowercase
    private String awsAccessKeyId = "AKIAJGK33UXRN7XC6B6Q";
    private String awsSecretKey = "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";

    private SecretKeySpec secretKeySpec = null;
    private Mac mac = null;

    public Amazon() throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] secretyKeyBytes = awsSecretKey.getBytes(UTF8_CHARSET);
        secretKeySpec = new SecretKeySpec(secretyKeyBytes, HMAC_SHA256_ALGORITHM);
        mac = Mac.getInstance(HMAC_SHA256_ALGORITHM);
        mac.init(secretKeySpec);
    }

    public String sign(Map<String, String> params) {

        SortedMap<String, String> sortedParamMap = new TreeMap<String, String>(params);
        String canonicalQS = canonicalize(sortedParamMap);
        String toSign = REQUEST_METHOD + "\n" + endpoint + "\n" + REQUEST_URI + "\n" + canonicalQS;

        String hmac = hmac(toSign);
        String sig = percentEncodeRfc3986(hmac);        
        return sig;
    }

    private String hmac(String stringToSign) {
        String signature = null;
        byte[] data;
        byte[] rawHmac;
        try {
            data = stringToSign.getBytes(UTF8_CHARSET);
            rawHmac = mac.doFinal(data);

            signature = new String(Base64.encode(rawHmac));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(UTF8_CHARSET + " is unsupported!", e);
        }
        return signature;
    }

    private String timestamp() {
        String timestamp = null;
        Calendar cal = Calendar.getInstance();
        DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dfm.setTimeZone(TimeZone.getTimeZone("GMT"));
        timestamp = dfm.format(cal.getTime());
        log.debug(timestamp);
        return timestamp;
    }

    private String canonicalize(SortedMap<String, String> sortedParamMap) {
        if (sortedParamMap.isEmpty()) {
            return "";
        }

        StringBuffer buffer = new StringBuffer();
        Iterator<Map.Entry<String, String>> iter = sortedParamMap.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, String> kvpair = iter.next();
            buffer.append(percentEncodeRfc3986(kvpair.getKey()));
            buffer.append("=");
            buffer.append(percentEncodeRfc3986(kvpair.getValue()));
            if (iter.hasNext()) {
                buffer.append("&");
            }
        }
        String canonical = buffer.toString();
        return canonical;
    }

    private String percentEncodeRfc3986(String s) {
        String out;
        try {
            out = URLEncoder.encode(s, UTF8_CHARSET).replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
        } catch (UnsupportedEncodingException e) {
            out = s;
        }
        return out;
    }

    public String process(String keywords) {
//		String request = "http://webservices.amazon.com/onca/xml?Service=AWSECommerceServic"+
//	     "e&AWSAccessKeyId="+awsAccessKeyId+"&Operation=ItemLookup&ItemId"+
//	     "=0679722769&ResponseGroup=ItemAttributes,Offers,Images,Reviews&Ve"+
//	     "rsion=2013-08-01";
        String request = "http://webservices.amazon.com/onca/xml?Service=AWSECommerceService"
                + "&AWSAccessKeyId=AKIAJGK33UXRN7XC6B6Q"
                + "&Operation=ItemSearch"
                + "&AssociateTag=juanjowebsite-20"
                + "&SearchIndex=All"
                + "&Keywords="+((keywords==null)?"java":keywords)
                + "&Version=2013-08-01"
                + "&ResponseGroup=Images, ItemAttributes, Offers";

//		// 1.- Encode
        // ID de afiliado: amazon05e1-21
        //request = this.percentEncodeRfc3986(request);
        // 2.- List of parameters-values		
        String buffer[] = request.split("\\?");
        String url = buffer[0];
        buffer = buffer[1].split("&");
        List<String> paramval = new ArrayList<String>(Arrays.asList(buffer));
        // Add Time
        paramval.add("Timestamp=" + timestamp());
        // Sort
        Collections.sort(paramval);
        //  Canonical String (rejoin)
        String parameters = "";
        for (String pv : paramval) {
            String subbuff[] = pv.split("=");
            parameters += subbuff[0] + "=" + percentEncodeRfc3986(subbuff[1]) + "&";
        }
        parameters = parameters.substring(0, parameters.length() - 1);
        log.debug(parameters);
        String paramext = "GET\nwebservices.amazon.com\n/onca/xml\n" + parameters;
        log.debug(paramext);
        String hmac = hmac(paramext);
        String sig = percentEncodeRfc3986(hmac);
        return url + "?" + parameters + "&Signature=" + sig;

    }    

    public ItemSearchResponse send() throws Exception {
        String address = process(null);
        log.debug(address);
        URL url = new URL(address);
        HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
        ItemSearchResponse itemSearch = null;
        if (httpConnection.getResponseCode() == 200) {
            log.debug("OK:");
            JAXBContext context = JAXBContext.newInstance(ItemSearchResponse.class);    
            Unmarshaller unmarshaller = context.createUnmarshaller();                        
            String result = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()))
                    .lines().collect(Collectors.joining("\n"));
            String xml = new XmlFormatter().format(result);                
            log.debug(xml);  
            System.out.println("Voy a escribir el fichero");
            FileWriter f = new FileWriter("/home/juanjo/jaxb-ri/bin/Amazon.xml");        
            try{
                f.write(xml);
                f.flush();
                log.debug("Se ha escrito el fichero");
            }finally{
                f.close();
            }        
            StringReader xmlReader = new StringReader(xml);
            itemSearch = (ItemSearchResponse)unmarshaller.unmarshal(xmlReader);            
        } else {
            System.out.println("Error:");
            String result = new BufferedReader(new InputStreamReader(httpConnection.getErrorStream()))
                    .lines().collect(Collectors.joining("\n"));
            System.out.println(result);
        }

        return itemSearch;
    }

    public List<Item> send(String keywords) {
        String _FILE = "/home/juanjo/Java/jaxb-ri/bin/Amazon.xml";        
            
        try{
            String address = process(keywords);
            System.out.println(address);
            URL url = new URL(address);
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
            ItemSearchResponse itemSearch = null;
            if (httpConnection.getResponseCode() == 200) {
                System.out.println("OK:");
                JAXBContext context = JAXBContext.newInstance(ItemSearchResponse.class);    
                Unmarshaller unmarshaller = context.createUnmarshaller();                        
                String result = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()))
                        .lines().collect(Collectors.joining("\n"));
                String xml = new XmlFormatter().format(result);                
                System.out.println(xml);        
                StringReader xmlReader = new StringReader(xml);
                itemSearch = (ItemSearchResponse)unmarshaller.unmarshal(xmlReader);                  
                File f = new File(_FILE);
                if (!f.exists())
                    f.createNewFile();
                FileWriter fw = new FileWriter(f);        
                try{
                    fw.write(xml);
                    fw.flush();
                    log.debug("Se ha escrito el fichero");
                }finally{
                    fw.close();
                }        
            } else {
                System.out.println("Error:");
                String result = new BufferedReader(new InputStreamReader(httpConnection.getErrorStream()))
                        .lines().collect(Collectors.joining("\n"));
                System.out.println(result);
            }
            if (itemSearch!=null){                
                if (itemSearch.getItems()!=null)
                    return itemSearch.getItems().getItem();
            }
       }catch(Exception ex){
            log.error(ex.toString());
        }
        return null;
    }
    
    public static void main(String[] args) throws Exception {
        ItemSearchResponse itemSearchResponse  = new Amazon().send();
       
                
        for (Item item : itemSearchResponse.getItems().getItem()){
            System.out.println(item.getOfferSummary().getLowestNewPrice()+"$");
        }
            
    }

}
