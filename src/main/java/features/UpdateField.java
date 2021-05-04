package features;

import javafx.scene.control.TextField;

public class UpdateField {

    public String update(TextField field, String toAdd, String numbers) {
        numbers += toAdd;
        field.setText(numbers);

        return numbers;
    }
}
