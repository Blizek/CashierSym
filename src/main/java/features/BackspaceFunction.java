package features;

import javafx.scene.control.TextField;

public class BackspaceFunction {

    public String setBackspaceFunction(String fieldNumbers, TextField field) {
        if (fieldNumbers.length() >= 1)
            fieldNumbers = fieldNumbers.substring(0, fieldNumbers.length() - 1);
        fieldNumbers = new UpdateField().update(field, "", fieldNumbers);

        return fieldNumbers;
    }
}
