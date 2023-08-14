package com.prac.designPettern.adapter;

public class AirConditioner implements Electronic220V{
    @Override
    public void connect() {
        System.out.println("AirConditioner 220v On");
    }
}
