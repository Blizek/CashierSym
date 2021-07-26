package controller;

import routings.SetCashScreen;
import variables.TypeOfPayment;

public class PaymentMethodController {

    public static MainSecondController mainSecondController;

    public void setMainSecondController(MainSecondController mainSecondController) {
        PaymentMethodController.mainSecondController = mainSecondController;
    }

    public void cash() {
        TypeOfPayment.cash = true;
        new SetCashScreen().runThis(mainSecondController);
    }

    public void card() {
        TypeOfPayment.card = true;
    }
}
