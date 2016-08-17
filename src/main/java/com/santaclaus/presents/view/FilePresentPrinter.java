package com.santaclaus.presents.view;

import com.santaclaus.presents.candies.AbstractCandy;
import com.santaclaus.presents.logic.PresentService;
import com.santaclaus.presents.present.Present;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class FilePresentPrinter implements PresentPrinter {
    
    private String path;
    
    public FilePresentPrinter(String path){
        this.path = path;
    }
    
    public void print(Present present){
        
        StringBuilder result = new StringBuilder();
        
        List<AbstractCandy> candies = present.getCandies();
        
        for (AbstractCandy candy : candies){
            result.append(candy+"\n");
        }
        
        PresentService calculator = new PresentService();
        
        double totalWeight = calculator.getTotalWeight(present);
        result.append("\nPresent Total weight: "+totalWeight+"\n");
        
        double totalCost = calculator.getTotalCost(present);
        result.append("\nPresent Total Cost: "+totalCost);
        
        char[] buffer = new char[result.length()];
        result.getChars(0, result.length(), buffer, 0);
        
        try (FileWriter file = new FileWriter(path)){
            file.write(buffer);
        }
        catch (IOException e){
            System.out.println("\nFile '"+path+"' is unavailable !");
        }       
        
    }
    
}
