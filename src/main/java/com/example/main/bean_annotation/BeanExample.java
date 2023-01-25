package com.example.main.bean_annotation;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanExample {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());

        /*-----------------------------------------------------------------------------------*/

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        /*
        We don't need to do any explicit casting while fetching a bean from context.
        Spring is smart enough to look for a bean of the type you requested in its context.
        if such a bean doesn't exist, Spring will throw an exception.
        */
        String hello = context.getBean(String.class);
        System.out.println("String value from Spring context is: " + hello);
        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from Spring context is: " + num);

    }
}
