package com.spring26.section2.group14.newsportal.juhaer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;


public class UpToDateController
{
    @FXML
    private TextArea RecentTa;
    @FXML
    private ComboBox <String>SourcesCB;
    @FXML
    private ComboBox <String> CategoryCB;
    @FXML
    private TextArea TrendingTA;
    @FXML
    private TextArea ReadersTA;
    @FXML
    private TextArea LatestTA;
    @FXML
    private TextArea TopicTA;
    @FXML
    private ComboBox <String>TopicCB;
    @FXML
    private TextArea SummaryTA;
    private Object trendingTopic;

    @FXML
    public void initialize() {
        SourcesCB.getItems().addAll("Reuters", "AP News", "BBC", "Local Gazette");
        CategoryCB.getItems().addAll("Technology", "Weather", "Finance", "Politics");
        TopicCB.getItems().addAll("Daily Brief", "Breaking News", "Weekly Recap");


    }

    @FXML
    public void TrendingOA(ActionEvent actionEvent) {
        actionEvent.getClass();
    }

    @FXML
    public void RecentOA(ActionEvent actionEvent) {
        Object recentUpdate = new Object();
        getClass(recentUpdate);
    }

    @FXML
    public void RefreshOA(ActionEvent actionEvent) {
        if (SourcesCB.getValue() == null) {
            LatestTA.setText("No new updates at the moment"); // Required message
        } else {
            UpToDate latestNews = null;
            LatestTA.setText(new StringBuilder().append("Refreshed: ").append(latestNews.getHeadline()).toString());
            SummaryTA.setText("Notification: Feed updated based on " + SourcesCB.getValue());
        }
    }

    @FXML
    public void LAtestOA(ActionEvent actionEvent) {
        Object latestNews = new Object();
        getClass(latestNews);
    }

    private void getClass(Object latestNews) {
    }

    @FXML
    public void BacktoDash(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Subscriber.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}