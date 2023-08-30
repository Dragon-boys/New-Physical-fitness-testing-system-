package com.example.test03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class Text03Application {

    public static void main(String[] args) {
        SpringApplication.run(Text03Application.class, args);
    }

}
