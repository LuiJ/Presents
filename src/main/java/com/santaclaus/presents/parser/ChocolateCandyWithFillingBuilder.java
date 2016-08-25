package com.santaclaus.presents.parser;

import com.santaclaus.presents.candies.AbstractCandy;
import com.santaclaus.presents.candies.ChocolateCandyWithFilling;
import com.santaclaus.presents.candies.properties.FillingType;
import java.util.Properties;


public class ChocolateCandyWithFillingBuilder extends ChocolateCandyBuilder {
    
    @Override
    public ChocolateCandyWithFilling build(Properties candyProperties){
        
        ChocolateCandyWithFilling candy = (ChocolateCandyWithFilling) super.build(candyProperties);
        
        FillingType fillingType = FillingType
        .valueOf(candyProperties.getProperty(ChocolateCandyWithFilling.TAG_FILLING_TYPE));
        
        candy.setFillingType(fillingType);
        
        return candy;
        
    }
    
    @Override
    protected AbstractCandy createSpecificCandy(){
        return new ChocolateCandyWithFilling();
    }
    
}
    
    
