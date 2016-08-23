package com.santaclaus.presents.logic;

import com.santaclaus.presents.candies.AbstractCandy;
import com.santaclaus.presents.present.Present;
import java.util.List;


public class PresentService {
    
    public double getTotalWeight(Present present){
        double totalWeight = 0;
        List<AbstractCandy> candies = present.getCandies();
        for (AbstractCandy candy : candies){
            totalWeight += candy.getWeight();
        }
        return totalWeight;
    }
    
    public double getTotalPrice(Present present){
        double totalPrice = 0;
        List<AbstractCandy> candies = present.getCandies();
        for (AbstractCandy candy : candies){
            totalPrice += candy.getPrice();
        }
        return totalPrice;
    }
    
}
