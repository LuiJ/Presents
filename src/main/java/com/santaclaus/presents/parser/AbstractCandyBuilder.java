package com.santaclaus.presents.parser;

import com.santaclaus.presents.candies.AbstractCandy;
import java.util.Properties;


public abstract class AbstractCandyBuilder {
    
    public AbstractCandy build(Properties candyProperties){
        
        AbstractCandy candy = createSpecificCandy();
        
        String name = candyProperties.getProperty(AbstractCandy.TAG_NAME);
        candy.setName(name);
        
        double weight = Double.parseDouble(candyProperties.getProperty(AbstractCandy.TAG_WEIGHT));
        candy.setWeight(weight);
        
        double price = Double.parseDouble(candyProperties.getProperty(AbstractCandy.TAG_PRICE));      
        candy.setPrice(price);
        
        return candy;        
    }
    
    abstract protected AbstractCandy createSpecificCandy();
    
}
