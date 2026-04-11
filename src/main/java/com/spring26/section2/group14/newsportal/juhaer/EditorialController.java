package com.spring26.section2.group14.newsportal.juhaer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class EditorialController
{
    @javafx.fxml.FXML
    private ComboBox <String> CategoryCB;
    @javafx.fxml.FXML
    private ComboBox<String> SelectCB;
    @javafx.fxml.FXML
    private DatePicker DateDP;
    @javafx.fxml.FXML
    private TextArea DescripTA;

    @javafx.fxml.FXML
    public void initialize() {
        CategoryCB.getItems().addAll("Language Tone", "Formatting Rules", "Citation Style", "Content Policies");
        SelectCB.getItems().addAll("Draft Guidelines 2026", "Archived Rules");
    }

    @javafx.fxml.FXML
    public void ValidateOA(ActionEvent actionEvent) {
        if (DescripTA.getText().isEmpty() || DateDP.getValue() == null || CategoryCB.getValue() == null) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Incomplete guideline information"); // Match error text
            return;
        }

        if (DescripTA.getText().length() < 20) {
            showAlert(Alert.AlertType.WARNING, "Validation Check", "Description seems too short to be effective.");
        } else {
            showAlert(Alert.AlertType.INFORMATION, "Validation Success", "Guidelines meet quality standards.");
        }
    }

    private void showAlert(Alert.AlertType alertType, String validationError, String incompleteGuidelineInformation) {
    }

    @javafx.fxml.FXML
    public void BackToDash(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ContentManager.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void ClearOA(ActionEvent actionEvent) {
        DescripTA.clear();
        DateDP.setValue(null);
        CategoryCB.setValue(null);
        SelectCB.setValue(null);
    }

    @javafx.fxml.FXML
    public void SaveOA(ActionEvent actionEvent) {
        if (DescripTA.getText().isEmpty() || DateDP.getValue() == null) {
            showAlert(Alert.AlertType.ERROR, "Save Error", "Cannot save incomplete guidelines.");
            return;
        }

        // Simulating Event 4: Save updated guidelines
        String currentTitle = (SelectCB.getValue() != null) ? SelectCB.getValue() : "New Guideline";
        Editorial newGuideline = new Editorial(
                currentTitle,
                CategoryCB.getValue(),
                DescripTA.getText(),
                DateDP.getValue()
        );
        Editorial.add(newGuideline);

        showAlert(Alert.AlertType.INFORMATION, "Success", "Guidelines Saved Successfully.");
    }
}