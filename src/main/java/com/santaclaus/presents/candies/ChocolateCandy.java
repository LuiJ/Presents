package com.santaclaus.presents.candies;


public class ChocolateCandy extends AbstractCandy {
    
    public static final String TAG_CHOCO_TYPE = "choco-type";
    
    public static enum ChocoType {
        Dark, Milk, White
    }
    private ChocoType chocoType; 
    
    public ChocolateCandy(){}
    
    public ChocolateCandy(String name, double weight, double price, ChocoType chocoType){   
        super(name, weight, price);     
        this.chocoType = chocoType;
    } 

    public ChocoType getChocoType() {
        return chocoType;
    }

    public void setChocoType(ChocoType chocoType) {
        this.chocoType = chocoType;
    } 
    
}
