package com.santaclaus.presents.parser;

import com.santaclaus.presents.candies.AbstractCandy;
import com.santaclaus.presents.candies.LollipopCandy;
import java.util.Properties;


public class LollipopCandyBuilder extends AbstractCandyBuilder {
    
    @Override
    public LollipopCandy build(Properties candyProperties){
        
        LollipopCandy candy = (LollipopCandy) super.build(candyProperties);
        
        LollipopCandy.TasteType tasteType = LollipopCandy.TasteType
                .valueOf(candyProperties.getProperty(LollipopCandy.TAG_TASTE_TYPE));
        
        candy.setTasteType(tasteType);
        
        return candy;
        
    }  
    
    @Override
    protected AbstractCandy createSpecificCandy(){
        return new LollipopCandy();
    }
    
    
}
