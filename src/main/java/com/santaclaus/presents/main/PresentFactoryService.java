package com.santaclaus.presents.main;

import com.santaclaus.presents.config.Config;
import com.santaclaus.presents.present.factory.PresentFactory;
import com.santaclaus.presents.present.factory.PresentFactoryStub;
import com.santaclaus.presents.present.factory.PresentFactoryXML;


public class PresentFactoryService {
    
    private final static int PRODUCT_FACTORY_STUB = 1;
    private final static int PRODUCT_FACTORY_XML = 2;

    public static PresentFactory getFactory(){
        
        Config config = Config.INSTANCE;   
        int factoryType = config.getFactoryType();
        String xmlFilePath = config.getXmlFilePath();
        
        PresentFactory factory = null;
        
        if (factoryType == PRODUCT_FACTORY_STUB){
            factory = new PresentFactoryStub();
        }
        else if (factoryType == PRODUCT_FACTORY_XML){
            factory = new PresentFactoryXML(xmlFilePath);
        }
        else {
            factory = new PresentFactoryStub();
        }
        
        return factory;
    }
    
}
