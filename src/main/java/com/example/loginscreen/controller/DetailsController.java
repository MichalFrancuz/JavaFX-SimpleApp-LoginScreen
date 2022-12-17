package com.example.loginscreen.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import java.awt.*;

public class DetailsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label detailsAge;

    @FXML
    private Hyperlink detailsGitHub;

    @FXML
    private Hyperlink detailsLinkedIn;

    @FXML
    private Label detailsName;

    @FXML
    private Label detailsProfession;

    @FXML
    private Label detailsWelcomeLabel;

    @FXML
    void initialize() {

        detailsLinkedIn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(detailsLinkedIn.getText());
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/micha%C5%82-francuz-45499a110/"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (URISyntaxException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        detailsGitHub.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(detailsGitHub.getText());
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://github.com/MichalFrancuz"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (URISyntaxException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });


    }

    void setName(String name, String profession, int yearOfBirth) {
        detailsAge.setText("Year of birth: " + String.valueOf(yearOfBirth));

        detailsProfession.setText("Profession: " + profession);
        detailsWelcomeLabel.setText("Welcome " + name);
        detailsName.setText("Name: " + name);

    }

}
