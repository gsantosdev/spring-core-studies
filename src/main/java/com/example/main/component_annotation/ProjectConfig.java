package com.example.main.component_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com/example/beans")
public class ProjectConfig {
}
