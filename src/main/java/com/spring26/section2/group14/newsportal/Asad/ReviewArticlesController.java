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

public class ReviewArticlesController
{
    @javafx.fxml.FXML
    private TableView<ArticleReviewStep> articleTableView;
    @javafx.fxml.FXML
    private TableColumn<ArticleReviewStep, String> eventColumn;
    @javafx.fxml.FXML
    private TableColumn<ArticleReviewStep, String> typeColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<ArticleReviewStep, String> descriptionColumn;

    @javafx.fxml.FXML
    public void initialize() {

        eventColumn.setCellValueFactory(new PropertyValueFactory<>("event"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));

        ObservableList<ArticleReviewStep> dummyList = FXCollections.observableArrayList(
                new ArticleReviewStep("Event 1", "Editor opens submitted article list", "UI"),
                new ArticleReviewStep("Event 2", "System shows all pending articles", "System"),
                new ArticleReviewStep("Event 3", "Editor selects an article", "UI"),
                new ArticleReviewStep("Event 4", "System loads article details", "System"),
                new ArticleReviewStep("Event 5", "Editor reviews the article", "Review")
        );

        articleTableView.setItems(dummyList);


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