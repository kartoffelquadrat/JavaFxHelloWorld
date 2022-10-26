package eu.kartoffelquadrat.javafxhelloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Main launcher class as my java fx hello world entry point. Taken from here:
 * https://raw.githubusercontent.com/openjfx/samples/master/HelloFX/Maven/hellofx/src/main/java/HelloFX.java
 */
public class Launcher extends Application {

  /**
   * Main method. Only invokes start.
   *
   * @param args unused runtime arguments.
   */
  public static void main(String[] args) {
    launch();
  }

  /**
   * Start method to display a hello world dialog.
   *
   * @param stage Overrides JavaFX Application start method.
   */
  @Override
  public void start(Stage stage) {
    String javaVersion = System.getProperty("java.version");
    String javafxVersion = System.getProperty("javafx.version");
    Label l =
        new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
    Scene scene = new Scene(new StackPane(l), 640, 480);
    stage.setScene(scene);
    stage.show();
  }
}