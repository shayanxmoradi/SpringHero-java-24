package org.example.springherojava24.Externalized_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ExternalConfigDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ExternalConfigDemo.class);
        // ApplicationContext context = new AnnotationConfigApplicationContext(AppPropertiesConfig.class, AppInfoService.class, ConfigDisplayService.class); // Alternative explicit way

        ConfigDisplayService configDisplayService = context.getBean(ConfigDisplayService.class);
        configDisplayService.displayConfigs();

        AppInfoService appInfoService = context.getBean(AppInfoService.class);
        appInfoService.displayAppInfo();

        ((AnnotationConfigApplicationContext) context).close();
    }
}
