package com.santaclaus.presents.candies;


public class LollipopCandyWithFilling extends LollipopCandy {
    
    public static enum FillingType {
        Jem, Gum
    }
    
    private FillingType fillingType;
    
    public LollipopCandyWithFilling(){}
    
    public LollipopCandyWithFilling(String name, double weight, double cost, 
            TasteType tasteType, FillingType fillingType)
    {
        super(name, weight, cost, tasteType);
        this.fillingType = fillingType;
    }

    public FillingType getFillingType() {
        return fillingType;
    }

    public void setFillingType(FillingType fillingType) {
        this.fillingType = fillingType;
    }
    
}
