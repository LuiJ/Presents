package com.santaclaus.presents.candies;

import com.santaclaus.presents.candies.properties.ChocoType;
import com.santaclaus.presents.candies.properties.FillingType;


public class ChocolateCandyWithFilling extends ChocolateCandy {
    
    public static final String TAG_FILLING_TYPE = "filling-type";
    
    private FillingType fillingType;
    
    public ChocolateCandyWithFilling(){}
    
    public ChocolateCandyWithFilling(String name, double weight, double price, 
            ChocoType chocoType, FillingType fillingType)
    {
        super(name, weight, price, chocoType);
        this.fillingType = fillingType;
    }

    public FillingType getFillingType() {
        return fillingType;
    }

    public void setFillingType(FillingType fillingType) {
        this.fillingType = fillingType;
    }
    
}
