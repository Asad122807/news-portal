package com.spring26.section2.group14.newsportal.Asad;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class RemoveExpiredAdsController
{
    @javafx.fxml.FXML
    private TableColumn<AdvertisementData, String> advertiserNameColumn;
    @javafx.fxml.FXML
    private TableView<AdvertisementData> advertisementTableView;
    @javafx.fxml.FXML
    private TableColumn<AdvertisementData, String> adTitleColumn;
    @javafx.fxml.FXML
    private TableColumn<AdvertisementData, String> platformColumn;
    @javafx.fxml.FXML
    private TableColumn<AdvertisementData, String> budgetColumn;
    @javafx.fxml.FXML
    private TableColumn<AdvertisementData, String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<AdvertisementData, String> serialNoColumn;
    @javafx.fxml.FXML
    private Label statusLabel;

    private ObservableList<AdvertisementData> advertisementList;

    @javafx.fxml.FXML
    public void initialize() {

        serialNoColumn.setCellValueFactory(new PropertyValueFactory<>("serialNo"));
        adTitleColumn.setCellValueFactory(new PropertyValueFactory<>("adTitle"));
        advertiserNameColumn.setCellValueFactory(new PropertyValueFactory<>("advertiserName"));
        platformColumn.setCellValueFactory(new PropertyValueFactory<>("platform"));
        budgetColumn.setCellValueFactory(new PropertyValueFactory<>("budget"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        advertisementList = FXCollections.observableArrayList(
                new AdvertisementData("1", "Summer Sale Banner", "Aarong", "Facebook", "25000", "Expired"),
                new AdvertisementData("2", "Mobile Offer Campaign", "Robi", "YouTube", "60000", "Active"),
                new AdvertisementData("3", "Travel Discount Promo", "ShareTrip", "Instagram", "45000", "Expired"),
                new AdvertisementData("4", "Laptop Exchange Offer", "Star Tech", "Facebook", "70000", "Approved"),
                new AdvertisementData("5", "Eid Cashback Ad", "bKash", "YouTube", "90000", "Expired")
        );

        advertisementTableView.setItems(advertisementList);

        statusLabel.setVisible(true);
        statusLabel.setText("Select an expired advertisement and click Remove Expired.");
        statusLabel.setStyle("-fx-text-fill: green;");
    }

    @javafx.fxml.FXML
    public void removeButton(ActionEvent actionEvent) {
        AdvertisementData selectedAd = advertisementTableView.getSelectionModel().getSelectedItem();

        if (selectedAd == null) {
            statusLabel.setVisible(true);
            statusLabel.setText("Please select an advertisement first.");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        if (!selectedAd.getStatus().equalsIgnoreCase("Expired")) {
            statusLabel.setVisible(true);
            statusLabel.setText("Only expired advertisements can be removed.");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        advertisementList.remove(selectedAd);

        statusLabel.setVisible(true);
        statusLabel.setText("Expired advertisement removed successfully.");
        statusLabel.setStyle("-fx-text-fill: green;");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/spring26/section2/group14/newsportal/Asad/AdvertisementExecutiveDashboard.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}