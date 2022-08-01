module com.adeso {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.adeso to javafx.fxml;
    exports com.adeso;
}
