package org.example.springherojava24.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdDataSourceConfig implements DataSourceConfig {
    public ProdDataSourceConfig() {
        System.out.println(">>> ProdDataSourceConfig: Constructor called - PROD profile is active.");
    }

    @Override
    public String getUrl() {
        return "jdbc:postgresql://prod_server:5432/production_db";
    }

    @Override
    public String getUsername() {
        return "prod_user";
    }

    @Override
    public String getPassword() {
        return "VERY_SECRET_PROD_PASSWORD";
    }

    @Override
    public void setup() {
        System.out.println("ProdDataSourceConfig: Connecting to PostgreSQL database for PRODUCTION.");
    }
}
