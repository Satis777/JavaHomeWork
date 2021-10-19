package com.pb.tereschenko.hw3;

import java.util.Random;
import java.util.Scanner;


public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Загадано число от 0 до 100");
        System.out.println("Для выхода введите любое отрицательное число:");

        int hiddenNumber = random.nextInt(101);
        int counter = 0;

        do {
            System.out.println("Введите ваше число:");
            int number = scanner.nextInt();
            if (number >= 0) {
                counter++;
                if (number == hiddenNumber) {
                    System.out.println("Поздравляю вы угадали загаданное число: " + hiddenNumber + " всего с " + counter + " попыток");
                    break;
                } else if (number < hiddenNumber) {
                    System.out.println("Увы, загаданное число больше Вашего:");
                } else {
                    System.out.println("Увы, загаданное число меньше Вашего:");
                }
            } else {
                break;
            }

        } while (true);

        System.out.println("Конец игры.");
    }
}
