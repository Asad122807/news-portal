package com.spring26.section2.group14.newsportal.juhaer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.IOException;

public class ContentPerformanceController
{
    @javafx.fxml.FXML
    private TableView<ContentPerformance> TV;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TableColumn <ContentPerformance,String>CategoryTC;
    @javafx.fxml.FXML
    private ComboBox <String>CategoryCB;
    @javafx.fxml.FXML
    private TableColumn <ContentPerformance,String>StatusTC;
    @javafx.fxml.FXML
    private TableColumn <ContentPerformance,Integer> ViewsTC;
    @javafx.fxml.FXML
    private TableColumn <ContentPerformance,String>ReadersTC;
    @javafx.fxml.FXML
    private TableColumn <ContentPerformance,String>TitleTC;
    @javafx.fxml.FXML
    private ComboBox <String>TimeCB;

    @FXML
    public void initialize() {
        CategoryTC.setCellValueFactory(new PropertyValueFactory<>("CategoryTC"));
        CategoryCB.getItems().addAll("Breaking News", "Tech", "Sports", "Politics", "Lifestyle");
        TimeCB.getItems().addAll("Today", "Last 7 Days", "Last 30 Days", "All Time");
        StatusTC.setCellValueFactory(new PropertyValueFactory<>("StatusTC"));
        ViewsTC.setCellValueFactory(new PropertyValueFactory<>("ViewsTC"));
        TitleTC.setCellValueFactory(new PropertyValueFactory<>("TitleTC"));
        ReadersTC.setCellValueFactory(new PropertyValueFactory<>("ReadersTC"));

    }

    @javafx.fxml.FXML
    public void GeneratePerformanceOA(ActionEvent actionEvent) {
        String range = TimeCB.getValue();
        String cat = CategoryCB.getValue();

        if (range == null || cat == null) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Please select both a Time Range and a Category.");
            alert.show();
            return;
        }


        TV.getItems().clear();

        if (cat.equals("Tech")) {
            TV.getItems().add(new ContentPerformance("Best AI Tools 2026", "Tech", 15400, "Global Developers", "High Engagement"));
            TV.getItems().add(new ContentPerformance("Quantum Computing Intro", "Tech", 5200, "Students", "Stable"));
        } else if (cat.equals("Sports")) {
            TV.getItems().add(new ContentPerformance("Final Match Highlights", "Sports", 98000, "Sports Fans", "Viral"));
        } else {
            TV.getItems().add(new ContentPerformance("Featured Story: " + cat, cat, 2500, "General", "Normal"));
        }

        System.out.println("Report Generated for: " + cat + " (" + range + ")");
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