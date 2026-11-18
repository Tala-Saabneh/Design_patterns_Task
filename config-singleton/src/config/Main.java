package config;

/**
 * Demonstrates how different application modules share one ConfigManager.
 */
public class Main {

    public static void main(String[] args) {

        // The first application module requests the configuration manager.
        ConfigManager moduleOne = ConfigManager.getInstance();

        // The second module receives the same instance.
        ConfigManager moduleTwo = ConfigManager.getInstance();

        // Verify that both references point to the same object.
        System.out.println("Same instance: " + (moduleOne == moduleTwo));

        // Read application settings from the configuration file.
        System.out.println("Application: "
                + moduleOne.getProperty("application.name", "Default App"));

        System.out.println("Version: "
                + moduleTwo.getProperty("application.version", "1.0"));

        System.out.println("Language: "
                + moduleOne.getProperty("language", "Arabic"));
    }
}
