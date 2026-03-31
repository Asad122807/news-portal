module com.spring26.section2.group14.newsportal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spring26.section2.group14.newsportal to javafx.fxml;
    opens com.spring26.section2.group14.newsportal.Asad to javafx.fxml;

    exports com.spring26.section2.group14.newsportal;
    exports com.spring26.section2.group14.newsportal.Asad;
}