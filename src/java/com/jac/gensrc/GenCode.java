/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jac.gensrc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.inst2xsd.Inst2Xsd;
import org.apache.xmlbeans.impl.inst2xsd.Inst2XsdOptions;
import org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument;

/**
 *
 * @author juanjo
 */
public class GenCode {    
    public enum XMLSchemaDesign{VENETIAN_BLIND, RUSSIAN_DOLL, SALAMI_SLICE};
    
    public void run(){    
        final String _FILE1="/home/juanjo/Java/jaxb-ri/bin/Amazon.xml";
        final String _FILE2="/home/juanjo/Java/jaxb-ri/bin/Amazon.xsd";
        final String command_line="/home/juanjo/Java/jaxb-ri/bin/xjc.sh "+
                "-b /home/juanjo/Java/jaxb-ri/bin/Amazon.xjb "+
                "/home/juanjo/Java/jaxb-ri/bin/Amazon.xsd";
        try{
        
            SchemaDocument schemaDocument = generateSchema(new File(_FILE1));    
  
            StringWriter writer = new StringWriter();
            schemaDocument.save(writer, new XmlOptions().setSavePrettyPrint());
            writer.close();
  
            String xmlText = writer.toString();
            FileWriter fw  = new FileWriter(_FILE2);
            fw.write(xmlText);
            fw.flush();
            fw.close();
            
            Process p = Runtime.getRuntime().exec(command_line);
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));            
            String line = null;
            while ((line = in.readLine())!=null){
                System.out.println(line);
            }
            //System.out.println(xmlText);
        }catch(IOException ioex){
            ioex.printStackTrace();
        }catch(XmlException xmlex){
            xmlex.printStackTrace();
        }
    }

    public SchemaDocument generateSchema(File inputFile) throws XmlException, IOException {
        return generateSchema(inputFile, XMLSchemaDesign.SALAMI_SLICE);
    }
  
    public SchemaDocument generateSchema(File inputFile, GenCode.XMLSchemaDesign design) throws XmlException, IOException {
        // Only 1 instance is required for now
        XmlObject[] xmlInstances = new XmlObject[1];
        xmlInstances[0] = XmlObject.Factory.parse(inputFile);
  
        return inst2xsd(xmlInstances, design);
    }
  
    public SchemaDocument generateSchema(InputStream is, XMLSchemaDesign design) throws XmlException, IOException {
        // Only 1 instance is required for now
        XmlObject[] xmlInstances = new XmlObject[1];
        xmlInstances[0] = XmlObject.Factory.parse(is);        
        return inst2xsd(xmlInstances, design);
    }
  
    public SchemaDocument generateSchema(String input) throws XmlException, IOException {
        return generateSchema(input, XMLSchemaDesign.VENETIAN_BLIND);
    }
  
    public SchemaDocument generateSchema(String input, XMLSchemaDesign design) throws XmlException, IOException {
        // Only 1 instance is required for now
        XmlObject[] xmlInstances = new XmlObject[1];
        xmlInstances[0] = XmlObject.Factory.parse(input);
  
        return inst2xsd(xmlInstances, design);
    }
  
    private SchemaDocument inst2xsd(XmlObject[] xmlInstances, XMLSchemaDesign design) throws IOException {
        Inst2XsdOptions inst2XsdOptions = new Inst2XsdOptions();
        if (design == null || design == XMLSchemaDesign.VENETIAN_BLIND) {
            inst2XsdOptions.setDesign(Inst2XsdOptions.DESIGN_VENETIAN_BLIND);
        } else if (design == XMLSchemaDesign.RUSSIAN_DOLL) {
            inst2XsdOptions.setDesign(Inst2XsdOptions.DESIGN_RUSSIAN_DOLL);
        } else if (design == XMLSchemaDesign.SALAMI_SLICE) {
            inst2XsdOptions.setDesign(Inst2XsdOptions.DESIGN_SALAMI_SLICE);
        }
  
        SchemaDocument[] schemaDocuments = Inst2Xsd.inst2xsd(xmlInstances, inst2XsdOptions);
        if (schemaDocuments != null && schemaDocuments.length > 0) {
            return schemaDocuments[0];
        }
  
        return null;
    }
    
    public static void main(String args[]){
        System.out.println("Juanjo Alejandro");
        new GenCode().run();
    }
    
}    