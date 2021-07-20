package features;

import javafx.scene.text.Text;
import variables.Total;

public class UpdateTotal {
    public static void updateTotalField(Text sum) {
        sum.setText("SUM: $" + Total.total);
    }
}
