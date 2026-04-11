package com.spring26.section2.group14.Sadman;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Homepage
{
    @FXML
    private DropdownButton categoriesfield;
    @FXML
    private TextField searchfield;

    @FXML
    public void initialize() {
        ObservableList<String> categories = FXCollections.observableArrayList(
                "All Categories", "Politics", "Business", "Technology", "Entertainment", "Sports"
        );
        categoriesfield.setItems(categories);

        categoriesfield.getSelectionModel().selectFirst();
    }

    @FXML
    public void searchOA(ActionEvent actionEvent) {
        String query = searchfield.getText().trim();
        String selectedCategory = categoriesfield.getValue();

        if (query.isEmpty()) {

            System.out.println("Search query is empty. Displaying all from: " + selectedCategory);
        } else {
            executeSearchLogic(query, selectedCategory);
        }
    }

    private void executeSearchLogic(String query, String selectedCategory) {
        String category = "";
        System.out.println("Searching for: '" + query + "' in category: [" + category + "]");


    }
    }
}