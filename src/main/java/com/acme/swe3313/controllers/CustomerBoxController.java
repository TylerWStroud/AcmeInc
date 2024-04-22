package com.acme.swe3313.controllers;
import com.acme.swe3313.Application;
import com.acme.swe3313.models.Customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class CustomerBoxController {

    @FXML
    private Label addressText;
    @FXML
    private HBox customerHBox;
    @FXML
    private Label dockCapabilitiesText;
    @FXML
    private Label licenseText;
    @FXML
    private Label nameText;
    @FXML
    private Label paymentMethText;

    public void setData(Customer customer){
    nameText.setText(customer.getStore());
    addressText.setText(customer.getStreetAddress());
    licenseText.setText(customer.getBeerLicense());
    paymentMethText.setText(customer.getPaymentMethod());
    dockCapabilitiesText.setText(customer.getDockCapabilities());

    customerHBox.setStyle("-fx-border-color: #"+ "transparent");
    }
}
