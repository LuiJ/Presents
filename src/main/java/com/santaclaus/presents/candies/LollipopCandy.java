package com.santaclaus.presents.candies;


public class LollipopCandy extends AbstractCandy {

    public static enum TasteType {
        Cocacola, Fruits, Cake
    }
    
    private TasteType tasteType;
    
    public LollipopCandy(){} 
    
    public LollipopCandy(double weight, double cost, TasteType tasteType){   
        super(weight, cost);     
        this.tasteType = tasteType;
    } 

    public TasteType getTasteType() {
        return tasteType;
    }

    public void setTasteType(TasteType tasteType) {
        this.tasteType = tasteType;
    }
    
}
