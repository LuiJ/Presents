package com.santaclaus.presents.candies;


public class ChocolateCandy extends AbstractCandy {
    
    public final String TAG_CHOCO_TYPE = "choco-type";
    
    public static enum ChocoType {
        Dark, Milk, White
    }
    private ChocoType chocoType; 
    
    public ChocolateCandy(){}
    
    public ChocolateCandy(String name, double weight, double cost, ChocoType chocoType){   
        super(name, weight, cost);     
        this.chocoType = chocoType;
    } 

    public ChocoType getChocoType() {
        return chocoType;
    }

    public void setChocoType(ChocoType chocoType) {
        this.chocoType = chocoType;
    } 
    
}
