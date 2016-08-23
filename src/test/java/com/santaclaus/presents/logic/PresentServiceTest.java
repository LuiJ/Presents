package com.santaclaus.presents.logic;

import com.santaclaus.presents.candies.AbstractCandy;
import com.santaclaus.presents.candies.ChocolateCandy;
import com.santaclaus.presents.candies.LollipopCandy;
import com.santaclaus.presents.present.Present;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class PresentServiceTest {
    
    private static final double DOUBLE_COMPARISON_DELTA = 0.01;
    private static Present present;    
    private static PresentService unitUnderTest;
    
    @BeforeClass
    public static void prepareTest(){
        unitUnderTest = new PresentService();
        present = new Present();        
        AbstractCandy chocoCandy = new ChocolateCandy("Vaverka", 2.5, 3.5, ChocolateCandy.ChocoType.White);
        present.addCandy(chocoCandy);        
        AbstractCandy lollipopCandy = new LollipopCandy("Cupa Cups", 1.3, 2.7, LollipopCandy.TasteType.Cake);
        present.addCandy(lollipopCandy);
    } 
    
    @Test
    public void testGetTotalWeight(){
        double expectedTotalWeight = 3.8;
        double actualTotalWeight = unitUnderTest.getTotalWeight(present);
        Assert.assertEquals(expectedTotalWeight, actualTotalWeight, DOUBLE_COMPARISON_DELTA);    
    }   
    
    @Test
    public void testGetTotalPrice(){        
        double expectedTotalPrice = 6.2;
        double actualTotalPrice = unitUnderTest.getTotalPrice(present);
        Assert.assertEquals(expectedTotalPrice, actualTotalPrice, DOUBLE_COMPARISON_DELTA);        
    }
    
}
