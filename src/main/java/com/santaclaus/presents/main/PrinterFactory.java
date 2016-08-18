package com.santaclaus.presents.main;

import com.santaclaus.presents.config.Config;
import com.santaclaus.presents.view.ConsolePresentPrinter;
import com.santaclaus.presents.view.FilePresentPrinter;
import com.santaclaus.presents.view.PresentPrinter;


public class PrinterFactory {
    
    private final static int CONSOLE_PRINTER = 1;
    private final static int FILE_PRINTER = 2;
    
    public static PresentPrinter create(){
        
        Config config = Config.INSTANCE;        
        int printerType = config.getPrinterType();
        String filePath = config.getFilePath();
        
        PresentPrinter printer = null;
        
        if (printerType == CONSOLE_PRINTER){
            printer = new ConsolePresentPrinter();
        }
        else if (printerType == FILE_PRINTER){
            printer = new FilePresentPrinter(filePath);
        }
        else {
            printer = new ConsolePresentPrinter();
        }
        
        return printer;
    }
    
}
