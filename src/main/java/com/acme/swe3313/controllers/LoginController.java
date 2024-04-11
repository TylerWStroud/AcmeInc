package com.acme.swe3313.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LoginController {
    @FXML
    private void onButtonAction(ActionEvent event) {
        System.out.println("Button clicked!");
    }

    @FXML
    private void onInputAction(ActionEvent event) {
        System.out.println("Input entered!");
    }

}