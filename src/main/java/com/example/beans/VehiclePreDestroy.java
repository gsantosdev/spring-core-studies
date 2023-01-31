package com.example.beans;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class VehiclePreDestroy {

    private String name;


    @PostConstruct
    public void initialize() {
        this.name = "Honda";
    }

    @PreDestroy
    public void close() {
        System.out.println("Destroying Vehicle Bean");;
    }

    public void printHello() {
        System.out.println("Printing Hello from Component Vehicle Bean");
    }
}
