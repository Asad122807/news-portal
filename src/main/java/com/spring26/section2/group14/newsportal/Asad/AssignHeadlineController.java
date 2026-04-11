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

public class AssignHeadlineController {

    @javafx.fxml.FXML
    private TableColumn<HeadlineData, String> articleTitleColumn;
    @javafx.fxml.FXML
    private TableColumn<HeadlineData, String> headlineColumn;
    @javafx.fxml.FXML
    private TextField headlineTextField;
    @javafx.fxml.FXML
    private TableView<HeadlineData> articleTableView;
    @javafx.fxml.FXML
    private TableColumn<HeadlineData, String> writerColumn;
    @javafx.fxml.FXML
    private TableColumn<HeadlineData, String> serialNoColumn;
    @javafx.fxml.FXML
    private Label statusLabel;

    private ObservableList<HeadlineData> articleList;

    @javafx.fxml.FXML
    public void initialize() {

        serialNoColumn.setCellValueFactory(new PropertyValueFactory<>("serialNo"));
        articleTitleColumn.setCellValueFactory(new PropertyValueFactory<>("articleTitle"));
        writerColumn.setCellValueFactory(new PropertyValueFactory<>("writer"));
        headlineColumn.setCellValueFactory(new PropertyValueFactory<>("headline"));

        articleList = FXCollections.observableArrayList(
                new HeadlineData("1", "Flood relief reaches Kurigram villages", "Nabila Islam", "Relief support reaches remote villages"),
                new HeadlineData("2", "Metro rail schedule updated for commuters", "Sakib Hasan", "New metro schedule announced"),
                new HeadlineData("3", "University admission process starts next week", "Farzana Rahman", "Admission process begins soon"),
                new HeadlineData("4", "Dengue support desk opens at city hospital", "Mehedi Karim", "Hospital launches dengue desk")
        );

        articleTableView.setItems(articleList);

        articleTableView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, selectedArticle) -> {
            if (selectedArticle != null) {
                headlineTextField.setText(selectedArticle.getHeadline());
                statusLabel.setVisible(true);
                statusLabel.setText("Article selected. You can now assign a new headline.");
                statusLabel.setStyle("-fx-text-fill: blue;");
            }
        });

        statusLabel.setVisible(true);
        statusLabel.setText("Select an article and enter a headline.");
        statusLabel.setStyle("-fx-text-fill: green;");
    }

    @javafx.fxml.FXML
    public void clearButton(ActionEvent actionEvent) {
        headlineTextField.clear();
        articleTableView.getSelectionModel().clearSelection();

        statusLabel.setVisible(true);
        statusLabel.setText("Input cleared.");
        statusLabel.setStyle("-fx-text-fill: blue;");
    }

    @javafx.fxml.FXML
    public void saveHeadlineButton(ActionEvent actionEvent) {
        HeadlineData selectedArticle = articleTableView.getSelectionModel().getSelectedItem();

        if (selectedArticle == null) {
            statusLabel.setVisible(true);
            statusLabel.setText("Please select an article first.");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        String newHeadline = headlineTextField.getText();

        if (newHeadline == null || newHeadline.trim().isEmpty()) {
            statusLabel.setVisible(true);
            statusLabel.setText("Headline cannot be empty.");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        if (newHeadline.length() > 60) {
            statusLabel.setVisible(true);
            statusLabel.setText("Headline is too long. Keep it within 60 characters.");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        selectedArticle.setHeadline(newHeadline);
        articleTableView.refresh();

        statusLabel.setVisible(true);
        statusLabel.setText("Headline saved successfully.");
        statusLabel.setStyle("-fx-text-fill: green;");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/spring26/section2/group14/newsportal/Asad/EditorDashboard.fxml"));
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