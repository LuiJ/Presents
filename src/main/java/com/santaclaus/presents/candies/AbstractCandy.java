package com.santaclaus.presents.candies;


public abstract class AbstractCandy {
    
    private double weight;
    private double cost;
    
    public AbstractCandy(){}
    
    public AbstractCandy(double weight, double cost){
        this.weight = weight;
        this.cost = cost;
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
        return this.getClass().getSimpleName()+" --> weight: "+weight+"; cost: "+cost+";";
    }
}
