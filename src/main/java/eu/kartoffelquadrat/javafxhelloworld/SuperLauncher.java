package eu.kartoffelquadrat.javafxhelloworld;

/**
 * Required for packaging to jar, see: https://stackoverflow.com/a/57691362 Just delegates call to
 * actual main, which extends javafx.
 */
public class SuperLauncher {
  public static void main(String[] args) {
    Launcher.main(args);
  }
}
