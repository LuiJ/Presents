package com.santaclaus.presents.parser;

import com.santaclaus.presents.candies.AbstractCandy;
import com.santaclaus.presents.candies.ChocolateCandyWithFilling;
import java.util.Properties;


public class ChocolateCandyWithFillingBuilder extends ChocolateCandyBuilder {
    
    @Override
    public ChocolateCandyWithFilling build(Properties candyProperties){
        
        ChocolateCandyWithFilling candy = (ChocolateCandyWithFilling) super.build(candyProperties);
        
        ChocolateCandyWithFilling.FillingType fillingType = ChocolateCandyWithFilling.FillingType
        .valueOf(candyProperties.getProperty(ChocolateCandyWithFilling.TAG_FILLING_TYPE));
        
        candy.setFillingType(fillingType);
        
        return candy;
        
    }
    
    @Override
    protected AbstractCandy createSpecificCandy(){
        return new ChocolateCandyWithFilling();
    }
    
}
    
    
