package alex.heustess.viewer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Viewer extends Application{

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("wordCount.fxml"));
        stage.setTitle("Autopath");
        stage.setScene(new Scene(root));
        stage.show();
    }

}
