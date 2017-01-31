package com.example.elait.pms;

/**
 * Created by Shreya Gupta on 19-12-2016.
 */

public class Contact {
    String id;
    String age, contact_no;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {

        this.date = date;
    }

    String name, gender, date;

    public void setId(String id) {

        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setage(String age) {
        this.age = age;

    }

    public String getage() {

        return age;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;

    }

    public String getContact_no() {

        return contact_no;
    }

    public void setname(String name) {
        this.name = name;

    }

    public String getname() {
        return name;
    }

    public void setgender(String gender) {
        this.gender = gender;

    }

    public String getgender() {

        return gender;
    }

}