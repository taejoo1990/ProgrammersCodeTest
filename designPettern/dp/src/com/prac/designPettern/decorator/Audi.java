package com.prac.designPettern.decorator;

public class Audi implements ICar{
    private int price;

    public Audi(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void showPrice() {
        System.out.println("audiの値段は" +price+"円でございます。");
    }
}
