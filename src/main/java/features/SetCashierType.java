package features;

import javafx.scene.control.TextField;

public class SetCashierType {

    public String[] setType(String type, TextField field) {
        field.setText("");
        String numbers = "";

        return new String[]{numbers, type};
    }
}
