package features;

import org.json.simple.JSONObject;
import variables.Localization;

import java.io.FileWriter;
import java.io.IOException;

public class LoadCodeAndValue {
    public void saveData(String code, double value) {
        JSONObject jsonData = new JSONObject();

        jsonData.put("code", code);
        jsonData.put("amount", value);

        try (FileWriter file = new FileWriter(Localization.DATA_JSON_LOCALIZATION)) {
            file.write(jsonData.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
