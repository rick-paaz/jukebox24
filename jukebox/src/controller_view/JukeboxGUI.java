package controller_view;

/**
 * This app should contain all elements by the end of Sprint 2
 * The starter code only shows the minimum 
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JukeboxGUI extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  LoginPane loginPane;
  BorderPane everything;

  @Override
  public void start(Stage primaryStage) throws Exception {
    LayoutGUI();
    Scene scene = new Scene(everything, 500, 200);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  private void LayoutGUI() {
    everything = new BorderPane();
    loginPane = new LoginPane();
    everything.setCenter(loginPane);
  }
}