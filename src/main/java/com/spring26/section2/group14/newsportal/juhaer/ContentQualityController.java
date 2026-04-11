package com.spring26.section2.group14.newsportal.juhaer;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ContentQualityController
{
    @javafx.fxml.FXML
    private TableView <ContentQuality>tableviewfield;
    @javafx.fxml.FXML
    private Label outputlabelfield;
    @javafx.fxml.FXML
    private TextField headlinetextfield;
    @javafx.fxml.FXML
    private TextArea contentTextAreafield;
    @javafx.fxml.FXML
    private ComboBox <String>coboboxfield;
    @javafx.fxml.FXML
    private TextArea sourceTextAreafield;
    @javafx.fxml.FXML
    private TextField authortextfield;
    @javafx.fxml.FXML
    private TableColumn<ContentQuality,String> RevisionrequestsTC;
    @javafx.fxml.FXML
    private TableColumn <ContentQuality,String>submittedarticleTC;
    @javafx.fxml.FXML
    private TableColumn <ContentQuality,String>pendingreviewsTC;

    @javafx.fxml.FXML
    public void initialize() {
        RevisionrequestsTC.setCellValueFactory(new PropertyValueFactory<>("RevisionrequestsTC"));
        submittedarticleTC.setCellValueFactory(new PropertyValueFactory<>("submittedarticleTC"));
        pendingreviewsTC.setCellValueFactory(new PropertyValueFactory<>("pendingreviewsTC"));
        coboboxfield.getItems().addAll("National", "International", "Sports", "Business");
    }

    @javafx.fxml.FXML
    public void checkOA(ActionEvent actionEvent) {
        if (headlinetextfield.getText().isEmpty()) {
            outputlabelfield.setText("Error: Headline is empty!");
            return;
        }

        ContentQuality entry = new ContentQuality(null, headlinetextfield.getText() + " (By: " + authortextfield.getText() + ")", null);
        tableviewfield.getItems().add(entry);
        outputlabelfield.setText("Article sent for Quality Check.");
    }

    @javafx.fxml.FXML
    public void ApproveOA(ActionEvent actionEvent) {
        if (headlinetextfield.getText().isEmpty()) {
            outputlabelfield.setText("Error: No article to approve.");
            return;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Approval Success");
        alert.setHeaderText(null);
        alert.setContentText("Article '" + headlinetextfield.getText() + "' has been approved for publishing!");
        alert.showAndWait();

        headlinetextfield.clear();
        authortextfield.clear();
        contentTextAreafield.clear();
        sourceTextAreafield.clear();
        outputlabelfield.setText("Status: Approved and Cleared.");

    }

    @javafx.fxml.FXML
    public void requestOA(ActionEvent actionEvent) {
        if (headlinetextfield.getText().isEmpty()) {
            outputlabelfield.setText("Error: Select an article first.");
            return;
        }
        ContentQuality entry = new ContentQuality(null, null, headlinetextfield.getText());
        tableviewfield.getItems().add(entry);
        outputlabelfield.setText("Revision requested for: " + headlinetextfield.getText());
    }
    @javafx.fxml.FXML
    public void DashOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ContentManager.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
