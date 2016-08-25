package com.santaclaus.presents.creator;

import com.santaclaus.presents.candies.AbstractCandy;
import com.santaclaus.presents.candies.ChocolateCandyWithFilling;
import com.santaclaus.presents.candies.properties.ChocoType;
import com.santaclaus.presents.candies.properties.FillingType;
import com.santaclaus.presents.present.Present;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class PresentCreatorXmlTest {

    private static final double DOUBLE_COMPARISON_DELTA = 0.01;
    

    private final static String  presentXml =  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                                        +       "<present>"
                                        +           "<candy type=\"chocolateWithFilling\">"
                                        +               "<name>Gryliazh</name>"
                                        +               "<weight>2.3</weight>"
                                        +               "<price>2.5</price>"
                                        +               "<choco-type>Dark</choco-type>"
                                        +               "<filling-type>Waffles</filling-type>"
                                        +           "</candy>"
                                        +       "</present>";


    @Test
    public void testCreatePresentFromXml(){

        Present present = createPresent();

        List<AbstractCandy> candies = present.getCandies();
        Assert.assertEquals(1, candies.size());

        AbstractCandy candy = candies.get(0);
        Assert.assertTrue(candy instanceof ChocolateCandyWithFilling);
        
        String actualName = candy.getName();
        Assert.assertEquals("Gryliazh", actualName);
        
        double actualWeight = candy.getWeight();
        Assert.assertEquals(2.3, actualWeight, DOUBLE_COMPARISON_DELTA);
        
        double actualPrice = candy.getPrice();
        Assert.assertEquals(2.5, actualPrice, DOUBLE_COMPARISON_DELTA);

        ChocolateCandyWithFilling chocolateCandy = (ChocolateCandyWithFilling)candy;

        ChocoType actualChocoType = chocolateCandy.getChocoType();
        Assert.assertEquals(ChocoType.Dark, actualChocoType);
        
        FillingType actualFillingType = chocolateCandy.getFillingType();
        Assert.assertEquals(FillingType.Waffles, actualFillingType);
    }

    private Present createPresent() {
        InputStream presentInputStream = new ByteArrayInputStream(presentXml.getBytes(StandardCharsets.UTF_8));
        PresentCreatorXml presentCreator = new PresentCreatorXml(presentInputStream);
        return presentCreator.create();
    }
    
}
