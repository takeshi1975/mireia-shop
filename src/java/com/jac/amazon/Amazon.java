package com.jac.amazon;

import com.jac.amazon.product.Product;
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
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.util.Scanner;
import java.util.stream.Collectors;
import static javafx.scene.input.KeyCode.P;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
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
    private String awsSecretKey = "L8";
    private SecretKeySpec secretKeySpec = null;
    private Mac mac = null;
    private int count = 0;
    

    public Amazon() throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
        final String _FILE = "shop.properties";
        
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(_FILE);
        Properties properties = new Properties();  
        String awsSecretKey= null;
        try{
            properties.load(inputStream);
            awsSecretKey = properties.getProperty("awsSecretKey");
        }catch(IOException ioex){
            log.info(ioex.toString());
        }            
        byte[] secretyKeyBytes = awsSecretKey.getBytes(UTF8_CHARSET);
        secretKeySpec = new SecretKeySpec(secretyKeyBytes, HMAC_SHA256_ALGORITHM);
        mac = Mac.getInstance(HMAC_SHA256_ALGORITHM);
        mac.init(secretKeySpec);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

    private String createURLForItemSearch(String keywords, int page) {
//		String request = "http://webservices.amazon.com/onca/xml?Service=AWSECommerceServic"+
//	     "e&AWSAccessKeyId="+awsAccessKeyId+"&Operation=ItemLookup&ItemId"+
//	     "=0679722769&ResponseGroup=ItemAttributes,Offers,Images,Reviews&Ve"+
//	     "rsion=2013-08-01";
        String request = "http://webservices.amazon.com/onca/xml?Service=AWSECommerceService"
                + "&AWSAccessKeyId=AKIAJGK33UXRN7XC6B6Q"
                + "&Operation=ItemSearch"
                + "&AssociateTag=juanjowebsite-20"
                + "&SearchIndex=All"
                + "&ItemPage="+page
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

    private String createURLForItemLookUp(){
        log.info("Create URL For Item Look Up");
        String request = "http://webservices.amazon.com/onca/xml?Service=AWSECommerceService&"+
        "AWSAccessKeyId==AKIAJGK33UXRN7XC6B6Q&"+
        "Operation=ItemLookup&"+
        "ItemId=B00008OE6I";
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
    
    private String send(String address) throws IOException{
        URL url = new URL(address);
        HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
        if (httpConnection.getResponseCode() == HttpURLConnection.HTTP_OK){
            String result = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()))
                    .lines().collect(Collectors.joining("\n"));
            String xml = new XmlFormatter().format(result);                
            log.debug(xml);  
            return xml;
        } else {            
            String error = read(httpConnection.getErrorStream());
            log.error(error);
            throw new IOException(error);
        }        
    }
    
    private Object unmarshall(String xml, Class typeclass) throws JAXBException{             
        JAXBContext context = JAXBContext.newInstance(typeclass);    
        Unmarshaller unmarshaller = context.createUnmarshaller();                        
        return  unmarshaller.unmarshal(new StringReader(xml));
    }
    
    private String read(InputStream is){
        Scanner scanner = new Scanner(is).useDelimiter("\\A");
        return (scanner.hasNext()?scanner.next():"");
    }    
    
    public ItemSearchResponse performItemSearch() throws Exception {
        String address = createURLForItemSearch(null,1);
        log.debug(address);
        String xml = send(address);        
        return (ItemSearchResponse)unmarshall(xml, ItemSearchResponse.class);             
    }    
    
    public List<Item> performItemSearch(String keywords, int page) 
            throws IOException, JAXBException{                
        String address = createURLForItemSearch(keywords, page);
        log.debug(address);
        String xml = send(address);    
        ItemSearchResponse itemSearchResponse = (ItemSearchResponse) unmarshall(xml, ItemSearchResponse.class);        
        if (itemSearchResponse!=null && itemSearchResponse.getItems()!=null)
            return itemSearchResponse.getItems().getItem();     
        return null;
    }
    
    public Product performItemLookUp(String key) 
               throws IOException, JAXBException{
        String address = createURLForItemLookUp();
        log.debug(address);
        String xml = send(address);
        log.debug(xml);        
        Product product =  new Product();
        // Falta traducir del XML para obtener los datos del producto.
        // Hay que implementar algo para obtener también la ruta de la foto...
        product.setId(key);
        product.setName("La oreja de Van Gogh");
        product.setDescription("Muñeca de trapo");
        product.setPicture("http://www.followingthenerd.com/site/wp-content/uploads/Evangeline-Lilly-12.jpg");
        return product;
    }
               
}
