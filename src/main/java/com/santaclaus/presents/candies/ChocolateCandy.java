package com.santaclaus.presents.candies;


public class ChocolateCandy extends AbstractCandy {
    
    public static enum ChocoType {
        Dark, Milk, White
    }
    private ChocoType chocoType; 
    
    public ChocolateCandy(){}
    
    public ChocolateCandy(double weight, double cost, ChocoType chocoType){   
        super(weight, cost);     
        this.chocoType = chocoType;
    } 

    public ChocoType getChocoType() {
        return chocoType;
    }

    public void setChocoType(ChocoType chocoType) {
        this.chocoType = chocoType;
    } 
    
}
