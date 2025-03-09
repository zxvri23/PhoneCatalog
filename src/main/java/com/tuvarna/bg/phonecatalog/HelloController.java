package com.tuvarna.bg.phonecatalog;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lombok.Getter;

@Getter
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}