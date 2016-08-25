package com.santaclaus.presents.parser;

import com.santaclaus.presents.candies.AbstractCandy;
import com.santaclaus.presents.candies.LollipopCandyWithFilling;
import com.santaclaus.presents.candies.properties.FillingType;
import java.util.Properties;


public class LollipopCandyWithFillingBuilder extends LollipopCandyBuilder {
      
    @Override
    public LollipopCandyWithFilling build(Properties candyProperties){
        
        LollipopCandyWithFilling candy = (LollipopCandyWithFilling) super.build(candyProperties);
        
        FillingType fillingType = FillingType.valueOf(candyProperties.getProperty(LollipopCandyWithFilling.TAG_FILLING_TYPE));
        
        candy.setFillingType(fillingType);
        
        return candy;
        
    }
    
    @Override
    protected AbstractCandy createSpecificCandy(){
        return new LollipopCandyWithFilling();
    }
    
}
    
