package com.spring26.section2.group14.newsportal.juhaer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class WritersController
{
    @javafx.fxml.FXML
    private DatePicker TaskDeadlineDP;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TextArea AnalysisOfDetailsTA;
    @javafx.fxml.FXML
    private TextField AssignedWriterTF;
    @javafx.fxml.FXML
    private TextField SendMassageTF;
    @javafx.fxml.FXML
    private TableView <Writers>TV;
    @javafx.fxml.FXML
    private TableColumn <Writers,String>TC;

    @javafx.fxml.FXML
    public void initialize() {
        TC.setCellValueFactory(new PropertyValueFactory<>("massage"));
    }

    @javafx.fxml.FXML
    public void CheckCoordinationOA(ActionEvent actionEvent) {

        if (AssignedWriterTF.getText().isEmpty()) {
            OutputLabel.setText("Enter writer name first!");
            return;
        }

        OutputLabel.setText("Coordination is in progress for " + AssignedWriterTF.getText());
    }

    @javafx.fxml.FXML
    public void SendButtonOA(ActionEvent actionEvent) {
        String writer = AssignedWriterTF.getText();
        String message = SendMassageTF.getText();

        if (writer.isEmpty() || message.isEmpty()) {
            OutputLabel.setText("Please fill all fields!");
            return;
        }
        TV.getItems().add(new Writers(message));

        OutputLabel.setText("Message sent to " + writer);

        SendMassageTF.clear();
    }

    @javafx.fxml.FXML
    public void NorificationOA(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Notification");
        alert.setHeaderText(null);
        alert.setContentText("You have new updates!");

        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void ConfirmCoordinationOA(ActionEvent actionEvent) {

        if (AssignedWriterTF.getText().isEmpty()) {
            OutputLabel.setText("No writer assigned!");
            return;
        }

        OutputLabel.setText("Coordination confirmed for " + AssignedWriterTF.getText());
    }

    @javafx.fxml.FXML
    public void ViewRequestsOA(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Requests");
        alert.setHeaderText("Pending Requests");
        alert.setContentText("No new requests available.");

        alert.showAndWait();
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

