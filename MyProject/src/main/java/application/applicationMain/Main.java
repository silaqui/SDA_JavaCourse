package application.applicationMain;

import controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/MainView.fxml"));

        MainController mainController = new MainController(primaryStage);
        fxmlLoader.setController(mainController);

        StackPane stackPane = fxmlLoader.load();
        Scene scene = new Scene(stackPane);


        primaryStage.setScene(scene);
        primaryStage.setTitle("NoM");
        primaryStage.setMinHeight(550);
        primaryStage.show();





        }
}
