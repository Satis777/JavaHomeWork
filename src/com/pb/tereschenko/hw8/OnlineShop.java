package com.pb.tereschenko.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth auth = new Auth();
        Scanner scanner = new Scanner(System.in);
        String login = null;
        String password = null;
        String confirmPassword = null;

        do {
            System.out.println("Для выхода в поле \"Логин\" введите exit");
            System.out.println("Для регистрации введите логин:");
            login = scanner.nextLine();

            if (!login.equals("exit")) {
                System.out.println("Введите пароль:");
                password = scanner.nextLine();
                System.out.println("Введите пароль еще раз:");
                confirmPassword = scanner.nextLine();

                try {
                    auth.signUp(login, password, confirmPassword);
                    break;
                } catch (WrongException e) {
                    System.out.println(e.getMessage());
                }
            } else break;


        } while (true);
        System.out.println();

        do {
            if (login.equals("exit")) {
                break;
            } else if (!login.equals("exit")) {
                System.out.println("Для выхода в поле \"Логин\" введите exit");
                System.out.println("Для авторизации введите логин: ");
                login = scanner.nextLine();
            }
            if (!login.equals("exit")) {
                System.out.println("Введите пароль:");
                password = scanner.nextLine();

                try {
                    auth.signIn(login, password);
                    break;
                } catch (WrongException e) {
                    System.out.println(e.getMessage());
                }
            } else break;
        } while (true);
    }

}