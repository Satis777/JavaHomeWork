package com.pb.tereschenko.hw9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;

import static com.pb.tereschenko.hw9.LoggingExamples.*;


public class FileNumbers {
    public static void main(String[] args) {


        createNumbersFile();
        createOddNumbersFile();

    }

    public static void createNumbersFile() {

        LOGGER.log(Level.INFO, "start createNumbersFile");
        Random random = new Random();
        try (FileWriter writer = new FileWriter("numbers.txt", false)) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    int number = random.nextInt(99) + 1;
                    writer.write(number + " ");
                }
                writer.append('\n');
            }
            LOGGER.log(Level.INFO, "File recorded");
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
            System.out.println(e.getMessage());
        }

    }


    public static void createOddNumbersFile() {
        LOGGER.log(Level.INFO, "start createOddNumbersFile");

        try (
                FileReader fr = new FileReader("numbers.txt");
                FileWriter fw = new FileWriter("old-numbers.txt", false);
        ) {
            Scanner scanner = new Scanner(fr);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(" ");
                for (String el : numbers) {
                    int num = Integer.parseInt(el);
                    if (num % 2 != 0) {
                        fw.write(num + " ");
                    } else fw.write(0 + " ");
                }
                fw.append('\n');
            }
            LOGGER.log(Level.INFO, "File read");
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
            System.out.println(e.getMessage());
        }

    }
}

