package com.spring26.section2.group14.Sadman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.io.File;

public class UploadImage
{
    @javafx.fxml.FXML
    private ImageView imagefield;
    @javafx.fxml.FXML
    private Label uploadlabelfield;

    @javafx.fxml.FXML
    public void initialize() {
        uploadlabelfield.setText("No image selected.");
    }

    @FXML
    public void uploadOA(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Image File");

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif")
        );

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        File selectedFile = fileChooser.showOpenDialog(stage);

        if (selectedFile != null) {
            try {

                Image img = new Image(selectedFile.toURI().toString());
                imagefield.getImage(img);


                uploadlabelfield.setText("Selected: " + selectedFile.getName());
                uploadlabelfield.setStyle("-fx-text-fill: green;");

                System.out.println("Image loaded successfully from: " + selectedFile.getPath());
            } catch (Exception e) {
                uploadlabelfield.setText("Failed to load image.");
                uploadlabelfield.setStyle("-fx-text-fill: red;");
            }
        } else {
            uploadlabelfield.setText("Upload cancelled.");
            uploadlabelfield.setStyle("-fx-text-fill: orange;");
        }
    }
}