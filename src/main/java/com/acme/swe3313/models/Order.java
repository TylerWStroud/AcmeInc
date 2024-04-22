package com.acme.swe3313.models;
import java.time.LocalDate;
import java.util.*;

public class Order {
    static int orderNum;
    private int startingNum = 600;
    private double orderTotal;
    private String salesRep, orderDate, orderStatus;
    Random ordID = new Random();

    // default constructor initializing all variables
    // and generating random order number
    public Order(){
        orderTotal = 0.0;
        salesRep = " ";
        this.orderDate = String.valueOf(LocalDate.now());
        orderStatus = "Not Ready";
        orderNum = ordID.nextInt(9000) + 300;
        // trying to get the type of order IDs we had
        // in the prototype in sprint 1
    }
    public void addItem(){
        // will take in a parameter not sure what yet

        /*
        * if going to work with hashmaps; take in customer ID as the key
        * value for hashmap will store what they want on their order
        * in that case parameter will be unique customer ID
        * */
    }

    public void removeItem(){
        // will also take in a parameter similar to that of the add method
        // what they want taken out could also be a parameter
        // ie this will be one of our values in the key-value pair
        // ie we take in the customer ID again and
        // use that to look up what needs to be taken out
    }

    public double calculateorderTotal(){
        // takes in customer ID maybe and adds everything from the
        // customer's most recent order to give grand total
        // could use more detail
        return 0.0;
    }

    public String orderDetails(){
        // takes in customer ID and retrieves
        // most recent order info, returns info as a string
        return " ";
    }

    public void cancelOrder(){
        // takes out a customer's ID as the key and searches
        // for the most recent value, this is what we take out
    }

    public void deliveryAddress(){
        // not sure if needed, but I have it just in case
    }
}


/*
 * Method Ideas
 * add_item(drink, quantity)
 * remove_item(drink)
 * update_quantity(drink, quantity)
 * calculate_total()
 * cancel_order()
 * get_order_details()
 * get_order_status()
 * set_delivery_address(address)
 * */