package com.santaclaus.presents.main;

import com.santaclaus.presents.view.ConsolePresentPrinter;
import com.santaclaus.presents.view.FilePresentPrinter;
import com.santaclaus.presents.view.MutiplePresentPrinter;
import com.santaclaus.presents.view.PresentPrinter;


public class PrinterFactory {
    
    private final static String CONSOLE_PRINTER = "console";
    private final static String FILE_PRINTER = "file";
    
    private String filePath;
    
    public PrinterFactory(String filePath){
        this.filePath = filePath;
    }
    
    public PresentPrinter create(String ... printerTypes){
        
        MutiplePresentPrinter multiplePrinter = new MutiplePresentPrinter();
        
        for (String printerType : printerTypes){
            if (printerType.equals(CONSOLE_PRINTER)){
                PresentPrinter consolePrinter = new ConsolePresentPrinter();
                multiplePrinter.addPrinter(consolePrinter);                
            }
            if (printerType.equals(FILE_PRINTER)){
                PresentPrinter filePrinter = new FilePresentPrinter(filePath);
                multiplePrinter.addPrinter(filePrinter);
            }
        }
        
        return multiplePrinter;
    }
    
}
