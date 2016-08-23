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
        
        try (FileWriter file = new FileWriter(path)){
            
            List<AbstractCandy> candies = present.getCandies();
        
            for (AbstractCandy candy : candies){
                String name = candy.getName();
                double weight = candy.getWeight();
                double price = candy.getPrice();
                file.write("Candy Name: "+name+" --> Weight: "+weight+"; Price: "+price+";\n");
            }
            
            PresentService calculator = new PresentService();
        
            double totalWeight = calculator.getTotalWeight(present);
            file.write("\nPresent Total Weight: "+totalWeight+"\n");

            double totalPrice = calculator.getTotalPrice(present);
            file.write("\nPresent Total Price: "+totalPrice);
            
            System.out.println("\nPresent info has been printed into '"+path+"'.\n");
        }
        catch (IOException e){
            e.printStackTrace();
        }               
        
    }
    
}
