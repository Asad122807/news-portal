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

public class ApproveArticleController
{
    @javafx.fxml.FXML
    private TableColumn<ApproveArticleData, String> articleTitleColumn;
    @javafx.fxml.FXML
    private TableColumn<ApproveArticleData, String> revisedColumn;
    @javafx.fxml.FXML
    private TableView<ApproveArticleData> articleTableView;
    @javafx.fxml.FXML
    private TableColumn<ApproveArticleData, String> writerColumn;
    @javafx.fxml.FXML
    private TableColumn<ApproveArticleData, String> serialNoColumn;
    @javafx.fxml.FXML
    private Label statusLabel;

    private ObservableList<ApproveArticleData> articleList;

    @javafx.fxml.FXML
    public void initialize() {

        serialNoColumn.setCellValueFactory(new PropertyValueFactory<>("serialNo"));
        articleTitleColumn.setCellValueFactory(new PropertyValueFactory<>("articleTitle"));
        revisedColumn.setCellValueFactory(new PropertyValueFactory<>("revised"));
        writerColumn.setCellValueFactory(new PropertyValueFactory<>("writer"));

        articleList = FXCollections.observableArrayList(
                new ApproveArticleData("1", "Flood relief reaches Kurigram villages", "Yes", "Nabila Islam"),
                new ApproveArticleData("2", "New metro rail schedule announced for commuters", "Yes", "Sakib Hasan"),
                new ApproveArticleData("3", "University admission process begins next week", "No", "Farzana Rahman"),
                new ApproveArticleData("4", "City hospital opens emergency dengue support desk", "Yes", "Mehedi Karim"),
                new ApproveArticleData("5", "Local farmers report rise in vegetable production", "No", "Tasnia Noor")
        );

        articleTableView.setItems(articleList);

        statusLabel.setVisible(true);
        statusLabel.setText("Select an article and click Approve.");
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

    @javafx.fxml.FXML
    public void approveButton(ActionEvent actionEvent) {
        ApproveArticleData selectedArticle = articleTableView.getSelectionModel().getSelectedItem();

        if (selectedArticle == null) {
            statusLabel.setVisible(true);
            statusLabel.setText("Please select an article first.");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        if (selectedArticle.getRevised().equalsIgnoreCase("No")) {
            statusLabel.setVisible(true);
            statusLabel.setText("This article cannot be approved yet because it is not revised.");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        statusLabel.setVisible(true);
        statusLabel.setText("Article \"" + selectedArticle.getArticleTitle() + "\" approved successfully.");
        statusLabel.setStyle("-fx-text-fill: green;");
    }
}