package com.spring26.section2.group14.newsportal.juhaer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class PersonalizedContentController
{
    @javafx.fxml.FXML
    private TextField ImageTF;
    @javafx.fxml.FXML
    private ComboBox <String>CategoryCB;
    @javafx.fxml.FXML
    private ComboBox <String>readingCB;
    @javafx.fxml.FXML
    private ComboBox <String>TimeRangeCB;
    @javafx.fxml.FXML
    private DatePicker DateDP;
    @javafx.fxml.FXML
    private TableColumn <PersonalizedContent,String>ArticleTC;
    @javafx.fxml.FXML
    private TableColumn <PersonalizedContent,String>MetricsTC;
    @javafx.fxml.FXML
    private TextArea FormattingTA;
    @javafx.fxml.FXML
    private ComboBox <String>intrestsCB;
    @javafx.fxml.FXML
    private TableView <PersonalizedContent>ArticlePerfTV;
    @javafx.fxml.FXML
    private TableView <PersonalizedContent>EditorialTV;
    @javafx.fxml.FXML
    private TableColumn <PersonalizedContent,Integer>ViewsTC;
    @javafx.fxml.FXML
    private TextField contentTF;
    @javafx.fxml.FXML
    private PieChart ReportPie;
    @javafx.fxml.FXML
    private TextField headlineTF;
    @javafx.fxml.FXML
    private TextField citationStyleTF;
    @javafx.fxml.FXML
    private TableColumn <PersonalizedContent,Integer>MebicsTC;

    @javafx.fxml.FXML
    public void initialize() {
        CategoryCB.getItems().addAll("Tech", "Politics", "Sports", "Health");
        readingCB.getItems().addAll("Daily Digest", "Weekly Wrap-up", "Breaking Only");
        TimeRangeCB.getItems().addAll("Last 24 Hours", "Last 7 Days", "Last Month");
        intrestsCB.getItems().addAll("AI", "Sustainability", "Global Economy");
        ArticleTC.setCellValueFactory(new PropertyValueFactory<>("Article"));
        MetricsTC.setCellValueFactory(new PropertyValueFactory<>("Metrics"));
        ViewsTC.setCellValueFactory(new PropertyValueFactory<>("Views"));
        MebicsTC.setCellValueFactory(new PropertyValueFactory<>("Mebics"));
        ReportPie.getData().add(new PieChart.Data("Engaged", 65));
        ReportPie.getData().add(new PieChart.Data("Bounced", 35));
    }

    @javafx.fxml.FXML
    public void CancalOA(ActionEvent actionEvent) {
        ImageTF.clear();
        headlineTF.clear();
        citationStyleTF.clear();
        FormattingTA.clear();
        contentTF.clear();
    }
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }
    @javafx.fxml.FXML
    public void AddOA(ActionEvent actionEvent) {
        if (headlineTF.getText().isEmpty() || citationStyleTF.getText().isEmpty()) {
            showAlert("Input Error", "Please fill Headline and Citation Style.");
            return;
        }
        String standard = "Tone: " + ImageTF.getText() + " | Style: " + citationStyleTF.getText();
        PersonalizedContent newEntry = new PersonalizedContent(headlineTF.getText(), 1500, 450, standard);
        EditorialTV.getItems().add(newEntry);
    }

    @javafx.fxml.FXML
    public void UserOA(ActionEvent actionEvent) {
        String filter = contentTF.getText();
        if (!filter.isEmpty()) {
            System.out.println("Applying User Filter: " + filter);
        }
    }

    @javafx.fxml.FXML
    public void GenerateOA(ActionEvent actionEvent) {
        if (TimeRangeCB.getValue() == null) {
            showAlert("Selection Missing", "Please select a Time Range first.");
            return;
        }

        ArticlePerfTV.getItems().clear();
        ArticlePerfTV.getItems().add(new PersonalizedContent("AI in 2026", 1500, 450, "High Engagement"));
        ArticlePerfTV.getItems().add(new PersonalizedContent("Eco Trends", 800, 120, "Moderate"));
        ReportPie.getData().get(0).setPieValue(80);
        ReportPie.getData().get(1).setPieValue(20);
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