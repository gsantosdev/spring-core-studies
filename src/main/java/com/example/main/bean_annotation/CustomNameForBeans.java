package com.example.main.bean_annotation;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfigBeanExample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomNameForBeans {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfigBeanExample.class);

        Vehicle audi = context.getBean("audiVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + audi.getName());

        Vehicle honda = context.getBean("hondaVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + honda.getName());

        Vehicle ferrari = context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + ferrari.getName());

    }
}
