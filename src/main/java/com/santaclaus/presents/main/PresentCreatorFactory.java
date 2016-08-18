package com.santaclaus.presents.main;

import com.santaclaus.presents.present.factory.PresentCreator;
import com.santaclaus.presents.present.factory.PresentCreatorStub;
import com.santaclaus.presents.present.factory.PresentCreatorXML;


public class PresentCreatorFactory {
    
    private final static String PRODUCT_CREATOR_STUB = "stub";
    private final static String PRODUCT_CREATOR_XML = "xml";
    
    private String xmlFilePath;
    
    public PresentCreatorFactory(String xmlFilePath){
        this.xmlFilePath = xmlFilePath;
    }

    public PresentCreator create(String creatorType){
        
        PresentCreator factory = null;
        
        if (creatorType.equals(PRODUCT_CREATOR_STUB)){
            factory = new PresentCreatorStub();
        }
        else if (creatorType.equals(PRODUCT_CREATOR_XML)){
            factory = new PresentCreatorXML(xmlFilePath);
        }
        else {
            throw new IllegalArgumentException("Illegal value of 'present-data-source' param in 'configuration.properties' file.");
        }
        
        return factory;
    }
    
}
