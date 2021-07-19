package features;

import variables.Localization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LoadProductData {

    public static void data() throws IOException {
        String filePath = Localization.PYTHON_FILE;
        String interpreterPath = Localization.PYTHON_INTERPRETER_LOCALIZATION;
        ProcessBuilder pb = new ProcessBuilder().command(interpreterPath, filePath, "get_product");
        Process p = pb.start();
        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
        List<String> productData = new ArrayList<>();
        String line;
        while ((line = in.readLine()) != null) {
            productData.add(line);
        }
        System.out.println(productData);
        in.close();
    }
}
