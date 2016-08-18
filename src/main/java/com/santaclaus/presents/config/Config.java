package com.santaclaus.presents.config;

import java.util.ResourceBundle;


public enum Config {
    
    INSTANCE;
    
    private int printerType;
    private String filePath;    
    private int factoryType;
    private String xmlFilePath;
    
    Config(){
        ResourceBundle config = ResourceBundle.getBundle("cofiguration"); 
        printerType = Integer.parseInt(config.getString("printer"));
        filePath = config.getString("printer-url");
        factoryType = Integer.parseInt(config.getString("factiory"));
        xmlFilePath = config.getString("factory-xml-url");
    }

    public int getPrinterType() {
        return printerType;
    }

    public void setPrinterType(int printerType) {
        this.printerType = printerType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public int getFactoryType() {
        return factoryType;
    }

    public void setFactoryType(int factoryType) {
        this.factoryType = factoryType;
    }

    public String getXmlFilePath() {
        return xmlFilePath;
    }

    public void setXmlFilePath(String xmlFilePath) {
        this.xmlFilePath = xmlFilePath;
    } 
    
}
