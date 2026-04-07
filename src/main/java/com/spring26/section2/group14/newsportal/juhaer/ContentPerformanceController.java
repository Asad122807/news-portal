package com.spring26.section2.group14.newsportal.juhaer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class ContentPerformanceController
{
    @javafx.fxml.FXML
    private TableView TV;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TableColumn CategoryTC;
    @javafx.fxml.FXML
    private ComboBox CategoryCB;
    @javafx.fxml.FXML
    private TableColumn StatusTC;
    @javafx.fxml.FXML
    private TableColumn ViewsTC;
    @javafx.fxml.FXML
    private TableColumn ReadersTC;
    @javafx.fxml.FXML
    private TableColumn TitleTC;
    @javafx.fxml.FXML
    private ComboBox TimeCB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void GeneratePerformanceOA(ActionEvent actionEvent) {
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