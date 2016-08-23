package com.santaclaus.presents.candies;


public abstract class AbstractCandy {
        
    public static final String TAG_NAME = "name";
    public static final String TAG_WEIGHT = "weight";
    public static final String TAG_PRICE = "price";
    
    private String name;
    private double weight;
    private double price;
    
    public AbstractCandy(){}
    
    public AbstractCandy(String name, double weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }    
    public double getWeight(){
        return weight;
    }
   
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    
    @Override
    public String toString(){
        return "Candy Name: "+name+" --> Weight: "+weight+"; Price: "+price+";";
    }
}
