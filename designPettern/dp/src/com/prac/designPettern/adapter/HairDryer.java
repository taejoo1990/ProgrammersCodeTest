package com.prac.designPettern.adapter;

public class HairDryer implements Electronic110V{

    @Override
    public void powerOn() {
        System.out.println("hair Dryer 110v on");
    }
}
