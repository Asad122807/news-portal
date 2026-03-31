package com.spring26.section2.group14.newsportal;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController
{
    @javafx.fxml.FXML
    private TextField usernametf;
    @javafx.fxml.FXML
    private PasswordField passpf;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loginbutton(ActionEvent actionEvent) throws IOException {

        String username = usernametf.getText();
        String password = passpf.getText();

        Parent root;
        Stage stage;
        Scene scene;

        if(username.equals("AsadE") && password.equals("1234")) {
            root = FXMLLoader.load(getClass().getResource("/com/spring26/section2/group14/newsportal/Asad/EditorDashboard.fxml"));
            stage = (Stage) usernametf.getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else if(username.equals("AsadAE") && password.equals("1234")) {
            root = FXMLLoader.load(getClass().getResource("/com/spring26/section2/group14/newsportal/Asad/AdvertisementExecutiveDashboard.fxml"));
            stage = (Stage) usernametf.getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else {
            System.out.println("Invalid username or password");
        }
    }
}