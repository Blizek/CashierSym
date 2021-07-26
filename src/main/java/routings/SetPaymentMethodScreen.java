package routings;

import controller.CashController;
import controller.MainController;
import controller.MainSecondController;
import controller.PaymentMethodController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SetPaymentMethodScreen {

    public SetPaymentMethodScreen runThis(MainSecondController mainSecondController){
        FXMLLoader loadPaymentScreen = new FXMLLoader();
        loadPaymentScreen.setLocation(this.getClass().getResource("/fxml/PaymentMethodScreen.fxml"));
        AnchorPane pane = null;
        try {
            pane = loadPaymentScreen.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PaymentMethodController paymentMethodController = loadPaymentScreen.getController();
        paymentMethodController.setMainSecondController(mainSecondController);
        mainSecondController.setScreen(pane);

        return null;
    }
}
