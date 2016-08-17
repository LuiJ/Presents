package com.santaclaus.presents.main;

import com.santaclaus.presents.present.Present;
import com.santaclaus.presents.view.ConsolePresentPrinter;
import com.santaclaus.presents.view.FilePresentPrinter;
import com.santaclaus.presents.view.PresentPrinter;


public class Main {
    
    public static void main(String [] args){
    
        Present present = PresentFactory.create();        
        
        PresentPrinter consolePrinter = new ConsolePresentPrinter();        
        consolePrinter.print(present);
        
        PresentPrinter filePrinter = new FilePresentPrinter("D:/PresentInfo.txt");    
        filePrinter.print(present);
        
    }
    
}
