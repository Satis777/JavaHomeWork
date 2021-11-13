package com.pb.tereschenko.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {


    public Tshirt(Size size, int price, String color) {
        super(size, price, color);
        type = "футболка";
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
