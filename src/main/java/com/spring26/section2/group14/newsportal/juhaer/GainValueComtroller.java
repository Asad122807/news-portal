package com.spring26.section2.group14.newsportal.juhaer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class GainValueComtroller
{
    @javafx.fxml.FXML
    private TableColumn<GainValue,String> PublisherRating;
    @javafx.fxml.FXML
    private TableColumn<GainValue,String> KeyMetricTC;
    @javafx.fxml.FXML
    private TableView <GainValue>PlatformTV;
    @javafx.fxml.FXML
    private TableColumn <GainValue,String> PublisherTC;
    @javafx.fxml.FXML
    private TableColumn <GainValue,String>StatusTC;
    @javafx.fxml.FXML
    private TableColumn <GainValue,String>ValueTC;
    @javafx.fxml.FXML
    private ComboBox <String>UpdateCB;
    @javafx.fxml.FXML
    private ComboBox <String>SourceCB;
    @javafx.fxml.FXML
    private PieChart PIE;
    @javafx.fxml.FXML
    private TableColumn <GainValue,String>AuthorTC;

    @javafx.fxml.FXML
    public void initialize() {
        PublisherRating.setCellValueFactory(new PropertyValueFactory<>("PublisherRating"));
        KeyMetricTC.setCellValueFactory(new PropertyValueFactory<>("KeyMetric"));
        PublisherTC.setCellValueFactory(new PropertyValueFactory<>("Publisher"));
        KeyMetricTC.setCellValueFactory(new PropertyValueFactory<>("KeyMetric"));
        StatusTC.setCellValueFactory(new PropertyValueFactory<>("Status"));
        ValueTC.setCellValueFactory(new PropertyValueFactory<>("Value"));
        AuthorTC.setCellValueFactory(new PropertyValueFactory<>("Author"));
        UpdateCB.getItems().addAll("Internal Staff", "User Feedback", "Automatic Scan");
        SourceCB.getItems().addAll("High Confidence", "Moderate", "Pending Audit");
        ObservableList<PieChart.Data> usageData = FXCollections.observableArrayList(
                new PieChart.Data("Positive Feedback", 60),
                new PieChart.Data("Needs Improvement", 25),
                new PieChart.Data("Critical", 15)
        );
        PIE.setData(usageData);


    }

    @javafx.fxml.FXML
    public void SubmitOA(ActionEvent actionEvent) {
        String selectedSource = SourceCB.getValue();
        String selectedRating = UpdateCB.getValue();

        if (selectedSource == null || selectedRating == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Please select both a Source Filter and a Rating level.");
            alert.show();
            return;
        }

        PIE.getData().add(new PieChart.Data("New Verification: " + selectedSource, 10));

        PlatformTV.getItems().add(new GainValue("System", selectedSource, selectedRating, "Verified Now"));
    }

    @javafx.fxml.FXML
    public void BacktoDashboardOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Subscriber.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}