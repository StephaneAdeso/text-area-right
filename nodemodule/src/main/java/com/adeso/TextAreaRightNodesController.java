package com.adeso;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class TextAreaRightNodesController implements Initializable {

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Label label;

    @FXML
    private AnchorPane rightContainer;

    @FXML
    private TextArea textArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Empty initializer
    }

    public Button getBtn1() {
        return btn1;
    }

    public Button getBtn2() {
        return btn2;
    }

    public Label getLabel() {
        return label;
    }

    public AnchorPane getRightContainer() {
        return rightContainer;
    }

    public TextArea getTextArea() {
        return textArea;
    }

}