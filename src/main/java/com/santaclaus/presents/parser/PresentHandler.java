package com.santaclaus.presents.parser;

import com.santaclaus.presents.candies.AbstractCandy;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class PresentHandler extends DefaultHandler {
    
    private static final String TAG_CANDY = "candy";    
    private static final String ATTRIBUTE_TYPE = "type";
    
    private boolean isTagCandy = false;
    private boolean isStartTag = false;
    private String tagName;
    private String candyType;
    private Properties candyProperties;
    private List<AbstractCandy> candies;

    public List<AbstractCandy> getCandies() {
        return candies;
    }  
    
    public PresentHandler(){
        this.candies = new ArrayList<AbstractCandy>();
    }

    @Override
    public void startElement(String uri, String localName,String tagName,
        Attributes attributes) throws SAXException 
    {
        isStartTag = true;
        this.tagName = tagName; 
        if (tagName.equalsIgnoreCase(TAG_CANDY)) { 
            candyProperties = new Properties();
            candyType = attributes.getValue(ATTRIBUTE_TYPE); 
            isTagCandy = true;
        }         
    }
    

    @Override
    public void endElement(String uri, String localName,
        String tagName) throws SAXException 
    {
        if (tagName.equalsIgnoreCase(TAG_CANDY)) {
            isTagCandy = false;
            AbstractCandy candy = CandyFactory.create(candyProperties, candyType);
            candies.add(candy);
        } 
    }
    

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        if (isTagCandy && isStartTag && !tagName.equalsIgnoreCase(TAG_CANDY)) {
            candyProperties.setProperty(tagName, new String(ch, start, length));
            isStartTag = false;
        }
    }
    
}
