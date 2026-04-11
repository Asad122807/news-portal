package com.spring26.section2.group14.Sadman;

import com.sun.javafx.charts.Legend;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Breakingnews
{
    @FXML
    private TableColumn tableviewfield;
    @FXML
    private DropdownButton categorydropdownfield;
    @FXML
    private TextField searchfield;
    private Object newsTableView;

    @FXML
    public void initialize() {
        tableviewfield.setCellFactory(new PropertyValueFactory<>("TV"));
        categorydropdownfield.getClass(FXCollections.observableArrayList(
                "Politics", "Sports", "Technology", "World"
        ));

    }

    @FXML
    public void searchOA(ActionEvent actionEvent) {
        String searchText = searchfield.getText().toLowerCase();
        String selectedCategory = categorydropdownfield.getValue();

        ObservableList<NewsItem> masterData = null;
        FilteredList<NewsItem> filteredData = new FilteredList<>(null, p -> {
            if (searchText.isEmpty()) {
                return true;
            }

            return p.getTV().toLowerCase().contains(searchText);
        });


    }
    }
}