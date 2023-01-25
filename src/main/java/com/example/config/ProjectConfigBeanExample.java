package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/*
    Spring @Configuration annotation is part of the spring core framework.
    Spring Configuration annotation indicates that the class has @Bean definition methods.
    So spring container can process the class and generate spring beans to be used in the application.
 */
@Configuration
public class ProjectConfigBeanExample {

    /*---------------------UsingBeanExamples-------------------------------*/

    /*
        @Bean Annotation, wich lets Spring know that it needs to call this method when it initializes its context and
        adds the return value to the context
     */
    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    /*
    The method names usually follow verbs notation. But for methods
    which we will use to create beans, can use nouns as names.
    This will be a good practise as the method names will become
    beans names as well in the context.
     */

    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 16;
    }





    /*---------------------NoUniqueBeansExample-------------------------------*/


    @Bean
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }




    /*---------------------CustomNamingExample-------------------------------*/


    /* ALL APPROACHES ARE VALID*/
    @Bean(name = "audiVehicle")
    Vehicle vehicle4() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean(value = "hondaVehicle")
    Vehicle vehicle5() {
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean("ferrariVehicle")
    Vehicle vehicle6() {
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }


}


