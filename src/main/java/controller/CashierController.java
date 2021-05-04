package controller;

import features.BackspaceFunction;
import features.SetCashierType;
import features.UpdateField;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class CashierController {
    public static MainController mainController;

    @FXML
    TextField field;

    private String fieldNumbers = "", type = "code";

    public void setMainController(MainController mainController) { CashierController.mainController = mainController; }

    public void add0(){ fieldNumbers = new UpdateField().update(field, "0", fieldNumbers); }

    public void add1(){ fieldNumbers = new UpdateField().update(field, "1", fieldNumbers); }

    public void add2(){ fieldNumbers = new UpdateField().update(field, "2", fieldNumbers); }

    public void add3(){ fieldNumbers = new UpdateField().update(field, "3", fieldNumbers); }

    public void add4(){ fieldNumbers = new UpdateField().update(field, "4", fieldNumbers); }

    public void add5(){ fieldNumbers = new UpdateField().update(field, "5", fieldNumbers); }

    public void add6(){ fieldNumbers = new UpdateField().update(field, "6", fieldNumbers); }

    public void add7(){ fieldNumbers = new UpdateField().update(field, "7", fieldNumbers); }

    public void add8(){ fieldNumbers = new UpdateField().update(field, "8", fieldNumbers); }

    public void add9(){ fieldNumbers = new UpdateField().update(field, "9", fieldNumbers); }

    public void addPoint(){ fieldNumbers = new UpdateField().update(field, ".", fieldNumbers); }

    public void exitFunction() {System.exit(0);}

    public void backspace() {
        fieldNumbers = new BackspaceFunction().setBackspaceFunction(fieldNumbers, field);
    }

    public void setCode() {
        String[] data = new SetCashierType().setType("code", field);
        fieldNumbers = data[0];
        type = data[1];
    }

    public void setMultiplier() {
        String[] data = new SetCashierType().setType("multiplier", field);
        fieldNumbers = data[0];
        type = data[1];
    }

    public void setWeight() {
        String[] data = new SetCashierType().setType("weight", field);
        fieldNumbers = data[0];
        type = data[1];
    }
}
