package com.pb.tereschenko.hw7;

public class Tie extends Clothes implements ManClothes {

    public Tie(Size size, int price, String color) {
        super(size, price, color);
        type = "галстук";
    }

    @Override
    public void dressMan() {
        System.out.println("Название: " + type + "\n" + "Размер: " + size + " " +
                "(" + size.getEuroSize() + ", " + size.getDescription() + ")" +
                "\n" + "Цвет: " + color + "\n" + "Цена: " + price);
    }
}
