package com.acme.swe3313.controllers;
import com.acme.swe3313.Application;
import com.acme.swe3313.models.Customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;


public class CustomersController {
    @FXML
    protected void initialize() {
        for (Customer c : Application.customers) {
            updateCustomersView(c);
            // Tyler: Add for each customer, a new table row dynamically.

            // WATCH https://www.youtube.com/watch?v=L3PLDAZWU9s&ab_channel=MahmoudHamwi
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

    public void updateCustomersView(Customer c) {
        nameTextField.setText(c.getName());
        addressTextField.setText(c.getStreetAddress());
        licenseTextField.setText(c.getBeerLicense());
        payMethodTextField.setText(c.getPaymentMethod());

        customerHbox.getChildren().set(0, nameTextField);
        customerHbox.getChildren().set(1, addressTextField);
        customerHbox.getChildren().set(2, licenseTextField);
        customerHbox.getChildren().set(3, payMethodTextField);
        customerHbox.setLayoutX(10.0);
    }
    @FXML
    private void onAddCustomer(ActionEvent event) throws IOException{
        Application.setScene("add-customer.fxml");
    }
}
