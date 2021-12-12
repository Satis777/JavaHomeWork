package com.pb.tereschenko.hw11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Person implements Comparable<Person> {
    private String name;
    private Date dateBirthday;
    private List<String> phone;
    private String address;
    private Date dateEdit;
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

    public Person() {
    }

    public Person(String name, Date dateBirthday, String phone, String address) {
        this.name = name;
        this.dateBirthday = dateBirthday;
        this.phone = new ArrayList<>(Collections.singleton(phone));
        this.address = address;
        this.dateEdit = new Date();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(Date dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public List<String> getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateEdit() {
        return dateEdit;
    }

    public void setDateEdit(Date dateEdit) {
        this.dateEdit = dateEdit;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateBirthday=" + formatDate.format(dateBirthday) +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", dateEdit=" + formatDate.format(dateEdit) +
                '}' + "\n";
    }

    public String info() {
        return name + " " + formatDate.format(dateBirthday) + " " + address;

    }

    public void createContact(String name, String date, String phone, String address) throws ParseException {
        this.name = name;
        this.dateBirthday = formatDate.parse(date);
        this.phone= Collections.singletonList(phone);
        this.address = address;
        this.dateEdit = new Date();
    }

    @Override
    public int compareTo(Person person) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(dateBirthday, person.dateBirthday) &&
                Objects.equals(phone, person.phone) &&
                Objects.equals(address, person.address) &&
                Objects.equals(dateEdit, person.dateEdit) &&
                Objects.equals(formatDate, person.formatDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateBirthday, phone, address, dateEdit, formatDate);
    }
}
