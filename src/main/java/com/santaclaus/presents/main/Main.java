package com.santaclaus.presents.main;

import com.santaclaus.presents.config.Config;
import com.santaclaus.presents.present.Present;
import com.santaclaus.presents.creator.PresentCreator;
import com.santaclaus.presents.view.PresentPrinter;


public class Main {
    
    public static void main(String [] args) {
        
        Config config = Config.INSTANCE;   
        String creatorType = config.getCreatorType();
        String xmlFilePath = config.getXmlFilePath();
        
        PresentCreatorFactory creatorFactory = new PresentCreatorFactory(xmlFilePath);        
        PresentCreator presentCreator = creatorFactory.create(creatorType);        
        Present present = presentCreator.create();
        
        String[] printerTypes = config.getPrinterTypes();       
        String filePath = config.getFilePath();
        
        PrinterFactory printerFactory = new PrinterFactory(filePath);
        PresentPrinter printer = printerFactory.create(printerTypes);
        printer.print(present);
        
    }
    
}
