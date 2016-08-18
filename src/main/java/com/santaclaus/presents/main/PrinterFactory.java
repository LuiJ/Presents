package com.santaclaus.presents.main;

import com.santaclaus.presents.view.ConsolePresentPrinter;
import com.santaclaus.presents.view.FilePresentPrinter;
import com.santaclaus.presents.view.PresentPrinter;


public class PrinterFactory {
    
    private final static String CONSOLE_PRINTER = "console";
    private final static String FILE_PRINTER = "file";
    
    private String filePath;
    
    public PrinterFactory(String filePath){
        this.filePath = filePath;
    }
    
    public PresentPrinter create(String printerType){
        
        PresentPrinter printer = null;
        
        if (printerType.equals(CONSOLE_PRINTER)){
            printer = new ConsolePresentPrinter();
        }
        else if (printerType.equals(FILE_PRINTER)){
            printer = new FilePresentPrinter(filePath);
        }
        else {
            throw new IllegalArgumentException("Illegal value of 'printer' param in 'configuration.properties' file.");
        }
        
        return printer;
    }
    
}
