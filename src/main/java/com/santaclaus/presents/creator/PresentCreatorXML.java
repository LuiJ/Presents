package com.santaclaus.presents.creator;

import com.santaclaus.presents.candies.AbstractCandy;
import com.santaclaus.presents.parser.PresentHandler;
import com.santaclaus.presents.present.Present;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class PresentCreatorXML implements PresentCreator {
    
    private String xmlFilePath;    
    
    public PresentCreatorXML(String xmlFilePath){
        this.xmlFilePath = xmlFilePath;        
    }

    @Override
    public Present create(){
        
        Present present = new Present();
        
        try {        
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            PresentHandler handler = new PresentHandler();
            saxParser.parse(xmlFilePath, handler); 
            
            List<AbstractCandy> candies = handler.getCandies();
            for (AbstractCandy candy : candies){
                present.addCandy(candy);
            }            
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        
        
        return present;
        
    }
    
}
