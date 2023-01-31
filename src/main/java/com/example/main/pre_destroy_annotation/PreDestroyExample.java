package com.example.main.pre_destroy_annotation;

import com.example.beans.VehiclePreDestroy;
import com.example.config.ProjectConfigComponentExample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PreDestroyExample {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfigComponentExample.class);

        VehiclePreDestroy vehicle = context.getBean(VehiclePreDestroy.class);
        System.out.println("Component Vehicle name from" + "Spring Context is: " + vehicle.getName());
        vehicle.initialize();
        vehicle.close();
    }
}
