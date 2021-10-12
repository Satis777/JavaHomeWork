package com.pb.tereschenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int number = scan.nextInt();

        if (number >= 0 && number <= 100) {
            if (number <= 14) {
                System.out.println("Ваше число " + number + "  попало в диапазон то 0 до 14");
            } else if (number <= 35) {
                System.out.println("Ваше число " + number + "  попало в диапазон то 15 до 35");
            } else if (number <= 50) {
                System.out.println("Ваше число " + number + "  попало в диапазон то 36 до 50");
            } else {
                System.out.println("Ваше число " + number + "  попало в диапазон то 51 до 100");
            }
        } else {
            System.out.println("Ваше число " + number + "  не попало в диапазон то 0 до 100");
        }


    }
}
