package com.metrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:metrics.properties")
public class MetricsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MetricsApplication.class, args);
    }
}