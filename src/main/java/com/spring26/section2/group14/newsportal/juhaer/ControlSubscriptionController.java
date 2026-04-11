package com.spring26.section2.group14.newsportal.juhaer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ControlSubscriptionController
{
    @javafx.fxml.FXML
    private TableView<ControlSubscription> TV;
    @javafx.fxml.FXML
    private CheckBox REFCHK;
    @javafx.fxml.FXML
    private TableColumn<ControlSubscription,String> Publisher;
    @javafx.fxml.FXML
    private ComboBox <String>SourceCB;
    @javafx.fxml.FXML
    private TableColumn<ControlSubscription,String> Verifications;
    @javafx.fxml.FXML
    private PieChart pie;
    @javafx.fxml.FXML
    private ComboBox <String>KeyCB;
    @javafx.fxml.FXML
    private CheckBox FastCHK;
    @javafx.fxml.FXML
    private TextField UpdateTF;
    @javafx.fxml.FXML
    private TableColumn <ControlSubscription,String>Publishers;
    @javafx.fxml.FXML
    private TableColumn <ControlSubscription,String>Author;
    @javafx.fxml.FXML
    private Label PasswordTF;
    @javafx.fxml.FXML
    private TextArea AuthorTA;
    @javafx.fxml.FXML
    private CheckBox UpdateCHK;
    @javafx.fxml.FXML
    private TextField NameTF;

    @javafx.fxml.FXML
    public void initialize() {
        Publisher.setCellValueFactory(new PropertyValueFactory<>("Publisher"));
        Verifications.setCellValueFactory(new PropertyValueFactory<>("Verification"));
        Author.setCellValueFactory(new PropertyValueFactory<>("Author"));
        Publishers.setCellValueFactory(new PropertyValueFactory<>("Publishers"));
        SourceCB.getItems().addAll("Reuters", "AP News", "BBC", "Local Gazette");
        KeyCB.getItems().addAll("Politics", "Finance", "Science", "Health");
        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList(
                new PieChart.Data("Verified", 75),
                new PieChart.Data("Unverified", 25)
        );
        pie.setData(pieData);

    }

    @javafx.fxml.FXML
    public void CHECKCREDIBILITYDETAILSOA(ActionEvent actionEvent) {
        if (NameTF.getText().isEmpty()) {
            AuthorTA.setText("Error: Enter an Author Name to check credibility.");
            return;
        }
        TV.getItems().clear();
        TV.getItems().add(new ControlSubscription(
                NameTF.getText(),
                "Global Media",
                "Associated Press",
                "Verified (Level 1)"
        ));

        AuthorTA.setText("Profile found for " + NameTF.getText() + ". Check table for verification status.");
    }

    @javafx.fxml.FXML
    public void UpdateOA(ActionEvent actionEvent) {
        if (!UpdateCHK.isSelected()) {
            AuthorTA.setText("Please check the 'Update Source Rating' box first.");
            return;
        }

        String newRating = UpdateTF.getText();
        if (!newRating.isEmpty()) {
            AuthorTA.setText("Source rating updated to: " + newRating);
            // Dynamic update to PieChart
            pie.getData().get(0).setPieValue(85); // Verification confidence increases
        }
    }

    @javafx.fxml.FXML
    public void SUBMITOA(ActionEvent actionEvent) {
        boolean factCheck = FastCHK.isSelected();
        boolean refConfirmed = REFCHK.isSelected();

        if (factCheck && refConfirmed) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Feedback Submitted");
            alert.setHeaderText("Verification Complete");
            alert.setContentText("Credibility feedback for " + NameTF.getText() + " has been recorded.");
            alert.showAndWait();
        } else {
            AuthorTA.setText("Incomplete: Please review Fact Check and References checkboxes.");

        }
      }

    @javafx.fxml.FXML
    public void BacktoDashboardOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Subscriber.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
