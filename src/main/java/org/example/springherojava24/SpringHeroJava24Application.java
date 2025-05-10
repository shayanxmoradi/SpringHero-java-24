package org.example.springherojava24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.example.springherojava24")
public class SpringHeroJava24Application {

    public static void main(String[] args) {
        /**
         * This static method bootstraps and launches your Spring application. It creates the ApplicationContext, performs auto-configuration, and starts the embedded server (if it's a web application).
         */
        SpringApplication.run(SpringHeroJava24Application.class, args);
    }

}
