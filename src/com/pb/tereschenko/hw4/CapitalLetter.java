package com.pb.tereschenko.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Вашу строку: ");
        String str = scanner.nextLine();
        FirstCapitalLetter(str);

    }

    static void FirstCapitalLetter(String s) {
        String outStr = "";
        outStr = outStr + s.substring(0, 1).toUpperCase();
        for (int i = 1; i < s.length(); i++) {
            if (" ".equals(s.substring(i - 1, i))) {
                outStr = outStr + s.substring(i, i + 1).toUpperCase();
            } else {
                outStr = outStr + s.substring(i, i + 1);
            }
        }
        System.out.println(outStr);
    }
}
