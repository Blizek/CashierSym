package routings;

import controller.CashController;
import controller.MainController;
import controller.MainSecondController;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SetCashScreen {

    public SetCashScreen runThis(MainSecondController mainSecondController) {
        FXMLLoader loadCashScreen = new FXMLLoader();
        loadCashScreen.setLocation(this.getClass().getResource("/fxml/CashScreen.fxml"));
        AnchorPane pane = null;
        try {
            pane = loadCashScreen.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        CashController cashController = loadCashScreen.getController();
        cashController.setMainSecondController(mainSecondController);
        mainSecondController.setScreen(pane);

        return null;
    }
}
