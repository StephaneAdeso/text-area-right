module com.adeso.custom {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens com.adeso.custom to javafx.fxml;

    exports com.adeso.custom;
}
