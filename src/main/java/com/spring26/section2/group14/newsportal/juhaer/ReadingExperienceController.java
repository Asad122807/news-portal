package com.spring26.section2.group14.newsportal.juhaer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ReadingExperienceController
{
    @FXML
    private TableView <ReadingExperience>TV;
    @FXML
    private Label OutputLabel;
    @FXML
    private PieChart ProgressPie;
    @FXML
    private TableColumn <ReadingExperience,String> StatusTC;
    @FXML
    private TextArea ArticleReaderTA;
    @FXML
    private TableColumn<ReadingExperience,Integer> RowsTC;

    @FXML
    public void initialize() {
        ProgressPie.getData().add(new PieChart.Data("Read", 70));
        ProgressPie.getData().add(new PieChart.Data("Unread", 30));
        StatusTC.setCellValueFactory(new PropertyValueFactory<>("Status"));
        RowsTC.setCellValueFactory(new PropertyValueFactory<>("Rows"));
        ArticleReaderTA.setText("Welcome to the News Portal Reader.\n\n" +
                "This section allows you to customize your reading experience. " +
                "You can zoom in to increase readability or zoom out for more content overview.");
    }

    @FXML
    public void ZoominOA(ActionEvent actionEvent) {
        int currentFontSize = 2;
        ArticleReaderTA.setStyle("-fx-font-size: " + currentFontSize + "px;");
        OutputLabel.setText("Zoom Level: " + currentFontSize);
    }

    @FXML
    public void ZoomoutOA(ActionEvent actionEvent) {
        int currentFontSize = 0;
        if (currentFontSize > 8) { // Prevent text from becoming invisible
            currentFontSize -= 2;
            ArticleReaderTA.setStyle("-fx-font-size: " + currentFontSize + "px;");
        }    OutputLabel.setText("Zoom Level: " + currentFontSize);
        
    }

    @FXML
    public void PageUpOA(ActionEvent actionEvent) {
        ArticleReaderTA.setScrollTop(ArticleReaderTA.getScrollTop() - 100);
        OutputLabel.setText("Scrolled Up");
    }

    @FXML
    public void PageDownOA(ActionEvent actionEvent) {
        ArticleReaderTA.setScrollTop(ArticleReaderTA.getScrollTop() + 100);
        OutputLabel.setText("Scrolled Down");
    }

    @FXML
    public void BackToDashboardOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Subscriber.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}