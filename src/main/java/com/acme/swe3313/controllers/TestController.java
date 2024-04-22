package com.acme.swe3313.controllers;
import com.acme.swe3313.Application;
import com.acme.swe3313.models.Customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;

import static com.acme.swe3313.Application.customers;
import static com.acme.swe3313.Application.populateCustomers;

public class TestController {
    @FXML
    public static VBox customerVbox;

    @FXML
    protected void initialize() {
        for (Customer c : customers) {
            updateCustomersView();
            // Tyler: Add for each customer, a new table row dynamically.
        }
    }

    @FXML
    public static TextField nameTextField;
    @FXML
    public static TextField addressTextField;
    @FXML
    public static TextField licenseTextField;
    @FXML
    public static TextField payMethodTextField;
    public static void main(String[] args){
        //populateCustomers();
        updateCustomersView();
    }
    public static void updateCustomersView() {

        System.out.println(customerVbox.getChildren());
       /* nameTextField.setText(c.getName());
        addressTextField.setText(c.getStreetAddress());
        licenseTextField.setText(c.getBeerLicense());
        payMethodTextField.setText(c.getPaymentMethod());*/



    }
    @FXML
    private void onAddCustomer (ActionEvent event) throws IOException {
        Application.setScene("add-customer.fxml");
    }

}

