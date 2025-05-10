package org.example.springherojava24.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDataSourceConfig implements DataSourceConfig {
    public DevDataSourceConfig() {
        System.out.println(">>> DevDataSourceConfig: Constructor called - DEV profile is active.");
    }

    @Override
    public String getUrl() {
        return "jdbc:h2:mem:devdb";
    }

    @Override
    public String getUsername() {
        return "dev_user";
    }

    @Override
    public String getPassword() {
        return "dev_password";
    }

    @Override
    public void setup() {
        System.out.println("DevDataSourceConfig: Setting up H2 in-memory database for DEVELOPMENT.");
    }
}
