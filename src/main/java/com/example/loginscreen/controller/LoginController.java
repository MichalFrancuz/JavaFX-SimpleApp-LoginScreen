package com.example.loginscreen.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.jfoenix.controls.JFXButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton loginButton;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private TextField loginUsername;

    @FXML
    void initialize() {
        assert loginButton != null : "fx:id=\"loginButton\" was not injected: check your FXML file 'login.fxml'.";
        assert loginPassword != null : "fx:id=\"loginPassword\" was not injected: check your FXML file 'login.fxml'.";
        assert loginUsername != null : "fx:id=\"loginUsername\" was not injected: check your FXML file 'login.fxml'.";

        loginUsername.setStyle("-fx-text-inner-color: #050404");
        loginPassword.setStyle("-fx-text-inner-color: #050404");
        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Login was clicked");
            }
        });

    }
}