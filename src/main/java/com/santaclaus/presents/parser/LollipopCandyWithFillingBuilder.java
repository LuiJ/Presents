package com.santaclaus.presents.parser;

import com.santaclaus.presents.candies.AbstractCandy;
import com.santaclaus.presents.candies.LollipopCandyWithFilling;
import java.util.Properties;


public class LollipopCandyWithFillingBuilder extends LollipopCandyBuilder {
      
    @Override
    public LollipopCandyWithFilling build(Properties candyProperties){
        
        LollipopCandyWithFilling candy = (LollipopCandyWithFilling) super.build(candyProperties);
        
        LollipopCandyWithFilling.FillingType fillingType = LollipopCandyWithFilling.FillingType
                .valueOf(candyProperties.getProperty(LollipopCandyWithFilling.TAG_FILLING_TYPE));
        
        candy.setFillingType(fillingType);
        
        return candy;
        
    }
    
    @Override
    protected AbstractCandy createSpecificCandy(){
        return new LollipopCandyWithFilling();
    }
    
}
    
