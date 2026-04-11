package com.spring26.section2.group14.newsportal.juhaer;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class SEOOptimizationController
{
    @javafx.fxml.FXML
    private TextField MetaTitleTF;
    @javafx.fxml.FXML
    private TableView<SEOOptimization> TV;
    @javafx.fxml.FXML
    private TextField FocusTF;
    @javafx.fxml.FXML
    private TextField InternalLinksTF;
    @javafx.fxml.FXML
    private Label outputLabel2;
    @javafx.fxml.FXML
    private Label outputLabel1;
    @javafx.fxml.FXML
    private TableColumn <SEOOptimization,String>FocusTC;
    @javafx.fxml.FXML
    private TableColumn <SEOOptimization,String>SEOsuggestionsTC;
    @javafx.fxml.FXML
    private TextField HeadLineTF;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TableColumn <SEOOptimization,String>H2TC;
    @javafx.fxml.FXML
    private TableColumn <SEOOptimization,String>H1TC;
    @javafx.fxml.FXML
    private TableColumn <SEOOptimization,String>InternalLInksTC;
    @javafx.fxml.FXML
    private TextArea MetaDescriptionTA;
    @javafx.fxml.FXML
    private ComboBox<String> CB;

    @javafx.fxml.FXML
    public void initialize() {
        FocusTC.setCellValueFactory(new PropertyValueFactory<>("FocusTC"));
        SEOsuggestionsTC.setCellValueFactory(new PropertyValueFactory<>("SEOsuggestionsTC"));
        H2TC.setCellValueFactory(new PropertyValueFactory<>("H2TC"));
        H1TC.setCellValueFactory(new PropertyValueFactory<>("H1TC"));
        InternalLInksTC.setCellValueFactory(new PropertyValueFactory<>("InternalLInksTC"));
        CB.getItems().addAll();

    }

    @javafx.fxml.FXML
    public void SaveAndUpdateOA(ActionEvent actionEvent) {
        if (TV.getItems().isEmpty()) {
            outputLabel.setText("Please 'Update Preview' before saving.");
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("SEO data for " + HeadLineTF.getText() + " has been saved!");
        alert.showAndWait();
    }


    @javafx.fxml.FXML
    public void UpdatePreviewOA(ActionEvent actionEvent) {
        if (FocusTF.getText().isEmpty() || MetaTitleTF.getText().isEmpty()) {
            outputLabel.setText("Warning: Focus Keyword and Meta Title are required.");
            return;
        }


        String suggestion = (MetaDescriptionTA.getText().length() < 50)
                ? "Improvement: Description too short."
                : "Good: SEO basics met.";


        SEOOptimization entry = new SEOOptimization(
                FocusTF.getText(),
                HeadLineTF.getText(),
                "Standard H2",
                InternalLinksTF.getText(),
                suggestion
        );

        TV.getItems().setAll(entry);
        outputLabel.setText("Preview Updated Successfully.");
    @javafx.fxml.FXML
    public void DashOA(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ContentManager.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
