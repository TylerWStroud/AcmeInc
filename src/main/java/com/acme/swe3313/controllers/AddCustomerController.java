package com.acme.swe3313.controllers;

import com.acme.swe3313.Application;
import com.acme.swe3313.models.Customer;
import com.acme.swe3313.util.JSON;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
public class AddCustomerController {

    @FXML
    private TextField nameInput;
    @FXML
    private TextField addressInput;
    @FXML
    private TextField licenseInput;
    @FXML
    private TextField phoneNumberInput;
    @FXML
    private TextField cardNumInput;
    @FXML
    private TextField cardExpInput;
    @FXML
    private TextField cardCvvInput;
    @FXML
    private TextField dockCapabilitiesInput;
    @FXML
    private TextField storeNameInput;
    @FXML
    private Button submitButton;
    @FXML
    private Button exitButton;

    String store;
    String name;
    String address;
    String license;
    String cardNum;
    String cardExp;
    String cardCvv;
    String dockCapabilities;
    String phoneNumber;

    @FXML
    private void onExit(ActionEvent event) throws IOException{
        Application.setScene("customers-view.fxml");
    }
    @FXML
    private void onContinue(ActionEvent event) throws IOException {
        store = storeNameInput.getText();
        name = nameInput.getText();
        address = addressInput.getText();

        /** splitting the input address to be accessible for declaring street, city, state attributes*/
        String[] addy=address.split(",");
        String streetAddress=addy[0];
        String city=addy[1];
        String state=addy[2];
        /***/


        phoneNumber = phoneNumberInput.getText();
        license = licenseInput.getText();
        cardNum = cardNumInput.getText();
        cardExp = cardExpInput.getText();
        cardCvv = cardCvvInput.getText();
        dockCapabilities = dockCapabilitiesInput.getText();

        Customer customer = new Customer(name, store, license, streetAddress, city, state, dockCapabilities, phoneNumber );
        JSONObject newCustomer = new JSONObject();
        newCustomer.put("store", customer.getStore());
        newCustomer.put("customer ID", customer.getCustomerId());
        newCustomer.put("name", customer.getName());
        newCustomer.put("address", customer.getStreetAddress());
        newCustomer.put("city", customer.getCity());
        newCustomer.put("state", customer.getState());
        newCustomer.put("phone", customer.getPhone());
        JSON.write("/customers.json", newCustomer);

        //JSON.write("/customers.json", JSONObject.);
        Application.setScene("customers-view.fxml");
    }
}
