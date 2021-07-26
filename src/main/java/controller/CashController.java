package controller;

import features.BackspaceFunction;
import features.UpdateField;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import variables.Total;

public class CashController {
    public static MainSecondController mainSecondController;

    @FXML
    TextField cash;

    @FXML
    Text error;

    private String fieldNumbers = "";

    public void setMainSecondController(MainSecondController mainSecondController) { CashController.mainSecondController = mainSecondController; }

    public void add0(){ fieldNumbers = new UpdateField().update(cash, "0", fieldNumbers); }

    public void add1(){ fieldNumbers = new UpdateField().update(cash, "1", fieldNumbers); }

    public void add2(){ fieldNumbers = new UpdateField().update(cash, "2", fieldNumbers); }

    public void add3(){ fieldNumbers = new UpdateField().update(cash, "3", fieldNumbers); }

    public void add4(){ fieldNumbers = new UpdateField().update(cash, "4", fieldNumbers); }

    public void add5(){ fieldNumbers = new UpdateField().update(cash, "5", fieldNumbers); }

    public void add6(){ fieldNumbers = new UpdateField().update(cash, "6", fieldNumbers); }

    public void add7(){ fieldNumbers = new UpdateField().update(cash, "7", fieldNumbers); }

    public void add8(){ fieldNumbers = new UpdateField().update(cash, "8", fieldNumbers); }

    public void add9(){ fieldNumbers = new UpdateField().update(cash, "9", fieldNumbers); }

    public void addPoint(){ fieldNumbers = new UpdateField().update(cash, ".", fieldNumbers); }

    public void backspace() {
        fieldNumbers = new BackspaceFunction().setBackspaceFunction(fieldNumbers, cash);
    }

    public void submit(){
        double cash_value = Double.parseDouble(cash.getText());

        if (cash_value < Total.total)
            error.setVisible(true);
        else {
            error.setVisible(false);
        }
    }
}
