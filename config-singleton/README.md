# Configuration Manager — Singleton Pattern

## Why Singleton Pattern?

The assignment describes a situation where different application modules create multiple `ConfigManager` objects. This can cause the configuration file to be loaded repeatedly.

The Singleton Pattern ensures that the application uses one shared `ConfigManager` instance. The configuration file is loaded only when that instance is initialized.

## Run the Project

From this directory, run:

```bat
javac -d out src\config\*.java
java -cp out config.Main
```

On Linux or macOS, use:

```bash
javac -d out src/config/*.java
java -cp out config.Main
```

**Important:** Run the commands from the `config-singleton` directory because `config.properties` is stored there.

## Thread Safety

This implementation uses the initialization-on-demand holder idiom. The JVM initializes the singleton instance once, in a thread-safe way, when `getInstance()` is called for the first time.
