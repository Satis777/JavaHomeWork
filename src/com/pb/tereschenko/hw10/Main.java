package com.pb.tereschenko.hw10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{10, 45, null, 5};
        NumBox<Integer> integerNumBox = new NumBox<>(integers);

        Float[] floats = new Float[]{20.00f, null, 2.45f};
        NumBox<Float> floatNumBox = new NumBox<>(floats);

        System.out.println("Методы массива integerNumBox");

        System.out.println("Количество элементов в массиве: " + integerNumBox.length());

        try {
            integerNumBox.add(7);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }


        try {
            System.out.println(integerNumBox.get(1));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Среднее арифметическое: " + integerNumBox.average());

        System.out.println("Сумма всех элементов массива: " + integerNumBox.sum());
        System.out.println("Максимальный элемент массива: " + integerNumBox.max());
        System.out.println();

        System.out.println("Методы массива floatNumBox");


        System.out.println("Количество элементов в массиве: " + floatNumBox.length());

        try {
            floatNumBox.add(7.00f);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }


        try {
            System.out.println(floatNumBox.get(2));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Среднее арифметическое: " + floatNumBox.average());

        System.out.println("Сумма всех элементов массива: " + floatNumBox.sum());
        System.out.println("Максимальный элемент массива: " + floatNumBox.max());


    }

}
