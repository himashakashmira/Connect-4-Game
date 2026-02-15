package lk.ijse.dep;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL fxml = getClass().getResource("/view/CreatePlayer.fxml");
        Objects.requireNonNull(fxml, "Missing FXML: /view/CreatePlayer.fxml. Place it under src/main/resources/view/");
        FXMLLoader loader = new FXMLLoader(fxml);
        Scene scene = new Scene(loader.load());
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Connect 4 Game - Create Player");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
