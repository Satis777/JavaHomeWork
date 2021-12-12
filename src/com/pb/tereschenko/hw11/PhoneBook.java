package com.pb.tereschenko.hw11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Predicate;

public class PhoneBook {
    public static void main(String[] args) throws ParseException {
        System.out.println("|----------Welcome to Phone's Book!----------|");
        List<Person> persons = new ArrayList<>();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);
// Create test contact
        persons.add(new Person("Gala", formatDate.parse("31/01/1979"), "0969260052", "Dnepr"));
        persons.add(new Person("Алексей", formatDate.parse("07/03/1977"), "0961240420", "Dnepr"));
        persons.add(new Person("Семен", formatDate.parse("13/12/2009"), "095", "Dnepr"));
        boolean flag = true;

        do {

            String date;
            String phone;
            String name;
            String address;

            System.out.println("Сделайте Ваш выбор");
            System.out.println(
                    "1 - Создать контакт\n" +
                            "2 - Удалить контакт\n" +
                            "3 - Поиск контакта по имени\n" +
                            "4 - Отсортировать контакты\n" +
                            "5 - Редактировать контакт\n" +
                            "6 - Save phone book in file *.json\n" +
                            "7 - Import phone book\n" +
                            "8 - Просмотр всех записей\n" +
                            "0 - Выход");
            int choice = scan.nextInt();

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
                    persons.add(ps);
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
                    for (Person el : persons) {
                        if (el.getName().equals(name)) {
                            System.out.println(el.getName() + " ," + el.getAddress() +
                                    " ," + el.getDateBirthday());
                            for (String ph : el.getPhone()) {
                                System.out.println(ph);
                            }

                        }
                    }
                    break;
                case 4:
                    System.out.println("Выберете как отсотритьвать? \n" +
                            "1 - По имени\n" +
                            "2 - По дате рождения\n");
                    choice = scan.nextInt();
                    if (choice == 1) {
                        //Collections.sort(persons);
                        persons.sort(Comparator.comparing(Person::getName));
                        System.out.println(persons);
                    } else if (choice == 2) {
                        persons.sort(Comparator.comparing(Person::getDateBirthday));
                        System.out.println(persons);
                    }
                    break;
                case 5:
                    System.out.println("Введите имя для редактирования");
                    name = scan.next();
                    System.out.println("Выберете поле для редактирования \n" +
                            "1 - Имя\n" +
                            "2 - Дата рождения\n" +
                            "3 - Адрес\n" +
                            "4 - Добавить телефон\n");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Введите новое имя");
                            String newName = scan.next();
                            for (Person el : persons) {
                                if (el.getName().equals(name)) {
                                    String oldName = el.getName();
                                    el.setName(newName);
                                    el.setDateEdit(new Date());
                                    System.out.println("Запись изменена с " + oldName + " на " + newName);
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Введите новую дату рождения");
                            date = scan.next();
                            for (Person el : persons) {
                                if (el.getName().equals(name)) {
                                    el.setDateBirthday(formatDate.parse(date));
                                    el.setDateEdit(new Date());
                                    System.out.println("Запись изменена");
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Введите новый адрес");
                            address = scan.next();
                            for (Person el : persons) {
                                if (el.getName().equals(name)) {
                                    el.setAddress(address);
                                    el.setDateEdit(new Date());
                                    System.out.println("Запись изменена");
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Введите телефон");
                            phone = scan.next();
                            for (Person el : persons) {
                                if (el.getName().equals(name)) {
                                    el.getPhone().add(phone);
                                    el.setDateEdit(new Date());
                                    System.out.println("Телефон добавлен");
                                }
                            }
                            break;

                    }
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    for (Person el : persons) {
                        System.out.println(el);
                    }
                    break;
                case 0:
                    flag = false;
                    break;


            }
        } while (flag);

    }
}
