package com.santaclaus.presents.parser;

import com.santaclaus.presents.candies.LollipopCandy;
import java.util.Properties;


public class LollipopCandyBuilder implements CandyBuilder {
    
    @Override
    public LollipopCandy build(Properties candyProperties){
        
        LollipopCandy candy = new LollipopCandy();
        
        String name = candyProperties.getProperty(candy.TAG_NAME);
        candy.setName(name);
        
        double weight = Double.parseDouble(candyProperties.getProperty(candy.TAG_WEIGHT));
        candy.setWeight(weight);
        
        double cost = Double.parseDouble(candyProperties.getProperty(candy.TAG_COST));      
        candy.setCost(cost);
        
        LollipopCandy.TasteType tasteType = LollipopCandy.TasteType
                .valueOf(candyProperties.getProperty(candy.TAG_TASTE_TYPE));
        
        candy.setTasteType(tasteType);
        
        return candy;
        
    }    
    
    
}
