package com.prac.designPettern.adapter;

public class Cleaner implements Electronic220V{
    @Override
    public void connect() {
        System.out.println("cleaner 220v On");
    }
}
