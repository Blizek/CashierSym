package features;

import org.python.util.PythonInterpreter;
import variables.PythonFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;

public class LoadProductData {

    public static void data() throws IOException {
        String filePath = PythonFile.PYTHON_FILE;
//        ProcessBuilder pb = new ProcessBuilder().command("python", filePath, "get_product");
//        System.out.println(pb);
//        Process p = pb.start();
//        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
//        // ArrayList<String> productData = new ArrayList<>();
//        StringBuilder productData = new StringBuilder();
//        String line = null;
//        while ((line = in.readLine()) != null) {
//            productData.append(line);
//        }
//        System.out.println(productData.toString());
//        // System.out.println(productData.get(0) + " " + productData.get(1));
//        in.close();
        Properties properties = new Properties();
        properties.setProperty("D:\\Program Files\\Python\\python.exe", filePath);
        PythonInterpreter.initialize(System.getProperties(), properties, new String[]{""});
        PythonInterpreter pi = new PythonInterpreter();
    }
}
