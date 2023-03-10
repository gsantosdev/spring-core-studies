package com.example.main.bean_annotation;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfigPrimaryExample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryAnottationExample {

    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfigPrimaryExample.class);

        /*A default bean was defined, so it will not throw exception when you don't pass the bean name */

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Primary Vehicle name from Spring context is: " + vehicle.getName());

    }
}
