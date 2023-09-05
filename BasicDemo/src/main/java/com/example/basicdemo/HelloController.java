package com.example.basicdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("This is where the text pops up!");
    }

    @FXML
    private void onButton1Click(ActionEvent event) {
        welcomeText.setText("Button 1 clicked!");
    }
    @FXML
    private void onButton2Click(ActionEvent event) {
        welcomeText.setText("Button 2 clicked!");
    }
    @FXML
    private void onButton3Click(ActionEvent event) {
        welcomeText.setText("Button 3 clicked!");
    }

}