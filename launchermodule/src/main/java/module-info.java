module com.adeso {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens com.adeso to javafx.fxml;

    exports com.adeso;
}
