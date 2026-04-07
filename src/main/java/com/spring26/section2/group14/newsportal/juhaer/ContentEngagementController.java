package com.spring26.section2.group14.newsportal.juhaer;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ContentEngagementController
{
    @javafx.fxml.FXML
    private TableView TV;
    @javafx.fxml.FXML
    private TableColumn LikesTC;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TextField ThumbnailURLTF;
    @javafx.fxml.FXML
    private TableColumn ReadingTimeTC;
    @javafx.fxml.FXML
    private TableColumn SharesTC;
    @javafx.fxml.FXML
    private TextField TagsCB;
    @javafx.fxml.FXML
    private TableColumn CommentsTC;
    @javafx.fxml.FXML
    private TextField EditTF;
    @javafx.fxml.FXML
    private ComboBox ArticleCB;
    @javafx.fxml.FXML
    private TableColumn viewsTC;
    @javafx.fxml.FXML
    private TextArea SummaryTA;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void PreviewUpdateOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RepublishORUpdateOA(ActionEvent actionEvent) {
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