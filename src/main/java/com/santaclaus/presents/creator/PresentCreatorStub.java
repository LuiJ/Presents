package com.santaclaus.presents.creator;

import com.santaclaus.presents.candies.AbstractCandy;
import com.santaclaus.presents.candies.ChocolateCandy;
import com.santaclaus.presents.candies.ChocolateCandyWithFilling;
import com.santaclaus.presents.candies.LollipopCandy;
import com.santaclaus.presents.candies.LollipopCandyWithFilling;
import com.santaclaus.presents.present.Present;


public class PresentCreatorStub implements PresentCreator {

    public Present create(){
        
        Present present = new Present();
        
        AbstractCandy darkChocoCandy = new ChocolateCandy("Arabian Hourse", 2.5, 1.45, ChocolateCandy.ChocoType.Dark);
        present.addCandy(darkChocoCandy);
        
        AbstractCandy whiteChocoCandyWithNuts = new ChocolateCandyWithFilling("Vaviorka", 3, 2.3, ChocolateCandy.ChocoType.White, ChocolateCandyWithFilling.FillingType.Nuts);
        present.addCandy(whiteChocoCandyWithNuts);
        
        AbstractCandy cocacolaLollipop = new LollipopCandy("Cupa Cups", 2.4, 1.3, LollipopCandy.TasteType.Cocacola);
        present.addCandy(cocacolaLollipop);
        
        AbstractCandy fruitLollipopWithGum = new LollipopCandyWithFilling("Cupa Cups XXL", 2.9, 2.8, LollipopCandy.TasteType.Fruits, LollipopCandyWithFilling.FillingType.Gum);
        present.addCandy(fruitLollipopWithGum);
        
        return present;
        
    }
    
}
