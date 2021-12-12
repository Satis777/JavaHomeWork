package com.pb.tereschenko.hw11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Person implements Comparable<Person>{
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
        this.phone = new ArrayList<String>(Collections.singleton(phone));
        this.address = address;
        this.dateEdit = new Date();
    }


//    public Person(){
//        this.name = "www";
//        this.dateBirthday = new Date(12/05/1995);
//        this.address = "Test";
//        this.dateEdit = new Date();
//        this.phone = new ArrayList<>();
//        List<String> coolStringList = Arrays.asList("Java", "Scala", "Groovy");
//        phone.add("096");
//        phone.add("067");
//    }

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
                ", dateBirthday=" + formatDate.format(dateBirthday) +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", dateEdit=" + formatDate.format(dateEdit) +
                '}' + "\n";
    }

        public void createContact(String name,String date,String phone, String address) throws ParseException {
            this.name = name;
            this.dateBirthday = formatDate.parse(date);
            this.phone.add(phone);
            this.address = address;
            this.dateEdit = new Date();
        }

    @Override
    public int compareTo(Person person) {
        return 0;
        }

}
