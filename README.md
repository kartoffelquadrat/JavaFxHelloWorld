# Java FX Hello World

This is a minimal Hello World JavaFX project to demonstrate build to a standalone JAR file.

## References

The code is this repo is based on several sources:

 * This [JavaFX maven tutorial](https://openjfx.io/openjfx-docs/maven) for JavaFX maven dependencies. (updated versions, the ones on webpage were outdated)
 * This [template as ```hello world``` launcher class](https://github.com/openjfx/samples/blob/master/HelloFX/Maven/hellofx/src/main/java/HelloFX.java).
 * This [packaging trick](https://stackoverflow.com/a/57691362/13805480) (super launcher + maven shade plugin) to obtain a standalone JAR file.

## Run

Type this to run the program:  
```
mvn clean javafx:run
```

Or create a self contained JAR for later launch:  
```
mvn clean package
java -jar target/javafxhelloworld.jar
```

## JavaDoc

[Auto-generated javadocs (by maven plugin) are on github pages.](https://m5c.github.io/JavaFxHelloWorld/)


