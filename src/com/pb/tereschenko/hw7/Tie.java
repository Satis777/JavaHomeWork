package com.pb.tereschenko.hw7;

public class Tie extends Clothes implements ManClothes {

    public Tie(Size size, int price, String color) {
        super(size, price, color);
        type = "галстук";
    }

    @Override
    public void dressMan() {
        super.dressMan();
    }
}
