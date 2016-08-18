package com.santaclaus.presents.main;

import com.santaclaus.presents.present.factory.PresentCreater;
import com.santaclaus.presents.present.factory.PresentCreaterStub;
import com.santaclaus.presents.present.factory.PresentCreaterXML;


public class PresentCreaterFactory {
    
    private final static String PRODUCT_CREATER_STUB = "stub";
    private final static String PRODUCT_CREATER_XML = "xml";
    
    private String createrType;
    private String xmlFilePath;
    
    public PresentCreaterFactory(String createrType, String xmlFilePath){
        this.createrType = createrType;
        this.xmlFilePath = xmlFilePath;
    }

    public PresentCreater create(){
        
        PresentCreater factory = null;
        
        if (createrType.equals(PRODUCT_CREATER_STUB)){
            factory = new PresentCreaterStub();
        }
        else if (createrType.equals(PRODUCT_CREATER_XML)){
            factory = new PresentCreaterXML(xmlFilePath);
        }
        else {
            throw new IllegalArgumentException("Illegal value of 'present-data-source' param in 'configuration.properties' file.");
        }
        
        return factory;
    }
    
}
