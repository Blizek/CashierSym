package routings;

import controller.CashierController;
import controller.MainController;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SetCashierScreen {

    public SetCashierScreen runThis(MainController mainController) {
        FXMLLoader loadCashierScreen = new FXMLLoader();
        loadCashierScreen.setLocation(this.getClass().getResource("/fxml/CashierScreen.fxml"));
        AnchorPane pane = null;
        try {
            pane = loadCashierScreen.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        CashierController cashierController = loadCashierScreen.getController();
        cashierController.setMainController(mainController);
        mainController.setScreen(pane);

        return null;
    }
}
