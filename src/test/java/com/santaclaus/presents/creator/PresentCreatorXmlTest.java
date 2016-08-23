package com.santaclaus.presents.creator;

import com.santaclaus.presents.candies.ChocolateCandyWithFilling;
import com.santaclaus.presents.present.Present;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class PresentCreatorXmlTest {
    
    private static final String EXPECTED_NAME = "Gryliazh";
    private static final double EXPECTED_WEIGHT = 2.3;
    private static final double EXPECTED_PRICE = 2.5;
    private static final ChocolateCandyWithFilling.ChocoType 
            EXPECTED_CHOCO_TYPE = ChocolateCandyWithFilling.ChocoType.Dark;
    private static final ChocolateCandyWithFilling.FillingType 
            EXPECTED_FILLING_TYPE = ChocolateCandyWithFilling.FillingType.Waffles;
    private static final double DOUBLE_COMPARISON_DELTA = 0.01;
    
    private static PresentCreatorXml unitUnderTest;
    private static String presentXml;
    
    @BeforeClass
    public static void prepareTest(){
        presentXml =    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                +       "<present>"
                +           "<candy type=\"chocolateWithFilling\">"
                +               "<name>"+EXPECTED_NAME+"</name>"
                +               "<weight>"+EXPECTED_WEIGHT+"</weight>"
                +               "<price>"+EXPECTED_PRICE+"</price>"
                +               "<choco-type>"+EXPECTED_CHOCO_TYPE+"</choco-type>"
                +               "<filling-type>"+EXPECTED_FILLING_TYPE+"</filling-type>"
                +           "</candy>"                
                +       "</present>";
        
        InputStream presentInputStream = new ByteArrayInputStream(presentXml
                                            .getBytes(StandardCharsets.UTF_8));
        
        unitUnderTest = new PresentCreatorXml(presentInputStream);        
    }
    
    
    @Test
    public void testCreatePresentFromXml(){
        Present actualPresent = unitUnderTest.create();
        ChocolateCandyWithFilling candy = (ChocolateCandyWithFilling) actualPresent.getCandies().get(0);
        
        String actualName = candy.getName();
        Assert.assertEquals(EXPECTED_NAME, actualName);
        
        double actualWeight = candy.getWeight();
        Assert.assertEquals(EXPECTED_WEIGHT, actualWeight, DOUBLE_COMPARISON_DELTA);
        
        double actualPrice = candy.getPrice();
        Assert.assertEquals(EXPECTED_PRICE, actualPrice, DOUBLE_COMPARISON_DELTA);
        
        ChocolateCandyWithFilling.ChocoType actualChocoType = candy.getChocoType();
        Assert.assertEquals(EXPECTED_CHOCO_TYPE, actualChocoType);
        
        ChocolateCandyWithFilling.FillingType actualFillingType = candy.getFillingType();
        Assert.assertEquals(EXPECTED_FILLING_TYPE, actualFillingType);
    }
    
}
