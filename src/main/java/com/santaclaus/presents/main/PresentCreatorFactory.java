package com.santaclaus.presents.main;

import com.santaclaus.presents.creator.PresentCreator;
import com.santaclaus.presents.creator.PresentCreatorStub;
import com.santaclaus.presents.creator.PresentCreatorXml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class PresentCreatorFactory {
    
    private final static String PRODUCT_CREATOR_STUB = "stub";
    private final static String PRODUCT_CREATOR_XML = "xml";
    
    private InputStream xmlFile;
    
    public PresentCreatorFactory(InputStream xmlFile){
        this.xmlFile = xmlFile;
    }
    
    public PresentCreatorFactory(String xmlFilePath){
        try {
            this.xmlFile = new FileInputStream(xmlFilePath);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public PresentCreator create(String creatorType){
        
        PresentCreator factory = null;
        
        if (creatorType.equals(PRODUCT_CREATOR_STUB)){
            factory = new PresentCreatorStub();
        }
        else if (creatorType.equals(PRODUCT_CREATOR_XML)){
            factory = new PresentCreatorXml(xmlFile);
        }
        else {
            throw new IllegalArgumentException("Illegal value of 'present-data-source' param in 'configuration.properties' file.");
        }
        
        return factory;
    }
    
}
