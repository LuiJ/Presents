package com.santaclaus.presents.candies;


public class ChocolateCandyWithFilling extends ChocolateCandy {
    
    public static final String TAG_FILLING_TYPE = "filling-type";
    
    public static enum FillingType {
        Nuts, Waffles
    }
    
    private FillingType fillingType;
    
    public ChocolateCandyWithFilling(){}
    
    public ChocolateCandyWithFilling(String name, double weight, double cost, 
            ChocoType chocoType, FillingType fillingType)
    {
        super(name, weight, cost, chocoType);
        this.fillingType = fillingType;
    }

    public FillingType getFillingType() {
        return fillingType;
    }

    public void setFillingType(FillingType fillingType) {
        this.fillingType = fillingType;
    }
    
}
