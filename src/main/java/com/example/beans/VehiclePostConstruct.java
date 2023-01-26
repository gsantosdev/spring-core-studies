package com.example.beans;


import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class VehiclePostConstruct {

    private String name;

    @PostConstruct
    public void initialize() {
        this.name = "Honda";
    }

    public void printHello() {
        System.out.println("Printing Hello from Component Vehicle Bean");
    }
}
