package org.example.springherojava24.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanMethodsDemo {
    public static void main(String[] args) {
        System.out.println("--- Initializing Spring Context ---");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigWithBeanMethods.class);
        System.out.println("--- Spring Context Initialized ---");

        System.out.println("\n--- Retrieving Beans ---");

        // Retrieve UserService (which was component scanned and autowired with UserRepository)
        UserService userService = context.getBean(UserService.class);
        userService.registerUser("john.doe");

        System.out.println("\n--- Checking DataSource bean ---");
        // Retrieve DataSource by its custom name
        SimpleDataSource dsFromContext = context.getBean("appDataSource", SimpleDataSource.class);
        System.out.println("Retrieved DataSource URL: " + dsFromContext.getConnectionUrl());

        // Prove that the DataSource injected into UserRepository is the same instance
        UserRepository repoFromContext = context.getBean(UserRepository.class);
        // To really prove it, you'd need access to the ds instance within repoFromContext
        // or observe the constructor/init logs.

        System.out.println("\n--- Demonstrating Singleton Behavior of @Bean methods ---");
        // This part requires the @Configuration class to be correctly proxied.
        // We can't directly call the methods on the config instance we create ourselves easily.
        // But Spring does this internally when resolving inter-bean dependencies.
        // The logs from bean creation should show myDataSource() (or its body) executing only once.

        System.out.println("\n--- Closing Spring Context (triggers destroy methods) ---");
        context.close();
        System.out.println("--- Spring Context Closed ---");
    }
}
