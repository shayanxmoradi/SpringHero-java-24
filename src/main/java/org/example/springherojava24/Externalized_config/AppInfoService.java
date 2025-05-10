package org.example.springherojava24.Externalized_config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppInfoService {
    @Value("${app.name}")
    private String applicationName;

    @Value("${app.version}")
    private String applicationVersion;

    // Injecting with a default value if the property is not found
    @Value("${app.build.number:N/A}") // "app.build.number" is not in our properties file
    private String buildNumber;

    // Injecting a boolean value (Spring handles type conversion)
    @Value("${feature.notifications.enabled}")
    private boolean notificationsEnabled;

    // You can also inject into constructor parameters
    private final String greetingMessage;

    public AppInfoService(@Value("${greeting.message:Default Hello!}") String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }

    public void displayAppInfo() {
        System.out.println("\n--- Application Info from @Value ---");
        System.out.println("App Name: " + applicationName);
        System.out.println("App Version: " + applicationVersion);
        System.out.println("App Build Number: " + buildNumber);
        System.out.println("Notifications Feature Enabled: " + notificationsEnabled);
        System.out.println("Greeting Message: " + greetingMessage);
    }
}
