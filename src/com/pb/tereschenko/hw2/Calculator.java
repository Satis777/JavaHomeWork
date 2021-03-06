package com.pb.tereschenko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int operand1 = scan.nextInt();

        System.out.println("Введите второе число: ");
        int operand2 = scan.nextInt();

        System.out.println("Введите знак арифметической операции: ");
        String sign = scan.next();

        switch (sign){
            case "+":
                System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
            break;
            case "-":
                System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
            break;
            case "*":
                System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
            break;
            case "/":
                if (operand2 != 0){
                    System.out.println(operand1 + " / " + operand2 + " = " + (operand1 / operand2));
                } else {
                    System.out.println("Ошибка, на 0 делить нельзя!");
                }
            break;
            default:
                System.out.println("Данная операция " + sign + " не допустима. Допустимые операции (+, -, *, /). ");

        }


    }
}
