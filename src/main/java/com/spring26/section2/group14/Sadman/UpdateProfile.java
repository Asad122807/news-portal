package com.spring26.section2.group14.Sadman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

import java.util.Optional;

import static jdk.internal.org.jline.utils.Colors.s;

public class UpdateProfile
{
    @javafx.fxml.FXML
    private TextField newpasswordfield;
    @javafx.fxml.FXML
    private TextField usernamefield;
    @javafx.fxml.FXML
    private TextField passwordfield;
    private Object String;

    @javafx.fxml.FXML
    public void initialize() {
        usernamefield.setPromptText("Current Username");
        passwordfield.setPromptText("Current Password");
        newpasswordfield.setPromptText("New Password");
    }

    @javafx.fxml.FXML
    public void deleteOA(ActionEvent actionEvent) {
        String username = usernamefield.getText();
        String currentPass = passwordfield.getText();
        String newPass = newpasswordfield.getText();

        if (username.isEmpty() || currentPass.isEmpty() || newPass.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Form Incomplete", "Please fill in all fields to update your profile.");
            return;
        }

        System.out.println("Updating profile for " + username + "...");
        System.out.println("Password successfully changed to: " + newPass);

        showAlert(Alert.AlertType.INFORMATION, "Success", "Your profile has been updated.");
        clearFields();
    }

    private void showAlert(Alert.AlertType alertType, String success, String s) {
    }

    private void clearFields() {
        String username = usernamefield.getText();

        if (username.isEmpty()) {
            wait(Alert.AlertType.ERROR, "Error", "Please enter your username to confirm deletion.");
            return;
        }

        // Confirmation Dialog
        Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
        confirm.setTitle("Confirm Deletion");
        confirm.setHeaderText("Are you sure you want to delete your account?");
        confirm.setContentText("This action is permanent and cannot be undone.");

        Optional<ButtonType> result = confirm.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            // Logic to delete from Database (Simulated)
            System.out.println("Account for " + username + " has been deleted.");
            clearFields();
        }

        void showAlert (Alert.AlertType Object alertType;
        alertType, String Object success;
        success, String s){

        }
    }
    @FXML
    public void updateOA(ActionEvent actionEvent) {
    }

    private void wait(Alert.AlertType alertType, String error, String s) {

    }
}
