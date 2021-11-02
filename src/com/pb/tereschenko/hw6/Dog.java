package com.pb.tereschenko.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String coatLength;

    public Dog(String food, String location, String coatLength) {
        super(food, location);
        type = "Собака";
        this.coatLength = coatLength;
    }

    @Override
    public void eat() {
        System.out.println(coatLength + " " + type + " грызет " + food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Gav-Gav");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "coatLength='" + coatLength + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(coatLength, dog.coatLength) && Objects.equals(food, dog.food) && Objects.equals(location, dog.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coatLength, food, location);
    }
}
