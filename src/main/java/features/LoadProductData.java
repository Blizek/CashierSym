package features;

import variables.ListOfProducts;
import variables.Localization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LoadProductData {

    public static void data() throws IOException {
        String filePath = Localization.PYTHON_FILE;
        ProcessBuilder pb = new ProcessBuilder().command("python", filePath, "get_product");
        Process p = pb.start();
        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
        List<String> productData = new ArrayList<>();
        String line;
        while ((line = in.readLine()) != null) {
            productData.add(line);
        }
        ListOfProducts.purchasedProducts.add(productData);
        in.close();
    }
}
