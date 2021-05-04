package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import routings.SetCashierScreen;

public class MainController {
    @FXML
    AnchorPane mainAnchorPane;

    public void initialize() {
        setCashierScreen();
    }


    public void setScreen(AnchorPane pane)
    {
        mainAnchorPane.getChildren().clear();
        mainAnchorPane.getChildren().add(pane);
    }

    public void setCashierScreen() {
        new SetCashierScreen().runThis(this);
    }
}
