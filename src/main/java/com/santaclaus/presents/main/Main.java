package com.santaclaus.presents.main;

import com.santaclaus.presents.config.Config;
import com.santaclaus.presents.present.Present;
import com.santaclaus.presents.present.factory.PresentCreater;
import com.santaclaus.presents.view.PresentPrinter;


public class Main {
    
    public static void main(String [] args){
        
        Config config = Config.INSTANCE;   
        String createrType = config.getCreaterType();
        String xmlFilePath = config.getXmlFilePath();
        
        PresentCreaterFactory createrFactory = new PresentCreaterFactory(createrType, xmlFilePath);        
        PresentCreater presentCreater = createrFactory.create();        
        Present present = presentCreater.create();
        
        String printerType = config.getPrinterType();
        String filePath = config.getFilePath();
        
        PrinterFactory printerFactory = new PrinterFactory(printerType, filePath);
        PresentPrinter printer = printerFactory.create();
        printer.print(present);
        
    }
    
}
