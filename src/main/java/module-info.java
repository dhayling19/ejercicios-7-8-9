module com.example.practica_string {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.practica_string to javafx.fxml;
    exports com.example.practica_string;
}