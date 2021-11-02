package com.pb.tereschenko.hw6;


public abstract class Animal {
    protected String food;
    protected String location;
    protected String type;


    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {

    }

    public void eat() {
        System.out.println(type + " ест " + food);
    }

    public void sleep() {
        System.out.println(type + " спит");
    }

}
