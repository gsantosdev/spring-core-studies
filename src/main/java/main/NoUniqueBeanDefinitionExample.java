package main;

import beans.Vehicle;
import config.ProjectConfig;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NoUniqueBeanDefinitionExample {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        try {
            Vehicle veh = context.getBean(Vehicle.class);
        } catch (NoUniqueBeanDefinitionException e) {
            System.out.println("Throws exception because the specific bean name wasn't specified");
        }

        Vehicle veh1 = context.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());



    }
}
