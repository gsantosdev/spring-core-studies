package com.example.beans;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleRegisterBean {
    private String name;

    public void printHello(){
        System.out.println("Printing Hello from COmponent Vehicle Bean");
    }
}
