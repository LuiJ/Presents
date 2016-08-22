package com.santaclaus.presents.parser;

import com.santaclaus.presents.candies.AbstractCandy;
import java.util.Properties;


public interface CandyBuilder {

    AbstractCandy build(Properties candyProperties);
    
}
