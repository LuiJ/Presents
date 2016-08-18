package com.santaclaus.presents.config;

import java.util.ResourceBundle;


public enum Config {
    
    INSTANCE;
    
    private final String CONFIGURATION_FILE_NAME = "cofiguration";
    private final String PRINTER_TYPE = "printer";
    private final String FILE_PATH = "output-file";
    private final String CREATOR_TYPE = "present-data-source";
    private final String XML_FILE_PATH = "data-file";
    
    private String printerType;
    private String filePath;    
    private String creatorType;
    private String xmlFilePath;
    
    Config(){
        ResourceBundle config = ResourceBundle.getBundle(CONFIGURATION_FILE_NAME); 
        printerType = config.getString(PRINTER_TYPE);
        filePath = config.getString(FILE_PATH);
        creatorType = config.getString(CREATOR_TYPE);
        xmlFilePath = config.getString(XML_FILE_PATH);
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

    public String getCreatorType() {
        return creatorType;
    }

    public void setCreatorType(String creatorType) {
        this.creatorType = creatorType;
    }

    public String getXmlFilePath() {
        return xmlFilePath;
    }

    public void setXmlFilePath(String xmlFilePath) {
        this.xmlFilePath = xmlFilePath;
    } 
    
}
