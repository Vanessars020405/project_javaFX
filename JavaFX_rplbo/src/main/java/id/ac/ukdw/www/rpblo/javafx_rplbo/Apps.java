package id.ac.ukdw.www.rpblo.javafx_rplbo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Apps extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;
        showLogin();
    }

    public static void showLogin() {
        try {
            FXMLLoader loader = new FXMLLoader(Apps.class.getResource("/views/login.fxml"));
            Scene scene = new Scene(loader.load(), 400, 300);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Login");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showRegister() {
        try {
            FXMLLoader loader = new FXMLLoader(Apps.class.getResource("/views/register.fxml"));
            Scene scene = new Scene(loader.load(), 400, 350);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Register");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
