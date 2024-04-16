package com.acme.swe3313.controllers;

import com.acme.swe3313.Application;
import com.acme.swe3313.models.Customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
public class AddCustomerController {
    @FXML
    private TextField nameInput;
    @FXML
    private TextField addressInput;
    @FXML
    private TextField licenseInput;
    @FXML
    private TextField cardNumInput;
    @FXML
    private TextField cardExpInput;
    @FXML
    private TextField cardCvvInput;
    @FXML
    private TextField dockCapabilitiesInput;
    @FXML
    private Button submitButton;
    @FXML
    private Button exitButton;

    String name;
    String address;
    String license;
    String cardNum;
    String cardExp;
    String cardCvv;
    String dockCapabilities;

    @FXML
    private void onExit(ActionEvent event) throws IOException{
        Application.setScene("customers-view.fxml");
    }
    @FXML
    private void onContinue(ActionEvent event) throws IOException {
        name = nameInput.getText();
        address = addressInput.getText();

        /** splitting the input address to be accessible for declaring street, city, state attributes*/
        String[] addy=address.split(",");
        String streetAddress=addy[0];
        String city=addy[1];
        String state=addy[2];
        /***/

        license = licenseInput.getText();
        cardNum = cardNumInput.getText();
        cardExp = cardExpInput.getText();
        cardCvv = cardCvvInput.getText();
        dockCapabilities = dockCapabilitiesInput.getText();

        Customer customer = new Customer(name, license, streetAddress, city, state, dockCapabilities);
    }
}
