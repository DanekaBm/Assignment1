package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    @Bean
    public Bridge bridge() {
        Bridge bridge = new Bridge();
        bridge.setName("Golden Bridge");
        return bridge;
    }

    @Bean
    public River river() {
        River river = new River();
        river.setName("Amazon River");
        return river;
    }
}