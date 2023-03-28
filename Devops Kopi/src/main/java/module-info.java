module com.example.devops {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    opens com.example.devops to javafx.fxml;

    exports com.example.devops;
}