package org.example.springherojava24.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DefaultDataSourceConfig implements DataSourceConfig {
    public DefaultDataSourceConfig() {
        System.out.println(">>> DefaultDataSourceConfig: Constructor called - DEFAULT profile is active.");
    }
    @Override
    public String getUrl() {
        return "jdbc:hsqldb:mem:defaultdb";
    }

    @Override
    public String getUsername() {
        return "default_user";
    }

    @Override
    public String getPassword() {
        return "default_password";
    }

    @Override
    public void setup() {
        System.out.println("DefaultDataSourceConfig: Setting up HSQLDB in-memory database as DEFAULT.");
    }
}
