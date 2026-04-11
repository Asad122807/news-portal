package com.spring26.section2.group14.newsportal.juhaer;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
    private TableColumn RevisionrequestsTC;
    @javafx.fxml.FXML
    private TableColumn submittedarticleTC;
    @javafx.fxml.FXML
    private TableColumn pendingreviewsTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void checkOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ApproveOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void requestOA(ActionEvent actionEvent) {
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
