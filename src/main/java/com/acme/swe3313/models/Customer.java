package com.acme.swe3313.models;

import com.acme.swe3313.util.JSON;

import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

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
    private String deliveryConstraints;
    private  String fullAddress = getStreetAddress()+", "+getCity()+", "+getState()+", "+getZip();
    private String customerId;
    private String name;
    private String store;
    private int phone;

    public String getBeerLicense(){return license;}
    public String getName(){return name;}
    public String getStore(){return store;}
    public void setStore(String storeSet){store=storeSet;}
    public String getCity(){return city;}
    public void setCity(String citySet){city=citySet;}
    public int getZip(){return zip;}
    public String getState(){return state;}
    public String getStreetAddress(){return streetAddress;}

    public String getFullAddress(){return fullAddress;}

    public Customer(String n, String l, String sA, String c, String s, String dock){
        name=n;
        store=" ";
        license=l;
        /**
         * generating random license number per customer object
         *
        for(int i = 0; i< beerLicense.length-1; i++){
            beerLicense[i]= ThreadLocalRandom.current().nextInt(0,9);
        }
        for (int j : beerLicense) {
            license = license * 10 + j;
        }
        */
        //zip=0;   **keep just in case zip is needed**
        streetAddress=sA;
        city=c;
        state=s;
        dockCapabilities=" ";
        customerId=" ";
        phone=0;
    }

}
