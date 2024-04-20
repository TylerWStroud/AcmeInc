package com.acme.swe3313.models;

public class Product {
    private boolean prodStatus;
    private int prodID;
    private String itemDescription;
    private String supplierName;
    private String brandName;
    private String subName;
    private String prodDescription;
    private String containerName;
    private String sizeDescription;
    private String extendedProdDescription;
    private String prodClassDescription;
    private int itemsOnHand;
    private int currSales;
    private int dateReceived;
    private int itemsOnOrder;

    public int getProdID(){return prodID;}
    public String getItemDescription(){return itemDescription;}
    public String getSupplierName(){return supplierName;}
    public String getBrandName(){return brandName;}
    public String getSubName(){return subName;}
    public String getProdDescription(){return prodDescription;}
    public String getContainerName(){return containerName;}
    public String getSizeDescription(){return sizeDescription;}
    public String getExtendedProdDescription(){return extendedProdDescription;}
    public String getProdClassDescription(){return prodClassDescription;}
    public int getItemsOnHand(){return itemsOnHand;}
    public int getCurrSales(){return currSales;}
    public int getDateReceived(){return dateReceived;}
    public int getItemsOnOrder(){return itemsOnOrder;}

    public Product(String ps, int pID,String iDescr, String supn, String bn, String subn, String pd,
    String cn, String sd, String epd, String pcd, int ioh, int cs, int dr, int ioo){
        //Check for product status while reading the products

        prodID = pID;
        itemDescription = iDescr;
        supplierName = supn;
        brandName = bn;
        subName = subn;
        prodDescription = pd;
        containerName = cn;
        sizeDescription = sd;
        extendedProdDescription = epd;
        prodClassDescription = pcd;
        itemsOnHand = ioh;
        currSales = cs;
        dateReceived = dr;
        itemsOnOrder = ioo;

    }
}