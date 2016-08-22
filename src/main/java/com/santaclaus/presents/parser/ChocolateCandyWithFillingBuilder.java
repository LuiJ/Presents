package com.santaclaus.presents.parser;

import com.santaclaus.presents.candies.ChocolateCandyWithFilling;
import java.util.Properties;


public class ChocolateCandyWithFillingBuilder implements CandyBuilder {
    
    @Override
    public ChocolateCandyWithFilling build(Properties candyProperties){
        
//        ChocolateCandyWithFilling candy = (ChocolateCandyWithFilling) super.build(candyProperties);
//        
//        ChocolateCandyWithFilling.FillingType fillingType = ChocolateCandyWithFilling.FillingType
//                .valueOf(candyProperties.getProperty(candy.TAG_FILLING_TYPE));
//        
//        candy.setFillingType(fillingType);
//        
//        return candy;
        
        ChocolateCandyWithFilling candy = new ChocolateCandyWithFilling();
        
        String name = candyProperties.getProperty(candy.TAG_NAME);
        candy.setName(name);
        
        double weight = Double.parseDouble(candyProperties.getProperty(candy.TAG_WEIGHT));
        candy.setWeight(weight);
        
        double cost = Double.parseDouble(candyProperties.getProperty(candy.TAG_COST));      
        candy.setCost(cost);
        
        ChocolateCandyWithFilling.ChocoType chocoType = ChocolateCandyWithFilling.ChocoType
        .valueOf(candyProperties.getProperty(candy.TAG_CHOCO_TYPE));
        
        candy.setChocoType(chocoType);
        
        ChocolateCandyWithFilling.FillingType fillingType = ChocolateCandyWithFilling.FillingType
        .valueOf(candyProperties.getProperty(candy.TAG_FILLING_TYPE));
        
        candy.setFillingType(fillingType);
        
        return candy;
        
    }
    
}
