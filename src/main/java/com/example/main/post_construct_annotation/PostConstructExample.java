package com.example.main.post_construct_annotation;

import com.example.beans.VehiclePostConstruct;
import com.example.config.ProjectConfigComponentExample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PostConstructExample {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfigComponentExample.class);

        VehiclePostConstruct vehicle = context.getBean(VehiclePostConstruct.class);

        System.out.println("Component Vehicle name from Spring context is: " + vehicle.getName());
        vehicle.printHello();
    }
}
