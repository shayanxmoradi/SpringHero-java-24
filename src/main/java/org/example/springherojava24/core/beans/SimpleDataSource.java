package org.example.springherojava24.core.beans;

public class SimpleDataSource {
    private String connectionUrl;

    public SimpleDataSource(String connectionUrl) {
        this.connectionUrl = connectionUrl;
        System.out.println("SimpleDataSource: Constructor called with URL - " + connectionUrl);
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public void connect() {
        System.out.println("SimpleDataSource: Connecting to " + connectionUrl);
    }

    // Simulate an init method
    public void init() {
        System.out.println("SimpleDataSource: init() called. Data source is ready.");
    }

    // Simulate a destroy method
    public void close() {
        System.out.println("SimpleDataSource: close() called. Releasing connection for " + connectionUrl);
    }
}
