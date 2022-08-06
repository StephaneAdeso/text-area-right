module com.adeso.custom {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens com.adeso.custom;

    exports com.adeso.custom;
}
