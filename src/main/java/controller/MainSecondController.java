package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import routings.SetPaymentMethodScreen;

public class MainSecondController {
    // Payment method main controller
    @FXML
    AnchorPane mainAnchorPane;

    public void initialize() {
        setPaymentScreen();
    }


    public void setScreen(AnchorPane pane)
    {
        mainAnchorPane.getChildren().clear();
        mainAnchorPane.getChildren().add(pane);
    }

    public void setPaymentScreen() {
        new SetPaymentMethodScreen().runThis(this);
    }
}
