package com.adeso.custom;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class TextAreaRight extends AnchorPane {

    private TextAreaRightNodesController nodesController;

    // child nodes
    TextArea textArea;
    Button button1;
    Button button2;
    Label label;

    public TextAreaRight() throws IOException {
        super();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("text-area-right.fxml"));
        nodesController = new TextAreaRightNodesController();
        textArea = nodesController.getTextArea();
        button1 = nodesController.getBtn1();
        button2 = nodesController.getBtn2();
        label = nodesController.getLabel();
        loader.setController(nodesController);
        Node n = loader.load();

        this.getChildren().add(n);
    }

    // ================= Getters =================== //
    public TextArea getTextArea() {
        return textArea;
    }

    public Button getButton1() {
        return button1;
    }

    public Button getButton2() {
        return button2;
    }

    public Label getLabel() {
        return label;
    }

}
