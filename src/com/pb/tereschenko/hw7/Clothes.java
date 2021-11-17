package com.pb.tereschenko.hw7;

public abstract class Clothes {
    protected String type;
    protected Size size;
    protected int price;
    protected String color;

    public Clothes(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
        // IllegalArgumentException
    }


}
