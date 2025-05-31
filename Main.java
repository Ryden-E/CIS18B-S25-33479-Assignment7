package planner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX Main
 */
public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(
            FXMLLoader.load(getClass().getResource("/fxml/EventListView.fxml")));
        stage.setTitle("Event Planner");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) { launch(); }
}