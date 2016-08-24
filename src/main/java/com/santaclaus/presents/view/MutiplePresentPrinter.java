package com.santaclaus.presents.view;

import com.santaclaus.presents.present.Present;
import java.util.ArrayList;
import java.util.List;


public class MutiplePresentPrinter implements PresentPrinter {
    
    private List<PresentPrinter> printers; 
    
    public MutiplePresentPrinter(){
        printers = new ArrayList<PresentPrinter>();
    }
    
    public void addPrinter(PresentPrinter printer){
        printers.add(printer);
    }
    
    @Override
    public void print(Present present){
        for (PresentPrinter printer : printers){
            printer.print(present);
        }
    }
    
}
