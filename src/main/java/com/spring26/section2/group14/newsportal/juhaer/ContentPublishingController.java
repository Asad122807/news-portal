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

public class ContentPublishingController {
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TableView<ContentPublishing> TV;
    @javafx.fxml.FXML
    private RadioButton Checklist2;
    @javafx.fxml.FXML
    private RadioButton Checklist1;
    @javafx.fxml.FXML
    private TableColumn<ContentPublishing, String> CategoryTC;
    @javafx.fxml.FXML
    private TextField AssignedTF;
    @javafx.fxml.FXML
    private TableColumn<ContentPublishing, String> TitleTC;
    @javafx.fxml.FXML
    private DatePicker PubTimeTF;
    @javafx.fxml.FXML
    private TableColumn<ContentPublishing, LocalDate> DeadlineTC;
    @javafx.fxml.FXML
    private ComboBox<String> CB;
    @javafx.fxml.FXML
    public void initialize() {
        CategoryTC.setCellValueFactory(new PropertyValueFactory<>("CategoryTC"));
        TitleTC.setCellValueFactory(new PropertyValueFactory<>("TitleTC"));
        DeadlineTC.setCellValueFactory(new PropertyValueFactory<>("DeadlineTC"));
        CB.getItems().addAll("Draft", "Reviewing", "Approved", "Archived");
    }
    @javafx.fxml.FXML
    public void ScheduleOA(ActionEvent actionEvent) {
        if (!Checklist1.isSelected() || !Checklist2.isSelected()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Publishing Requirements Not Met");
            alert.setContentText("Please confirm that the article is approved and all sections are completed.");
            alert.showAndWait();
            return;
        }
        if (PubTimeTF.getValue() == null || AssignedTF.getText().isEmpty() || CB.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Please fill in the Status, Assigned Writer, and Publish Date.");
            alert.show();
            return;
        }
        ContentPublishing entry = new ContentPublishing(
                "Feature by " + AssignedTF.getText(),
                "Category: " + CB.getValue(),
                PubTimeTF.getValue()
        );
        TV.getItems().add(entry);
        Alert success = new Alert(Alert.AlertType.INFORMATION);
        success.setContentText("Content successfully scheduled for: " + PubTimeTF.getValue());
        success.show();
        AssignedTF.clear();
        PubTimeTF.setValue(null);
        Checklist1.setSelected(false);
        Checklist2.setSelected(false);
    }
    @javafx.fxml.FXML
    public void DashOA (ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ContentManager.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}

