module com.adeso.custom.textarea.launcher {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires com.adeso.custom.textarea;

    opens com.adeso.custom.textarea.launcher;

    exports com.adeso.custom.textarea.launcher;
}
