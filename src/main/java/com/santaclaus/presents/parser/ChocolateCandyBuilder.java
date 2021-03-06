package com.santaclaus.presents.parser;

import com.santaclaus.presents.candies.AbstractCandy;
import com.santaclaus.presents.candies.ChocolateCandy;
import com.santaclaus.presents.candies.properties.ChocoType;
import java.util.Properties;


public class ChocolateCandyBuilder extends AbstractCandyBuilder {
    
    @Override
    public ChocolateCandy build(Properties candyProperties){
        
        ChocolateCandy candy = (ChocolateCandy) super.build(candyProperties);
        
        ChocoType chocoType = ChocoType
        .valueOf(candyProperties.getProperty(ChocolateCandy.TAG_CHOCO_TYPE));
        
        candy.setChocoType(chocoType);
        
        return candy;
        
    }
    
    @Override
    protected AbstractCandy createSpecificCandy(){
        return new ChocolateCandy();
    }
    
}
