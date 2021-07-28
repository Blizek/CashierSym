package routings;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceiptMain {
    // Creating receipt stage

    public void runThis() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/fxml/ReceiptScreen.fxml"));

        ScrollPane anchorPane = loader.load();

        Stage stage = new Stage();
        Scene scene = new Scene(anchorPane);
        stage.setScene(scene);
        stage.setTitle("Your receipt");
        stage.setResizable(false);
        stage.getIcons().add(new Image("/images/logo.png"));
        stage.setAlwaysOnTop(true);

        stage.show();
    }
}
