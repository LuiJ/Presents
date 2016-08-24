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

        if (printerTypes.length == 0) {
            throw new IllegalArgumentException("Must specify non-empty array of printer types");
        }

        PresentPrinter printer;
        if (printerTypes.length == 1) {
            String type = printerTypes[0];
            printer = createPrinter(type);
        } else {
            MutiplePresentPrinter multiplePrinter = new MutiplePresentPrinter();
            for (String printerType : printerTypes){
                PresentPrinter childPrinter = createPrinter(printerType);
                multiplePrinter.addPrinter(childPrinter);

            }
            printer = multiplePrinter;
        }

        return printer;
    }

    private PresentPrinter createPrinter(String type) {
        switch (type) {
            case CONSOLE_PRINTER:
                return new ConsolePresentPrinter();
            case FILE_PRINTER:
               return new FilePresentPrinter(filePath);
            default:
                throw new IllegalArgumentException("Unknown printer type");
        }
    }
    
}
