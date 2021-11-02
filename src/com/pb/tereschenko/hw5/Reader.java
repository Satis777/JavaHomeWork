package com.pb.tereschenko.hw5;

public class Reader {
    private String fullName;
    private int idReader;
    private String faculty;
    private String dob;
    private String phone;

    public Reader(String fullName, int idReader, String faculty, String dob, String phone) {
        this.fullName = fullName;
        this.idReader = idReader;
        this.faculty = faculty;
        this.dob = dob;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public int getIdReader() {
        return idReader;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDob() {
        return dob;
    }

    public String getPhone() {
        return phone;
    }

    public void takeBook(int numberBooks) {
        System.out.println(fullName + " взял " + numberBooks + " книги");
    }

    public void takeBook(String... titles) {
        String str = "";
        for (String title : titles) {
            str = str + title + ", ";
        }
        System.out.println(fullName + " взял книги: " + str);
    }

    public void takeBook(Book... books) {
        String str = "";
        for (int i = 0; i < books.length; i++) {
            str = str + books[i].getBookTitle() + " (" + books[i].getBookAuthor() + " " + books[i].getYearEdition() + " г.), ";
        }
        System.out.println(fullName + " взял книги: " + str);

    }

    public void returnBook(int numberBooks) {
        System.out.println(fullName + " вернул " + numberBooks + " книги");
    }

    public void returnBook(String... titles) {
        String str = "";
        for (String title : titles) {
            str = str + title + ", ";
        }
        System.out.println(fullName + " вернул книги: " + str);
    }

    public void returnBook(Book... books) {
        String str = "";
        for (int i = 0; i < books.length; i++) {
            str = str + books[i].getBookTitle() + " (" + books[i].getBookAuthor() + " " + books[i].getYearEdition() + " г.), ";
        }
        System.out.println(fullName + " вернул книги: " + str);
    }

}
