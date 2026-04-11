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

public class ContentSourceController
{
    @javafx.fxml.FXML
    private TableColumn<ContentSource,String> BadgeTC;
    @javafx.fxml.FXML
    private PieChart ArticlePie;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TableView<ContentSource> TV;
    @javafx.fxml.FXML
    private TableColumn<ContentSource,Integer> ViewsTC;
    @javafx.fxml.FXML
    private TableColumn <ContentSource,String>RatingTC;
    @javafx.fxml.FXML
    private TableColumn<ContentSource,String> NameTC;
    @javafx.fxml.FXML
    private PieChart TrafficPie;
    @javafx.fxml.FXML
    private DatePicker DP;
    @javafx.fxml.FXML
    private PieChart EngagementPie;
    @javafx.fxml.FXML
    private ComboBox <String>SoonCB;
    @javafx.fxml.FXML
    private ComboBox <String>DespitationCB;
    @javafx.fxml.FXML
    private ComboBox <String>AllMetricCB;

    @javafx.fxml.FXML
    public void initialize() {
        BadgeTC.setCellValueFactory(new PropertyValueFactory<>("BadgeTC"));
        ArticlePie.getData().addAll(
                new PieChart.Data("News", 40),
                new PieChart.Data("Blogs", 25),
                new PieChart.Data("Reports", 35)
        );
        ViewsTC.setCellValueFactory(new PropertyValueFactory<>("ViewsTC"));
        RatingTC.setCellValueFactory(new PropertyValueFactory<>("ViewsTC"));
        NameTC.setCellValueFactory(new PropertyValueFactory<>("NameTC"));
        TrafficPie.getData().addAll(
                new PieChart.Data("Facebook", 50),
                new PieChart.Data("Google", 30),
                new PieChart.Data("Direct", 20)
        );
        EngagementPie.getData().addAll(
                new PieChart.Data("Likes", 60),
                new PieChart.Data("Shares", 25),
                new PieChart.Data("Comments", 15)
        );
        SoonCB.getItems().addAll("Today", "This Week", "This Month");
        DespitationCB.getItems().addAll("All", "High", "Medium", "Low");
        AllMetricCB.getItems().addAll("Views", "Rating", "Engagement");

    }

    @javafx.fxml.FXML
    public void GenerateOA(ActionEvent actionEvent) {
            // Clear old data
            ArticlePie.getData().clear();
            TrafficPie.getData().clear();
            EngagementPie.getData().clear();
            TV.getItems().clear();

            // Sample Table Data
            TV.getItems().addAll(
                    new ContentSource("Article 1", 120, "4.5", "Gold"),
                    new ContentSource("Article 2", 80, "4.0", "Silver"),
                    new ContentSource("Article 3", 200, "5.0", "Platinum")
            );

            // Article Pie
            ArticlePie.getData().addAll(
                    new PieChart.Data("News", 50),
                    new PieChart.Data("Blogs", 30),
                    new PieChart.Data("Reports", 20)
            );

            // Traffic Pie
            TrafficPie.getData().addAll(
                    new PieChart.Data("Facebook", 40),
                    new PieChart.Data("Google", 35),
                    new PieChart.Data("Direct", 25)
            );

            // Engagement Pie
            EngagementPie.getData().addAll(
                    new PieChart.Data("Likes", 60),
                    new PieChart.Data("Shares", 25),
                    new PieChart.Data("Comments", 15)
            );

            // Output message
            OutputLabel.setText("Performance Report Generated!");
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
