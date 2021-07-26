package controller;

import routings.ReceiptMain;
import routings.SetCashScreen;
import variables.TypeOfPayment;

import java.io.IOException;

public class PaymentMethodController {

    public static MainSecondController mainSecondController;

    public void setMainSecondController(MainSecondController mainSecondController) {
        PaymentMethodController.mainSecondController = mainSecondController;
    }

    public void cash() {
        TypeOfPayment.cash = true;
        new SetCashScreen().runThis(mainSecondController);
    }

    public void card() throws IOException {
        TypeOfPayment.card = true;
        new ReceiptMain().runThis();
    }
}
