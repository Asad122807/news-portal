package com.spring26.section2.group14.newsportal.juhaer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ContentPublishingController
{
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TableView TV;
    @javafx.fxml.FXML
    private RadioButton Checklist2;
    @javafx.fxml.FXML
    private RadioButton Checklist1;
    @javafx.fxml.FXML
    private TableColumn CategoryTC;
    @javafx.fxml.FXML
    private TextField AssignedTF;
    @javafx.fxml.FXML
    private TableColumn TitleTC;
    @javafx.fxml.FXML
    private DatePicker PubTimeTF;
    @javafx.fxml.FXML
    private TableColumn DeadlineTC;
    @javafx.fxml.FXML
    private ComboBox CB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ScheduleOA(ActionEvent actionEvent) {
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