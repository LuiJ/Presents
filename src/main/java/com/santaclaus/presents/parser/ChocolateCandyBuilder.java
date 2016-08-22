package com.santaclaus.presents.parser;

import com.santaclaus.presents.candies.ChocolateCandy;
import java.util.Properties;


public class ChocolateCandyBuilder implements CandyBuilder {
    
    @Override
    public ChocolateCandy build(Properties candyProperties){
        
        ChocolateCandy candy = new ChocolateCandy();
        
        String name = candyProperties.getProperty(candy.TAG_NAME);
        candy.setName(name);
        
        double weight = Double.parseDouble(candyProperties.getProperty(candy.TAG_WEIGHT));
        candy.setWeight(weight);
        
        double cost = Double.parseDouble(candyProperties.getProperty(candy.TAG_COST));      
        candy.setCost(cost);
        
        ChocolateCandy.ChocoType chocoType = ChocolateCandy.ChocoType
                .valueOf(candyProperties.getProperty(candy.TAG_CHOCO_TYPE));
        
        candy.setChocoType(chocoType);
        
        return candy;
        
    }
    
}
