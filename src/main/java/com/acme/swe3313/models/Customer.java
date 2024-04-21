package com.acme.swe3313.models;

import java.util.Random;

//import org.json.simple.JSONObject;

public class Customer {
    Random rand = new Random();
    private int[] beerLicense = new int[9];
    private String license;
    private int zip;
    private String state;
    private String city;
    private String streetAddress;
    private  String dockCapabilities;
    private  String fullAddress = getStreetAddress()+", "+getCity()+", "+getState()+", "+getZip();
    private String customerId;
    private String name;
    private String store;
    private String phone;

    public String getBeerLicense(){return license;}
    public void setBeerLicense(String setLicense){license=setLicense;}
    public String getName(){return name;}
    public String getStore(){return store;}
    public void setStore(String storeSet){store=storeSet;}
    public String getCustomerId(){return customerId;}
    public void setCustomerId(String iD){customerId=iD;}
    public String getCity(){return city;}
    public void setCity(String citySet){city=citySet;}
    public void setDockCapabilities(String dock){dockCapabilities=dock;}
    public int getZip(){return zip;}
    public String getState(){return state;}
    public String getStreetAddress(){return streetAddress;}

    //commit test
    public String getFullAddress(){return fullAddress;}
    public String getPhone(){return phone;}
    public void setPhone(String phoneNum){phone=phoneNum;}

    public Customer(String n, String sT, String sA, String c, String s, String phoneNum){
        name=n;
        store=sT;

        // Create a unique customer ID
        StringBuilder prefix = new StringBuilder();
        StringBuilder storeId = new StringBuilder();
        String[] storeSplit = store.split(" ");
        for(int i=0; i< storeSplit.length; i++){
            if(storeSplit[i].equalsIgnoreCase("the")){
                prefix.append(storeSplit[i].toUpperCase());
            }
            else{
                prefix.append(storeSplit[i].charAt(0));}
        }
        storeId.append(prefix+"_");
        for(int i=0; i<(14-prefix.length()); i++){
            storeId.append(rand.nextInt(9));
        }
        customerId= String.valueOf(storeId);

        streetAddress=sA;
        city=c;
        state=s;
        dockCapabilities=" ";
        phone=phoneNum;
    }
    public static void importToCustomerJSON(Customer customer){

    }

}
