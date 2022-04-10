package com.example.models;

import java.io.Serializable;

public class Student implements Serializable {
    private String firstName, lastName;
    private Integer age;

    public Student() {

    }

    public Student(String firstname, String lastName, Integer age) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName.toUpperCase();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
