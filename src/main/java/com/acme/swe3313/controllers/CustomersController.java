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
    private Label pageCount;
    @FXML
    private Button addCustomerButton;
    @FXML
    private Button menuOptionsButton;
    @FXML
    private Button checkAllButton;
    @FXML
    private VBox customerPage;

    @FXML
    private void onAddCustomer(ActionEvent event) throws IOException{
        Application.setScene("add-customer.fxml");
    }
}
