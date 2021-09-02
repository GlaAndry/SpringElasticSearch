package com.glaandry.example.springelastic.demo;

import com.glaandry.example.springelastic.demo.controller.CustomerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private CustomerController customerController;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
