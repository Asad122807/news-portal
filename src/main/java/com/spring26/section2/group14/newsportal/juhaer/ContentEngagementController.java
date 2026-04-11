package com.spring26.section2.group14.newsportal.juhaer;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class ContentEngagementController
{
    @javafx.fxml.FXML
    private TableView <ContentEngagement>TV;
    @javafx.fxml.FXML
    private TableColumn <ContentEngagement,Integer>LikesTC;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TextField ThumbnailURLTF;
    @javafx.fxml.FXML
    private TableColumn <ContentEngagement, LocalDate>ReadingTimeTC;
    @javafx.fxml.FXML
    private TableColumn <ContentEngagement,Integer>SharesTC;
    @javafx.fxml.FXML
    private TextField TagsCB;
    @javafx.fxml.FXML
    private TableColumn<ContentEngagement,String> CommentsTC;
    @javafx.fxml.FXML
    private TextField EditTF;
    @javafx.fxml.FXML
    private ComboBox <String>ArticleCB;
    @javafx.fxml.FXML
    private TableColumn <ContentEngagement,Integer>viewsTC;
    @javafx.fxml.FXML
    private TextArea SummaryTA;

    @javafx.fxml.FXML
    public void initialize() {
        LikesTC.setCellValueFactory(new PropertyValueFactory<>("LikesTC"));
        ReadingTimeTC.setCellValueFactory(new PropertyValueFactory<>("ReadingTimeTC"));
        SharesTC.setCellValueFactory(new PropertyValueFactory<>("SharesTC"));
        CommentsTC.setCellValueFactory(new PropertyValueFactory<>("CommentsTC"));
        ArticleCB.getItems().addAll("\"Global Climate Summit 2026\",\n" +
                "            \"Local Tech Startup Funding News\",\n" +
                "            \"Exploring the Future of AI in News\",\n" +
                "            \"Sports Update: Championship Highlights\",\n" +
                "            \"Editorial: The Shift in Digital Media\"");

    }

    @javafx.fxml.FXML
    public void PreviewUpdateOA(ActionEvent actionEvent) {
        if (ArticleCB.getValue() == null || TagsCB.getText().isEmpty() || ThumbnailURLTF.getText().isEmpty()) {
            OutputLabel.setText("Error: Fill all fields before previewing.");
            return;
        }
        ContentEngagement previewData = new ContentEngagement(1500, 245, "Great Read!", 42, "8 mins");

        TV.getItems().clear();
        TV.getItems().add(previewData);

        String summary = "Article: " + ArticleCB.getValue() + "\n" +
                "Tags: " + TagsCB.getText() + "\n" +
                "Thumbnail: " + ThumbnailURLTF.getText();
        SummaryTA.setText(summary);

        OutputLabel.setText("Preview generated successfully.");
    }

    @javafx.fxml.FXML
    public void RepublishORUpdateOA(ActionEvent actionEvent) {
        if (SummaryTA.getText().isEmpty()) {
            OutputLabel.setText("Please 'Preview' the update first.");
            return;
        }
        String finalTitle = EditTF.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Content Update");
        alert.setHeaderText(null);
        alert.setContentText("Article '" + finalTitle + "' has been successfully republished!");
        alert.showAndWait();
        EditTF.clear();
        TagsCB.clear();
        ThumbnailURLTF.clear();
        SummaryTA.clear();
        TV.getItems().clear();
        OutputLabel.setText("System: Content Published.");
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