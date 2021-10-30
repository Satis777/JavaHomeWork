package com.pb.tereschenko.hw5;


public class Library {
    public static void main(String[] args) {
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Петров В.В.", 1, "Математический", "07.03.1977", "0961231230");
        readers[1] = new Reader("Иванов Ф.А.", 2, "Механический", "30.10.2001", "0975431452");
        readers[2] = new Reader("Сидоров П.П.", 3, "Философия", "05.05.2003", "0501112233");
        readers[3] = new Reader("Терхов С.Г.", 4, "Механический", "12.09.2001", "0960960960");
        readers[4] = new Reader("Мирославский М.Л.", 6, "IT", "04.08.1993", "0677625841");


        Book[] books = new Book[5];
        books[0] = new Book("Словарь", "Петровский П.Ю.", 1956);
        books[1] = new Book("Энциклопедия", "Ивашкевич А.С.", 2000);
        books[2] = new Book("Справочник", "Кукушкин К.К.", 2020);
        books[3] = new Book("Детектив", "Воробьев С.Т.", 2007);
        books[4] = new Book("Приключения", "Голубенко Р.П.", 1977);


        System.out.println("Список всех книг:");
        for (int i = 0; i < books.length; i++) {
            String title = books[i].getBookTitle();
            String author = books[i].getBookAuthor();
            int year = books[i].getYearEdition();
            System.out.println("Название: " + title + ", " + "Автор: " + author + ", " + year + "г.");
        }
        System.out.println();
        System.out.println("Список всех читателей:");
        for (int i = 0; i < readers.length; i++) {
            int id = readers[i].getIdReader();
            String name = readers[i].getFullName();
            String faculty = readers[i].getFaculty();
            String birth = readers[i].getDob();
            String phone = readers[i].getPhone();
            System.out.println("Id: " + id + ", " + "ФИО: " + name + ", " + birth + " г.р." + ", " + "Факультет: " + faculty + ", " + "Телефон: " + phone);
        }
        System.out.println();

        System.out.println("Пример работы метода takeBook:");
        readers[2].takeBook(3);
        readers[3].takeBook(books[0].getBookTitle(), books[2].getBookTitle(), books[4].getBookTitle());
        readers[4].takeBook(books[1], books[3], books[4]);

        System.out.println();
        System.out.println("Пример работы метода returnBook:");
        readers[2].returnBook(3);
        readers[3].returnBook(books[0].getBookTitle(), books[2].getBookTitle(), books[4].getBookTitle());
        readers[4].returnBook(books[1], books[3], books[4]);

    }

}



