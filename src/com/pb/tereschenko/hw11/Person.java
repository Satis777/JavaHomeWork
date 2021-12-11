package com.pb.tereschenko.hw11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private Date dateBirthday;
    private final List<String> phone;
    private String address;
    private Date dateEdit;
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

    public Person(String name, Date dateBirthday, List<String> phone, String address, Date dateEdit) {
        this.name = name;
        this.dateBirthday = dateBirthday;
        this.phone = phone;
        this.address = address;
        this.dateEdit = dateEdit;
    }

    public Person(){
        this.name = "Test";
        this.dateBirthday = new Date();
        this.address = "Test";
        this.dateEdit = new Date();
        this.phone = new ArrayList<>();
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

    public SimpleDateFormat getFormatDate() {
        return formatDate;
    }

    public void setFormatDate(SimpleDateFormat formatDate) {
        this.formatDate = formatDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateBirthday=" + dateBirthday +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", dateEdit=" + dateEdit +
                ", formatDate=" + formatDate +
                '}';
    }

        public void createContact(String name,String date,String phone, String address) throws ParseException {
            this.name = name;
            this.dateBirthday = formatDate.parse(date);
            this.phone.add(phone);
            this.address = address;
            this.dateEdit = new Date();
        }

    }
