package com.example.loginscreen.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.jfoenix.controls.JFXButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
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

        loginUsername.setStyle("-fx-text-inner-color: #050404");
        loginPassword.setStyle("-fx-text-inner-color: #050404");


        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                loginUser();
            }
        });

    }

    private void loginUser() {

        //Get the main window
        loginButton.getScene().getWindow().hide();

        if (!loginUsername.getText().toString().trim().equals("")
                && !loginPassword.getText().toString().trim().equals("")) {
            //ready to open next layout (page)

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/com/example/loginscreen/view/details.fxml"));
            try {
                loader.load();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            DetailsController detailsController = loader.getController();
            detailsController.setName(loginUsername.getText(), "Web and Mobile App Developer - Java, Swift, Kotlin, JavaScript", 1996);

            stage.show();

        }
    }
}