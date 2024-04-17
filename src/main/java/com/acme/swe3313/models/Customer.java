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
    private  String fullAddress = getStreetAddress()+", "+getCity()+", "+getState()+", "+getZip();
    private String customerId;
    private String name;
    private String store;
    private String phone;

    public String getBeerLicense(){return license;}
    public String getName(){return name;}
    public String getStore(){return store;}
    public void setStore(String storeSet){store=storeSet;}
    public String getCustomerId(){return customerId;}
    public String getCity(){return city;}
    public void setCity(String citySet){city=citySet;}
    public int getZip(){return zip;}
    public String getState(){return state;}
    public String getStreetAddress(){return streetAddress;}

    public String getFullAddress(){return fullAddress;}
    public String getPhone(){return phone;}
    public void setPhone(String phoneNum){phone=phoneNum;}

    public Customer(String n, String sT, String l, String sA, String c, String s, String dock, String phoneNum){
        name=n;
        store=sT;
        license=l;

        /**generating unique customer ID*/
        StringBuilder prefix = new StringBuilder(" ");
        StringBuilder storeId = new StringBuilder(" ");
        String[] storeSplit = store.split(" ");
        for(int i=0; i< storeSplit.length; i++){
            if(storeSplit[i].equalsIgnoreCase("the")){
                prefix.append(storeSplit[i].toUpperCase());
            }
            else{
                prefix.append(storeSplit[i].charAt(0));}
        }
        storeId.append(prefix+"_");
        for(int i=0; i<(12-prefix.length()); i++){
            storeId.append(rand.nextInt(9));
        }
        customerId= String.valueOf(storeId);
        /***/

        //zip=0;   **keep just in case zip is needed**
        streetAddress=sA;
        city=c;
        state=s;
        dockCapabilities=dock;
        phone=phoneNum;
    }

}
