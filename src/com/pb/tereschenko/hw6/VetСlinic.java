package com.pb.tereschenko.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception {
        Animal[] animals = new Animal[]{
                new Cat("мышь", "дом", "белый"),
                new Dog("кость", "будка", "длинношерстная"),
                new Horse("сено", "сарай", "вороной"),
                new Cat("хомяк", "комната", "пепельный"),
                new Cat("мышь", "дом", "белый"),
        };
        System.out.println("Пример работы методов sleep(), eat(), makeNoise()");
        for (Animal el : animals) {
            el.sleep();
            el.eat();
            el.makeNoise();
            System.out.println();
        }

        System.out.println("Сравниваем два объекта");
        System.out.println(animals[0].equals(animals[4]));
        System.out.println();

        /*
        Создание объекта класса Veterinarian с помощью рефлексии
        */

        Class clazz = Class.forName("com.pb.tereschenko.hw6.Veterinarian");
        Constructor constr = clazz.getConstructor(new Class[]{});
        Object obj = constr.newInstance();

        System.out.println("Посещение животными ветеринара, метод treatAnimal()");

        for (Animal el : animals) {
            ((Veterinarian) obj).treatAnimal(el);
        }

    }
}
