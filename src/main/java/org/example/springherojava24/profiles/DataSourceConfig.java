package org.example.springherojava24.profiles;

public interface DataSourceConfig {
    String getUrl();
    String getUsername();
    String getPassword();
    void setup();
}
