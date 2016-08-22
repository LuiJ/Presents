package com.santaclaus.presents.candies;


public class LollipopCandy extends AbstractCandy {

    public final String TAG_TASTE_TYPE = "taste-type";
    
    public static enum TasteType {
        Cocacola, Fruits, Cake
    }
    
    private TasteType tasteType;
    
    public LollipopCandy(){} 
    
    public LollipopCandy(String name, double weight, double cost, TasteType tasteType){   
        super(name, weight, cost);     
        this.tasteType = tasteType;
    } 

    public TasteType getTasteType() {
        return tasteType;
    }

    public void setTasteType(TasteType tasteType) {
        this.tasteType = tasteType;
    }
    
}
