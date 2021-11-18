/* Group Members:
Steven Felker
Antonio Hendricks
*/


package FacilitatingDemocracy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FDProject.fxml"));
        primaryStage.setTitle("Facilitating Democracy");
        primaryStage.setScene(new Scene(root, 640, 640));
        primaryStage.show();
    }
    public static void main(String[] args) throws IOException {
        launch(args);

        // Below is all a test

    }
}
