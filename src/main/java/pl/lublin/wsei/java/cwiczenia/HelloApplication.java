package pl.lublin.wsei.java.cwiczenia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gusInfoGraphic.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("gusInfoGraphic.fxml"));
        Parent root = loader.load();
        HelloController controller = loader.getController();
        controller.setHostServices(this.getHostServices());
        controller.setStage(stage);

        //Scene scene = new Scene(loader.load(), 800, 700);
        stage.setTitle("Hello!");
        stage.setScene(new Scene(root, 800, 700));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}