package com.pb.tereschenko.hw11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Predicate;

public class PhoneBook {
    public static void main(String[] args) throws ParseException {
        System.out.println("|----------Welcome to Phone's Book!----------|");
        ArrayList<Person> persons = new ArrayList<>();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);
// Create test contact
        persons.add(new Person());
        persons.add(new Person());
        persons.add(new Person());

        do {
            System.out.println("----------Enter number function:----------");
            System.out.println(
                    "1 - Создать контакт\n" +
                            "2 - Удалить контакт\n" +
                            "3 - Search contact\n" +
                            "4 - View sorting contact\n" +
                            "5 - Edite contact\n" +
                            "6 - Save phone book in file *.json\n" +
                            "7 - Import phone book\n" +
                            "9 - View phone's book\n" +
                            "0 - EXIT!");
            int choice = scan.nextInt();
            String name;
            String date;
            String phone;
            String address;

            switch (choice) {
                case 1:
                    System.out.println("Введите имя");
                    name = scan.next();
                    System.out.println("Введите дату рождения");
                    date = scan.next();
                    System.out.println("Введите телефон");
                    phone = scan.next();
                    System.out.println("Введите адрес");
                    address = scan.next();
                    Person ps = new Person();
                    ps.createContact(name, date, phone, address);
                    System.out.println("Контакт " + name + " создан!");
                    break;
                case 2:
                    System.out.println("Введите имя для удаления");
                    name = scan.next();
                    persons.removeIf(new Predicate<Person>() {
                        @Override
                        public boolean test(Person ps) {
                            return ps.getName().equals(name);
                        }
                    });
                    System.out.println("Контакт " + name + " удален!");
                    break;
                case 3:
                    System.out.println("Введите имя для поиска");
                    name = scan.next();

            }
        } while (true);

    }
}
