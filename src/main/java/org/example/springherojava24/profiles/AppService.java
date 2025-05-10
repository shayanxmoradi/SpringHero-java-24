package org.example.springherojava24.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
private final DataSourceConfig dataSourceConfig;
@Autowired
    public AppService(DataSourceConfig dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
    System.out.println("AppService: Constructor called. Injected DataSourceConfig: " + dataSourceConfig.getClass().getSimpleName());

}
    public void useDataSource() {
        System.out.println("AppService: Using data source...");
        dataSourceConfig.setup();
        System.out.println("   URL: " + dataSourceConfig.getUrl());
        System.out.println("   User: " + dataSourceConfig.getUsername());
    }
}
