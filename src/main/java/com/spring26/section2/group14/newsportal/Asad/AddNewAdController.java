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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class AddNewAdController
{
    @javafx.fxml.FXML
    private TableColumn<AdvertisementData, String> advertiserNameColumn;
    @javafx.fxml.FXML
    private TextField serialNoTextField;
    @javafx.fxml.FXML
    private TableView<AdvertisementData> advertisementTableView;
    @javafx.fxml.FXML
    private TableColumn<AdvertisementData, String> adTitleColumn;
    @javafx.fxml.FXML
    private TableColumn<AdvertisementData, String> serialNoColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField platformTextField;
    @javafx.fxml.FXML
    private TextField budgetTextField;
    @javafx.fxml.FXML
    private TableColumn<AdvertisementData, String> platformColumn;
    @javafx.fxml.FXML
    private TableColumn<AdvertisementData, String> budgetColumn;
    @javafx.fxml.FXML
    private TableColumn<AdvertisementData, String> statusColumn;
    @javafx.fxml.FXML
    private TextField statusTextField;
    @javafx.fxml.FXML
    private TextField advertiserNameTextField;
    @javafx.fxml.FXML
    private TextField adTitleTextField;

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
                new AdvertisementData("1", "Eid Discount Campaign", "Daraz Bangladesh", "Facebook", "50000", "Pending"),
                new AdvertisementData("2", "New Smartphone Launch", "Samsung BD", "YouTube", "120000", "Approved"),
                new AdvertisementData("3", "Winter Clothing Sale", "Aarong", "Instagram", "35000", "Active")
        );

        advertisementTableView.setItems(advertisementList);

        statusLabel.setVisible(true);
        statusLabel.setText("Enter advertisement details and click Add.");
        statusLabel.setStyle("-fx-text-fill: green;");
    }

    @javafx.fxml.FXML
    public void clearButton(ActionEvent actionEvent) {
        serialNoTextField.clear();
        adTitleTextField.clear();
        advertiserNameTextField.clear();
        platformTextField.clear();
        budgetTextField.clear();
        statusTextField.clear();

        statusLabel.setVisible(true);
        statusLabel.setText("Input fields cleared.");
        statusLabel.setStyle("-fx-text-fill: blue;");
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

    @javafx.fxml.FXML
    public void addButton(ActionEvent actionEvent) {
        String serialNo = serialNoTextField.getText();
        String adTitle = adTitleTextField.getText();
        String advertiserName = advertiserNameTextField.getText();
        String platform = platformTextField.getText();
        String budget = budgetTextField.getText();
        String status = statusTextField.getText();

        if (serialNo.isEmpty() || adTitle.isEmpty() || advertiserName.isEmpty()
                || platform.isEmpty() || budget.isEmpty() || status.isEmpty()) {

            statusLabel.setVisible(true);
            statusLabel.setText("Please fill up all fields.");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        AdvertisementData newAd = new AdvertisementData(
                serialNo,
                adTitle,
                advertiserName,
                platform,
                budget,
                status
        );

        advertisementList.add(newAd);

        statusLabel.setVisible(true);
        statusLabel.setText("New advertisement added successfully.");
        statusLabel.setStyle("-fx-text-fill: green;");

        serialNoTextField.clear();
        adTitleTextField.clear();
        advertiserNameTextField.clear();
        platformTextField.clear();
        budgetTextField.clear();
        statusTextField.clear();
    }
}