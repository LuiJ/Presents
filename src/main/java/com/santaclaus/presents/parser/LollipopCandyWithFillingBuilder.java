package com.santaclaus.presents.parser;

import com.santaclaus.presents.candies.LollipopCandyWithFilling;
import java.util.Properties;


public class LollipopCandyWithFillingBuilder implements CandyBuilder {
      
    @Override
    public LollipopCandyWithFilling build(Properties candyProperties){
    
//        LollipopCandyWithFilling candy = (LollipopCandyWithFilling) super.build(candyProperties);
//        
//        LollipopCandyWithFilling.FillingType fillingType = LollipopCandyWithFilling.FillingType
//                .valueOf(candyProperties.getProperty(candy.TAG_FILLING_TYPE));
//        
//        candy.setFillingType(fillingType);
//        
//        return candy;
        
        LollipopCandyWithFilling candy = new LollipopCandyWithFilling();
        
        String name = candyProperties.getProperty(candy.TAG_NAME);
        candy.setName(name);
        
        double weight = Double.parseDouble(candyProperties.getProperty(candy.TAG_WEIGHT));
        candy.setWeight(weight);
        
        double cost = Double.parseDouble(candyProperties.getProperty(candy.TAG_COST));      
        candy.setCost(cost);
        
        LollipopCandyWithFilling.TasteType tasteType = LollipopCandyWithFilling.TasteType
                .valueOf(candyProperties.getProperty(candy.TAG_TASTE_TYPE));
        
        candy.setTasteType(tasteType);
        
        LollipopCandyWithFilling.FillingType fillingType = LollipopCandyWithFilling.FillingType
                .valueOf(candyProperties.getProperty(candy.TAG_FILLING_TYPE));
        
        candy.setFillingType(fillingType);
        
        return candy;
        
    }
    
}
