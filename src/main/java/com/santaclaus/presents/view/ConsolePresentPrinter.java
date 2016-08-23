package com.santaclaus.presents.view;

import com.santaclaus.presents.candies.AbstractCandy;
import com.santaclaus.presents.logic.PresentService;
import com.santaclaus.presents.present.Present;
import java.util.List;


public class ConsolePresentPrinter implements PresentPrinter {
    
    public void print(Present present){
        
        List<AbstractCandy> candies = present.getCandies();
        
        for (AbstractCandy candy : candies){
            String name = candy.getName();
            double weight = candy.getWeight();
            double price = candy.getPrice();
            System.out.println("Candy Name: "+name+" --> Weight: "+weight+"; Price: "+price+";");
        }
        
        PresentService calculator = new PresentService();
        
        double totalWeight = calculator.getTotalWeight(present);
        System.out.println("\nPresent Total Weight: "+totalWeight);
        
        double totalPrice = calculator.getTotalPrice(present);
        System.out.println("\nPresent Total Price: "+totalPrice);
        
    }
    
}
