package org.example.springherojava24.core.beanscope.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.springherojava24.beanscope"})
public class ScopeLifecycleConfig {
}
