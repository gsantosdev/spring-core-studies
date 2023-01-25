package com.example.beans;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
@Component
public class VehicleComponent {

    private String name;

    public void printHello() {
        System.out.println("Printing Hello from Component Vehicle Bean");
    }
}
