package org.example.springherojava24.core.profiles;

public interface DataSourceConfig {
    String getUrl();
    String getUsername();
    String getPassword();
    void setup();
}
