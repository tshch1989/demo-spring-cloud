package com.example.demoturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class DemoTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoTurbineApplication.class, args);
    }

}
