package com.santaclaus.presents.config;

import java.util.ResourceBundle;


public enum Config {
    
    INSTANCE;
    
    private String printerType;
    private String filePath;    
    private String createrType;
    private String xmlFilePath;
    
    Config(){
        ResourceBundle config = ResourceBundle.getBundle("cofiguration"); 
        printerType = config.getString("printer");
        filePath = config.getString("output-file");
        createrType = config.getString("present-data-source");
        xmlFilePath = config.getString("data-file");
    }

    public String getPrinterType() {
        return printerType;
    }

    public void setPrinterType(String printerType) {
        this.printerType = printerType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getCreaterType() {
        return createrType;
    }

    public void setCreaterType(String createrType) {
        this.createrType = createrType;
    }

    public String getXmlFilePath() {
        return xmlFilePath;
    }

    public void setXmlFilePath(String xmlFilePath) {
        this.xmlFilePath = xmlFilePath;
    } 
    
}
