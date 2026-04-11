package com.spring26.section2.group14.newsportal.juhaer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class HighQualityContentController
{
    @javafx.fxml.FXML
    private ComboBox <String>FIlterCB;
    @javafx.fxml.FXML
    private TableView<HighQualityContent> TV;
    @javafx.fxml.FXML
    private ComboBox <String>TagCB;
    @javafx.fxml.FXML
    private TableColumn <HighQualityContent,String>PublisherTC;
    @javafx.fxml.FXML
    private Label OutputLabelRecommend;
    @javafx.fxml.FXML
    private ComboBox <String>HomeFeedCB;
    @javafx.fxml.FXML
    private ComboBox <String>LangCB;
    @javafx.fxml.FXML
    private TableColumn <HighQualityContent,String>QualityTC;
    @javafx.fxml.FXML
    private TextField keywordTF;
    @javafx.fxml.FXML
    private TableColumn <HighQualityContent,String>ArticleTC;
    @javafx.fxml.FXML
    private Label OutputLabelitem;
    @javafx.fxml.FXML
    private TableColumn<HighQualityContent,String> AuthorTC;

    @javafx.fxml.FXML
    public void initialize() {
        FIlterCB.getItems().addAll("Most Recent", "Top Rated", "Editor's Choice");
        TagCB.getItems().addAll("AI", "Sustainability", "Politics", "Finance");
        HomeFeedCB.getItems().addAll("Global Feed", "Local News", "Personalized");
        LangCB.getItems().addAll("English", "Spanish", "Bengali", "French");
        PublisherTC.setCellValueFactory(new PropertyValueFactory<>("Publisher"));
        QualityTC.setCellValueFactory(new PropertyValueFactory<>("Quality"));
        ArticleTC.setCellValueFactory(new PropertyValueFactory<>("Article"));
        AuthorTC.setCellValueFactory(new PropertyValueFactory<>("Author"));

    }

    @javafx.fxml.FXML
    public void ExecuteBrowserOA(ActionEvent actionEvent) {
        TV.getItems().clear();
        String lang = (LangCB.getValue() != null) ? LangCB.getValue() : "English";

        TV.getItems().add(new HighQualityContent("The Future of AI", "5 Stars", "Juhaer", "Global Press"));
        TV.getItems().add(new HighQualityContent("Climate Change 2026", "4.8 Stars", "Smith", lang + " Daily"));

        OutputLabelRecommend.setText("Recommendations updated based on " + lang + ".");
    }

    @javafx.fxml.FXML
    public void UpdatePreferencesOA(ActionEvent actionEvent) {
        String pref = "Feed: " + HomeFeedCB.getValue() + ", Lang: " + LangCB.getValue();
        OutputLabelRecommend.setText("Preferences Saved: " + pref);
    }

    @javafx.fxml.FXML
    public void RecommandationsOA(ActionEvent actionEvent) {
        TV.getItems().clear();
        String lang = (LangCB.getValue() != null) ? LangCB.getValue() : "English";

        TV.getItems().add(new HighQualityContent("The Future of AI", "5 Stars", "Juhaer", "Global Press"));
        TV.getItems().add(new HighQualityContent("Climate Change 2026", "4.8 Stars", "Smith", lang + " Daily"));

        OutputLabelRecommend.setText("Recommendations updated based on " + lang + ".");
    }

    @javafx.fxml.FXML
    public void ItemDetailOA(ActionEvent actionEvent) {
        HighQualityContent selected = TV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            OutputLabelitem.setText("Details: " + selected.getArticle() + " by " + selected.getAuthor());
        } else {
            OutputLabelitem.setText("Please select an article from the table first.");
        }
    }

    @javafx.fxml.FXML
    public void BackToDashboardOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Subscriber.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}