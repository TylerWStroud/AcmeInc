package com.acme.swe3313.controllers;

import com.acme.swe3313.models.Associate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField emailInput;
    @FXML
    private TextField passwordInput;
    @FXML
    private Button submitButton;

    String email;
    String password;


    @FXML
    private void onSubmit(ActionEvent event) {
        email = emailInput.getText();
        password = passwordInput.getText();

        Associate associate = new Associate();

        try {
            if (associate.login(email, password)) {
                System.out.println("Login successful");
            } else {
                System.out.println("Login failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}