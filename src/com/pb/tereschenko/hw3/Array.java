package com.pb.tereschenko.hw3;

import java.util.Scanner;

/**
 * Создайте класс Array в пакете hw3.Программа должна позволить пользователю ввести одномерный массив целых чисел размерностью 10 элементов.
 * Вывести на экран введенный массив.
 * Подсчитать сумму всех элементов массива и вывести ее на экран.
 * Подсчитать и вывести на экран количество положительных элементов.
 * Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком. (https://en.wikipedia.org/wiki/Bubble_sort)
 * Вывести на экран отсортированный массив.
 */

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Введите числа для заполнения массива из 10 элементов:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int el : array) {
            System.out.print(el + " ");
        }
        System.out.println();

        int sum = 0;
        for (int el : array) {
            sum += el;
        }
        System.out.println("Сумма всех элементов = " + sum);

        int positiveCounter = 0;
        int negativeCounter = 0;
        for (int el : array) {
            if (el >= 0) {
                positiveCounter++;
            } else {
                negativeCounter++;
            }
        }
        System.out.println("Количество положительных чисел: " + positiveCounter);
        System.out.println("Количество отрицательных чисел: " + negativeCounter);

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        System.out.println("Отсортированный масив");
        for (int el:array){
            System.out.print(el + " ");
        }
    }
}
