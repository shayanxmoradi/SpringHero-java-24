package org.example.springherojava24.core.profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileDemo {
    public static void main(String[] args) {

        // --- Scenario 1: No active profile set (or 'default' implicitly/explicitly) ---
        System.out.println("--- SCENARIO 1: No specific profile active (expecting 'default') ---");
        AnnotationConfigApplicationContext contextDefault = new AnnotationConfigApplicationContext();
        // To explicitly activate default if other profiled beans exist and you want default one:
        contextDefault.getEnvironment().setActiveProfiles("default");
        contextDefault.register(ProfileAppConfig.class);
        contextDefault.refresh();
        AppService appServiceDefault = contextDefault.getBean(AppService.class);
        appServiceDefault.useDataSource();
        contextDefault.close();
        System.out.println("------------------------------------------------------\n");


        // --- Scenario 2: "dev" profile active ---
        System.out.println("--- SCENARIO 2: 'dev' profile active ---");
        AnnotationConfigApplicationContext contextDev = new AnnotationConfigApplicationContext();
        contextDev.getEnvironment().setActiveProfiles("dev"); // Activate "dev" profile
        contextDev.register(ProfileAppConfig.class);
        contextDev.refresh();
        AppService appServiceDev = contextDev.getBean(AppService.class);
        appServiceDev.useDataSource();
        contextDev.close();
        System.out.println("------------------------------------------------------\n");


        // --- Scenario 3: "prod" profile active ---
        System.out.println("--- SCENARIO 3: 'prod' profile active ---");
        AnnotationConfigApplicationContext contextProd = new AnnotationConfigApplicationContext();
        contextProd.getEnvironment().setActiveProfiles("prod"); // Activate "prod" profile
        contextProd.register(ProfileAppConfig.class);
        contextProd.refresh();
        AppService appServiceProd = contextProd.getBean(AppService.class);
        appServiceProd.useDataSource();
        contextProd.close();
        System.out.println("------------------------------------------------------\n");

    }
}
