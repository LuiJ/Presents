package com.santaclaus.presents.candies;


public abstract class AbstractCandy {
    
    private String name;
    private double weight;
    private double cost;
    
    public AbstractCandy(){}
    
    public AbstractCandy(String name, double weight, double cost){
        this.name = name;
        this.weight = weight;
        this.cost = cost;
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
   
    public void setCost(double cost){
        this.cost = cost;
    }
    public double getCost(){
        return cost;
    }
    
    @Override
    public String toString(){
        return "Candy Name: "+name+" --> Weight: "+weight+"; Cost: "+cost+";";
    }
}
