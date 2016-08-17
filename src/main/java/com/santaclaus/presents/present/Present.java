package com.santaclaus.presents.present;

import com.santaclaus.presents.candies.AbstractCandy;
import java.util.ArrayList;
import java.util.List;


public class Present {
    
    private List<AbstractCandy> candies;
    
    public Present(){
        candies = new ArrayList<AbstractCandy>();
    }

    public void addCandy(AbstractCandy candy) {
        candies.add(candy);
    }

    public List<AbstractCandy> getCandies() {
        return candies;
    }
    
}
