package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*
    Spring @ComponentScan indicates where are located the beans annotated that are going to be create with @Component
 */
@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfigComponentExample {

}


