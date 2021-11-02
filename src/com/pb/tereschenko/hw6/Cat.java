package com.pb.tereschenko.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        type = "Кот";
        this.color = color;
    }


    @Override
    public void eat() {
        System.out.println(color + " " + type + " ловит " + food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }


    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color) && Objects.equals(food, cat.food) && Objects.equals(location, cat.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, food, location);
    }
}
