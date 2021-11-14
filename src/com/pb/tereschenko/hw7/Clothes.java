package com.pb.tereschenko.hw7;

public abstract class Clothes {
    String type;
    Size size;
    int price;
    String color;

    public Clothes(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }


}
