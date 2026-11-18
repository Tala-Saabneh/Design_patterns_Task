package config;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * Singleton class responsible for loading and providing application settings.
 * Its constructor is private, so other classes cannot create instances directly.
 */
public class ConfigManager {
    private final Properties properties = new Properties();
    /**
     * Private constructor prevents object creation from outside this class.
     * The configuration file is loaded once when the singleton is created.
     */
    private ConfigManager() {
        loadConfiguration();
    }
    /**
     * The holder class is loaded only when getInstance() is called.
     * The JVM guarantees that INSTANCE is initialized only once,
     * making this approach thread-safe.
     */
    private static class SingletonHolder {
        private static final ConfigManager INSTANCE = new ConfigManager();
    }
    /**
     * Provides the single shared ConfigManager instance.
     */
    public static ConfigManager getInstance() {
        return SingletonHolder.INSTANCE;
    }
    /**
     * Loads application settings from the config.properties file
     * in the program's current working directory.
     */
    private void loadConfiguration() {
        try (FileInputStream input =
                     new FileInputStream("config.properties")) {

            properties.load(input);
            System.out.println("Configuration file loaded.");

        } catch (IOException exception) {
            // Continue with default values if the configuration file is unavailable.
            System.out.println(
                    "Could not read config.properties. Using default values.");
        }
    }
    /**
     * Returns the requested setting.
     * The default value is returned if the key does not exist.
     */
    public String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }
}
