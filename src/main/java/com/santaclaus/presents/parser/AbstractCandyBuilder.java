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
        
        double cost = Double.parseDouble(candyProperties.getProperty(AbstractCandy.TAG_COST));      
        candy.setCost(cost);
        
        return candy;        
    }
    
    abstract protected AbstractCandy createSpecificCandy();
    
}
