package com.pb.tereschenko.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {


    public Pants(Size size, int price, String color) {
        super(size, price, color);
        type = "штаны";
    }

    @Override
    public void dressMan() {
        super.dressMan();
    }

    @Override
    public void dressWomen() {
        super.dressWomen();
    }
}
