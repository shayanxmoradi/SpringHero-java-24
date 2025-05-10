package org.example.springherojava24.core.Externalized_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ConfigDisplayService {
    private final Environment environment;
@Autowired
    public ConfigDisplayService(Environment environment) {
        this.environment = environment;
    }
    public void displayConfigs(){
        System.out.println("hi" );
        String appName = environment.getProperty("spring.application.name");
        System.out.printf("app name: %s\n", appName)   ;
        String appOwner = environment.getProperty("app.owner", "Default Owner Inc.");
        System.out.println("Application Owner: " + appOwner);

        // Get a property and convert its type
        Boolean notificationsEnabled = environment.getProperty("feature.notifications.enabled", Boolean.class, true);
        System.out.println("Notifications Enabled: " + notificationsEnabled);

        // Get a property that might be missing
        String nonExistentProp = environment.getProperty("some.missing.property");
        System.out.println("Missing Property: " + nonExistentProp); // Will be null

        // Check if a property exists
        if (environment.containsProperty("db.url")) {
            System.out.println("DB URL: " + environment.getProperty("db.url"));
        }
    }
}
