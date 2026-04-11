package com.spring26.section2.group14.Sadman;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Subscription
{
    @javafx.fxml.FXML
    private DropdownButton subscriptiontypefield;
    @javafx.fxml.FXML
    private TextField Usernamefield;
    @javafx.fxml.FXML
    private Label labelverificationfield;
    @javafx.fxml.FXML
    private Button subscribefield;
    @javafx.fxml.FXML
    private TextField cardnumberfield;
    @javafx.fxml.FXML
    private TextField cvvfield;

    @javafx.fxml.FXML
    public void initialize() {
        subscriptiontypefield.setItems(FXCollections.observableArrayList(
                "Monthly - $9.99",
                "Quarterly - $24.99",
                "Yearly - $89.99"
        ));
        subscriptiontypefield.setPromptText("Select a Plan");
        labelverificationfield.setText("");
    }

    @javafx.fxml.FXML
    public void SubscribeOA(ActionEvent actionEvent) {
        String username = Usernamefield.getText().trim();
        String plan = subscriptiontypefield.getValue();
        String card = cardnumberfield.getText().trim();
        String cvv = cvvfield.getText().trim();
        if (username.isEmpty() || plan == null || card.isEmpty() || cvv.isEmpty()) {
            updateStatus("Error: All fields are required!", Color.RED);
            return;
        }

        if (!isValidCard(card, cvv)) {
            updateStatus("Error: Invalid Card or CVV format.", Color.RED);
            return;
        }

        System.out.println("Processing subscription for: " + username + " Plan: " + plan);
        updateStatus("Success! Subscription activated.", Color.GREEN);

        clearForm();
    }

    private boolean isValidCard(String card, String cvv) {
        return card.matches("\\d{16}") && cvv.matches("\\d{3}");
    }

    private void clearForm() {
        
    }

    private void updateStatus(String s, Color red) {
        
    }
}