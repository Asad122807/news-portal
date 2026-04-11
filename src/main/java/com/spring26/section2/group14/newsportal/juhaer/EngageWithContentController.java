package com.spring26.section2.group14.newsportal.juhaer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class EngageWithContentController
{
    @javafx.fxml.FXML
    private TableView<EngageWithContent> TV;
    @javafx.fxml.FXML
    private TableColumn<EngageWithContent,String> Type;
    @javafx.fxml.FXML
    private ComboBox <String>ReadingCB;
    @javafx.fxml.FXML
    private Label OuputLabel;
    @javafx.fxml.FXML
    private TableColumn <EngageWithContent,String>Rating;
    @javafx.fxml.FXML
    private TableColumn <EngageWithContent,String>ContentItem;
    @javafx.fxml.FXML
    private TableColumn<EngageWithContent,LocalDate> Date;

    @javafx.fxml.FXML
    public void initialize() {
        Type.setCellValueFactory(new PropertyValueFactory<>("Type"));
        Rating.setCellValueFactory(new PropertyValueFactory<>("Rating"));
        ContentItem.setCellValueFactory(new PropertyValueFactory<>("ContentItem"));
        ReadingCB.getItems().addAll("Light Mode", "Dark Mode", "High Contrast");
        Date.setCellValueFactory(new PropertyValueFactory<>("Date"));
    }

    @javafx.fxml.FXML
    public void GenerateCB(ActionEvent actionEvent) {
        TV.getItems().clear();

        ObservableList<EngageWithContent> reportData = FXCollections.observableArrayList(
                new EngageWithContent("AI Revolution", LocalDate.now().minusDays(2), "Article", "5 Stars"),
                new EngageWithContent("Market Trends", LocalDate.now().minusDays(1), "Opinion", "4.5 Stars"),
                new EngageWithContent("Tech Podcast", LocalDate.now(), "Audio", "4.8 Stars")
        );

        TV.setItems(reportData);
        OuputLabel.setText("Status: Report Generated for " + reportData.size() + " items.");
    }

    @javafx.fxml.FXML
    public void BackToDashboardOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Subscriber.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}