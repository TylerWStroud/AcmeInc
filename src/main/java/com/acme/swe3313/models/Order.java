package com.acme.swe3313.models;
import java.time.LocalDate;
import java.util.*;

public class Order {
    static int orderNum;
    private int startingNum = 600;
    private double orderTotal;
    private String salesRep, orderDate, orderStatus;
    Random ordID = new Random();

    public Order(){
        orderTotal = 0.0;
        salesRep = " ";
        this.orderDate = String.valueOf(LocalDate.now());
        orderStatus = "Not Ready";
        orderNum = ordID.nextInt(9000) + 300;
    }
    public void addItem(){
        // will take in a parameter not sure what yet
    }

    public void removeItem(){
        // will also take in a parameter similar to that of the add method
        // takes this out of the customer
    }

    public double calculateorderTotal(){
        // takes in customer name maybe and adds everything from the
        // customer's most recent order to give grand total
        return 0.0;
    }

    public String orderDetails(){
        // takes in customer info like company name and retrieves
        // most recent order info, returns info as a string
        return " ";
    }

    public void cancelOrder(){
        // takes out a customer's most recent order
    }

    public void deliveryAddress(){
        // not sure if needed, but I have it just in case
        // takes in an order parameter possibly and gives a delivery
        // address based on the customer input from the order
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