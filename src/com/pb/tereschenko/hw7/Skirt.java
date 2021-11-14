package com.pb.tereschenko.hw7;

public class Skirt extends Clothes implements WomenClothes{

    public Skirt(Size size, int price, String color) {
        super(size, price, color);
        type = "юбка";
    }

    @Override
    public void dressWomen() {
        System.out.println("Название: " + type + "\n" + "Размер: " + size + " " +
                "(" + size.getEuroSize() + ", " + size.getDescription() + ")" +
                "\n" + "Цвет: " + color + "\n" + "Цена: " + price);
    }
}
