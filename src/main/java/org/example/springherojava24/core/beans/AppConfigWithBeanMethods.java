package org.example.springherojava24.core.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfigWithBeanMethods {
    @Bean(name = "appDataSource",initMethod = "init",destroyMethod = "close")
    public SimpleDataSource myDataSource() {
        System.out.println("x" +
                           "x" +
                           "x" +
                           "AppConfig: Creating SimpleDataSource bean via @Bean method myDataSource().");
        return new SimpleDataSource("jdbc:mydb://localhost:3306/mydatabase");
    }

    @Bean
    public UserRepository userRepository() {
        System.out.println("AppConfig: Creating UserRepository bean via @Bean method userRepository().");
        SimpleDataSource ds = myDataSource();
        return new JdbcUserRepositoryImpl(ds);
    }
}
