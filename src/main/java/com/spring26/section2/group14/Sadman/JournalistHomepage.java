package com.spring26.section2.group14.Sadman;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class JournalistHomepage
{
    @javafx.fxml.FXML
    private TextField userfield;
    @javafx.fxml.FXML
    private Button loginbuttonfield;
    @javafx.fxml.FXML
    private Button createbuttonfield;
    @javafx.fxml.FXML
    private TableView TableViewfield;
    @javafx.fxml.FXML
    private Label articleverificationlabelfield;
    @javafx.fxml.FXML
    private TextField idfield;

    @javafx.fxml.FXML
    public void initialize() {
        System.out.println("Journalist Homepage Initialized.");
    }

    @javafx.fxml.FXML
    public void CreateButtonOA(ActionEvent actionEvent) {
        String username = userfield.getText();
        String journalistId = idfield.getText();

        if (username.isEmpty() || journalistId.isEmpty()) {
            articleverificationlabelfield.setText("Error: Credentials cannot be empty.");
            articleverificationlabelfield.setStyle("-fx-text-fill: red;");
        } else {

            articleverificationlabelfield.setText("Welcome, " + username + " (ID: " + journalistId + ")");
            articleverificationlabelfield.setStyle("-fx-text-fill: green;");

            createbuttonfield.setDisable(false);
        }
    }

    @javafx.fxml.FXML
    public void loginOA(ActionEvent actionEvent) {
    }
}