package com.pb.tereschenko.hw6;

import java.util.Objects;

public class Horse extends Animal {
    private String suit;

    public Horse(String food, String location, String suit) {
        super(food, location);
        type = "Конь";
        this.suit = suit;
    }

    @Override
    public void makeNoise() {
        System.out.println(suit + " " + type + " Igo-go");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "suit='" + suit + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(suit, horse.suit) && Objects.equals(food, horse.food) && Objects.equals(location, horse.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, food, location);
    }
}
