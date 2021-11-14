package com.pb.tereschenko.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {


    public Pants(Size size, int price, String color) {
        super(size, price, color);
        type = "штаны";
    }

    @Override
    public void dressMan() {
        System.out.println("Название: " + type + "\n" + "Размер: " + size + " " +
                "(" + size.getEuroSize() + ", " + size.getDescription() + ")" +
                "\n" + "Цвет: " + color + "\n" + "Цена: " + price);;
    }

    @Override
    public void dressWomen() {
        System.out.println("Название: " + type + "\n" + "Размер: " + size + " " +
                "(" + size.getEuroSize() + ", " + size.getDescription() + ")" +
                "\n" + "Цвет: " + color + "\n" + "Цена: " + price);
    }
}
