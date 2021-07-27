package routings;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PaymentMain {
    public static Stage stage = new Stage();

    public void runThis() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/fxml/MainSecondScreen.fxml"));

        AnchorPane anchorPane = loader.load();

        Scene scene = new Scene(anchorPane);
        stage.setScene(scene);
        stage.setTitle("Choose payment method");
        stage.setResizable(false);
        stage.getIcons().add(new Image("/images/logo.png"));
        stage.setAlwaysOnTop(true);

        stage.show();
    }

    public void closeStage() {
        stage.close();
    }
}
