package com.whoami.Models;

public class Student {
    private String name;
    private String userData; // All Adhar Info


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserData() {
        return userData;
    }

    public Student(String xml){
        int i = xml.lastIndexOf("name=\"");
        int j = xml.indexOf("gender");
        name = xml.substring(i,j);
        userData = xml;
    }
}
