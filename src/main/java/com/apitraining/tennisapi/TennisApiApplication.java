package com.apitraining.tennisapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.apitraining")
public class TennisApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TennisApiApplication.class, args);
    }

}
