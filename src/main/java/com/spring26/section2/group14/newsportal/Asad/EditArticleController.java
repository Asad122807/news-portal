package com.spring26.section2.group14.newsportal.Asad;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class EditArticleController
{
    @javafx.fxml.FXML
    private TableView<EditArticleStep> articleTableView;
    @javafx.fxml.FXML
    private TextArea contentTextArea;
    @javafx.fxml.FXML
    private TableColumn<EditArticleStep, String> eventColumn;
    @javafx.fxml.FXML
    private TableColumn<EditArticleStep, String> typeColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<EditArticleStep, String> descriptionColumn;

    private ObservableList<EditArticleStep> articleList;

    @javafx.fxml.FXML
    public void initialize() {

        eventColumn.setCellValueFactory(new PropertyValueFactory<>("event"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));

        articleList = FXCollections.observableArrayList(
                new EditArticleStep(
                        "Headline",
                        "City Corporation launches emergency dengue cleanup drive across five zones",
                        "Title"
                ),
                new EditArticleStep(
                        "Lead Paragraph",
                        "The Dhaka North City Corporation on মঙ্গলবার launched a special dengue prevention drive to clean high-risk areas and remove stagnant water from residential neighborhoods.",
                        "Intro"
                ),
                new EditArticleStep(
                        "Body Paragraph 1",
                        "According to officials, the campaign began in Mirpur, Mohammadpur, Uttara, Pallabi, and Kafrul, where cleaning teams were deployed with insecticide spray equipment and waste removal support.",
                        "Body"
                ),
                new EditArticleStep(
                        "Quote",
                        "\"We are giving priority to the most vulnerable zones and asking residents to cooperate with our field teams,\" said a city health officer during the launch event.",
                        "Quote"
                ),
                new EditArticleStep(
                        "Closing Paragraph",
                        "Authorities also requested residents not to keep open containers, unused tires, or rooftop water tanks uncovered, as these can become mosquito breeding grounds during the monsoon season.",
                        "Ending"
                )
        );

        articleTableView.setItems(articleList);

        articleTableView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, selectedStep) -> {
            if (selectedStep != null) {
                contentTextArea.setText(selectedStep.getDescription());
                statusLabel.setVisible(true);
                statusLabel.setText(selectedStep.getEvent() + " selected. You can now edit the content.");
                statusLabel.setStyle("-fx-text-fill: blue;");
            }
        });

        statusLabel.setVisible(true);
        statusLabel.setText("Select any article section from the table to edit.");
        statusLabel.setStyle("-fx-text-fill: green;");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/spring26/section2/group14/newsportal/Asad/EditorDashboard.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void saveChangesButton(ActionEvent actionEvent) {
        EditArticleStep selectedStep = articleTableView.getSelectionModel().getSelectedItem();

        if (selectedStep == null) {
            statusLabel.setVisible(true);
            statusLabel.setText("Please select a section first.");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        String updatedText = contentTextArea.getText();

        if (updatedText == null || updatedText.trim().isEmpty()) {
            statusLabel.setVisible(true);
            statusLabel.setText("Edited content cannot be empty.");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        selectedStep.setDescription(updatedText);
        articleTableView.refresh();

        statusLabel.setVisible(true);
        statusLabel.setText(selectedStep.getEvent() + " updated successfully.");
        statusLabel.setStyle("-fx-text-fill: green;");
    }
}