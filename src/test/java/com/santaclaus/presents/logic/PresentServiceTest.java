package com.santaclaus.presents.logic;

import static com.santaclaus.presents.candies.ChocolateCandy.*;
import static com.santaclaus.presents.candies.LollipopCandy.*;

import com.santaclaus.presents.candies.AbstractCandy;
import com.santaclaus.presents.candies.ChocolateCandy;
import com.santaclaus.presents.candies.LollipopCandy;
import com.santaclaus.presents.present.Present;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class PresentServiceTest {
    
    private static final double DOUBLE_COMPARISON_DELTA = 0.01;

    private static PresentService unitUnderTest = new PresentService();

    private static final List<AbstractCandy> CANDY_LIST = Arrays.asList(
            new ChocolateCandy("Vaverka", 2.5, 3.5, ChocolateCandy.ChocoType.White),
            new LollipopCandy("Cupa Cups", 1.3, 2.7, LollipopCandy.TasteType.Cake)
    );
    
    @Test
    public void testGetTotalWeight(){
        Present present = createPresent();
        double actualTotalWeight = unitUnderTest.getTotalWeight(present);
        Assert.assertEquals(3.8, actualTotalWeight, DOUBLE_COMPARISON_DELTA);
    }   
    
    @Test
    public void testGetTotalPrice(){
        Present present = createPresent();
        double actualTotalPrice = unitUnderTest.getTotalPrice(present);
        Assert.assertEquals(6.2, actualTotalPrice, DOUBLE_COMPARISON_DELTA);
    }

    private Present createPresent() {
        Present present = new Present();
        CANDY_LIST.forEach(present::addCandy);
        return present;
    }
    
}
