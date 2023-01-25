package com.example.main.component_annotation;

import com.example.beans.VehicleComponent;
import com.example.config.ProjectConfigComponentExample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentUseExample {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfigComponentExample.class);
        VehicleComponent vehicleComponent = context.getBean(VehicleComponent.class);
        System.out.println("Component Vehicle name from Spring context is: " + vehicleComponent.getName());
        vehicleComponent.printHello();
    }
}
