package com.spring26.section2.group14.newsportal.juhaer;

import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ContentSourceController
{
    @javafx.fxml.FXML
    private TableColumn BadgeTC;
    @javafx.fxml.FXML
    private PieChart ArticlePie;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TableView TV;
    @javafx.fxml.FXML
    private TableColumn ViewsTC;
    @javafx.fxml.FXML
    private TableColumn RatingTC;
    @javafx.fxml.FXML
    private TableColumn NameTC;
    @javafx.fxml.FXML
    private PieChart TrafficPie;
    @javafx.fxml.FXML
    private DatePicker DP;
    @javafx.fxml.FXML
    private PieChart EngagementPie;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void GenerateOA(ActionEvent actionEvent) {
    }
}