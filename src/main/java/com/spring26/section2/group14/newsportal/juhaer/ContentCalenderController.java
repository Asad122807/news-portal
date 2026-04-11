package com.spring26.section2.group14.newsportal.juhaer;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class ContentCalenderController {
    @FXML
    private ComboBox<String> PriorityCB;
    @FXML
    private TableView<TableView> TV;
    @FXML
    private ComboBox<String> CategoryCB;
    @FXML
    private Label conflictOutputLabel;
    @FXML
    private TableColumn<TableView, String> ReportTC;
    @FXML
    private TextField TitleTF;
    @FXML
    private TableColumn<TableView, String> TitleTC;
    @FXML
    private DatePicker DateDP;
    @FXML
    private DatePicker DeadlineDP;
    @FXML
    private TableColumn<TableView, LocalDate> DeadlineTC;
    @FXML
    private TableColumn<TableView, String> PriorityTC;
    @FXML
    private ComboBox<String> ReporterCB;
    @FXML
    private Label MissingOutputLabel;
    @FXML
    private DatePicker ContentCalenderDP;

    @FXML
    public void initialize() {
        TV.getItems().addAll();
        PriorityCB.getItems().addAll("High", "Medium", "Low");
        CategoryCB.getItems().addAll("Breaking News,Feature Story,Op-Ed,Local,Events,Sports");
        ReportTC.setCellValueFactory(new PropertyValueFactory<>("ReportTC"));
        TitleTC.setCellValueFactory(new PropertyValueFactory<>("TitleTC"));
        DeadlineTC.setCellValueFactory(new PropertyValueFactory<>("DeadlineTC"));
        PriorityTC.setCellValueFactory(new PropertyValueFactory<>("PriorityTC"));
        ReporterCB.getItems().addAll("Staff Writer,Investigate Lead, Freelance Contributor,Senior Editor");

    }

    @FXML
    public void ConfirmScheduleOA(ActionEvent actionEvent) {
        String Title = TitleTF.getText();
        String Priority = PriorityCB.getItems().toString();
        LocalDate Deadline = DeadlineDP.getValue();
        String Report = ReporterCB.getItems().toString();

        if (TitleTF.isEditable()) {
            conflictOutputLabel.setText("Please Enter a Title");
            return;


        }
    }

    @FXML
    public void ADDorEDITOA(ActionEvent actionEvent) {
        String selected = "";
        if (selected != null) {
            TitleTF.setText(selected.getClass().getName());
            PriorityCB.setValue(selected.getClass().getName());
            DeadlineDP.setValue(selected.getClass().getName().split());
            ReporterCB.setValue(selected.getClass().getName());

            TV.getItems().remove(selected);
            conflictOutputLabel.setText("Editing selected row...");
        } else {
            conflictOutputLabel.setText("Select a row from the table to edit.");
        }
    }


    @FXML
    public void DashOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ContentManager.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}