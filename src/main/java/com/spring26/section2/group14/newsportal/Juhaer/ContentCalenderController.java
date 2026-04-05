package com.spring26.section2.group14.newsportal.Juhaer;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ContentCalenderController
{
    @javafx.fxml.FXML
    private ComboBox PriorityCB;
    @javafx.fxml.FXML
    private TableView TV;
    @javafx.fxml.FXML
    private ComboBox CategoryCB;
    @javafx.fxml.FXML
    private Label conflictOutputLabel;
    @javafx.fxml.FXML
    private TableColumn ReportTC;
    @javafx.fxml.FXML
    private TextField TitleTF;
    @javafx.fxml.FXML
    private TableColumn TitleTC;
    @javafx.fxml.FXML
    private DatePicker DateDP;
    @javafx.fxml.FXML
    private DatePicker DeadlineDP;
    @javafx.fxml.FXML
    private TableColumn DeadlineTC;
    @javafx.fxml.FXML
    private TableColumn PriorityTC;
    @javafx.fxml.FXML
    private ComboBox ReporterCB;
    @javafx.fxml.FXML
    private Label MissingOutputLabel;
    @javafx.fxml.FXML
    private DatePicker ContentCalenderDP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ConfirmScheduleOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ADDorEDITOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void DashOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ContentManager.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}