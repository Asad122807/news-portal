package com.spring26.section2.group14.newsportal.juhaer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class WritersController
{
    @javafx.fxml.FXML
    private DatePicker TaskDeadlineDP;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TextArea AnalysisOfDetailsTA;
    @javafx.fxml.FXML
    private TextField AssignedWriterTF;
    @javafx.fxml.FXML
    private TextField SendMassageTF;
    @javafx.fxml.FXML
    private TableView TV;
    @javafx.fxml.FXML
    private TableColumn TC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void CheckCoordinationOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SendButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void NorificationOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ConfirmCoordinationOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ViewRequestsOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void DashOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ContentManager.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}

