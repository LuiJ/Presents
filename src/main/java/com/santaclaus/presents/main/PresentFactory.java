package com.santaclaus.presents.main;

import com.santaclaus.presents.candies.AbstractCandy;
import com.santaclaus.presents.candies.ChocolateCandy;
import com.santaclaus.presents.candies.ChocolateCandyWithFilling;
import com.santaclaus.presents.candies.LollipopCandy;
import com.santaclaus.presents.candies.LollipopCandyWithFilling;
import com.santaclaus.presents.present.Present;


public class PresentFactory {

    public static Present create(){
        
        Present present = new Present();
        
        AbstractCandy darkChocoCandy = new ChocolateCandy(2.5, 1.45, ChocolateCandy.ChocoType.Dark);
        present.addCandy(darkChocoCandy);
        
        AbstractCandy whiteChocoCandyWithNuts = new ChocolateCandyWithFilling(3, 2.3, ChocolateCandy.ChocoType.White, ChocolateCandyWithFilling.FillingType.Nuts);
        present.addCandy(whiteChocoCandyWithNuts);
        
        AbstractCandy cocacolaLollipop = new LollipopCandy(2.4, 1.3, LollipopCandy.TasteType.Cocacola);
        present.addCandy(cocacolaLollipop);
        
        AbstractCandy fruitLollipopWithJam = new LollipopCandyWithFilling(2.9, 2.8, LollipopCandy.TasteType.Fruits, LollipopCandyWithFilling.FillingType.Jem);
        present.addCandy(fruitLollipopWithJam);
        
        return present;
        
    }
    
}
