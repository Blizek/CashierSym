package controller;

import features.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import variables.Code;

import java.io.IOException;


public class CashierController {
    public static MainController mainController;

    @FXML
    TextField field;

    private String fieldNumbers = "";

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
        fieldNumbers = new SetCashierType().setType(field);
    }

    public void setMultiplier() {
        Code.setCode(field.getText());
        fieldNumbers = new SetCashierType().setType(field);
    }

    public void setWeight() {
        Code.setCode(field.getText());
        fieldNumbers = new SetCashierType().setType(field);;
    }

    public void add() throws IOException {
        new LoadCodeAndValue().saveData(Code.code, Double.parseDouble(field.getText()));
        LoadProductData.data();
        Code.setCode("");
        fieldNumbers = new SetCashierType().setType(field);
    }
}
