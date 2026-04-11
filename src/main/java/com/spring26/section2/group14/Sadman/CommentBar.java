package com.spring26.section2.group14.Sadman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

import static jdk.jfr.internal.tool.Command.title;


public class CommentBar
{
    @FXML
    private TextArea commentareafield;

    @FXML
    public void initialize() {
        commentareafield.setPromptText("Write a comment...");
    }

    @FXML
    public void editOA(ActionEvent actionEvent) {
        commentareafield.setEditable(true);
        commentareafield.requestFocus();
        System.out.println("Editing mode enabled.");
    }

    @FXML
    public void postOA(ActionEvent actionEvent) {
        String comment = commentareafield.getText().trim();

        if (comment.isEmpty()) {
            showWarning("Empty Comment", "You cannot post an empty comment.");
            return;
        }
    }
    @FXML
    public void commentOA(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        String title = "";
        alert.setTitle(title);
        alert.setHeaderText(null);
        String content = "";
        alert.setContentText(content);
        alert.showAndWait();
    }


    private void showWarning(String emptyComment, String s) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        String content = "";
        alert.setContentText(content);
        alert.showAndWait();
    }

    }
