package com.santaclaus.presents.main;

import com.santaclaus.presents.present.Present;
import com.santaclaus.presents.present.factory.PresentFactory;
import com.santaclaus.presents.view.PresentPrinter;


public class Main {
    
    public static void main(String [] args){
        
        PresentFactory presentFactory = PresentFactoryService.getFactory();
        
        Present present = presentFactory.create();        
        
        PresentPrinter printer = PrinterFactory.create();
        printer.print(present);
        
    }
    
}
