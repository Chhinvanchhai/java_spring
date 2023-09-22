package com.example.demo.student;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public class Stutdent {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    // @SequenceGenerator(name = "students_sequence", sequenceName = "students_sequence", allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "students_sequence")
    private long id;
    private String name;
    private String email;

    public Stutdent(long id, String name, int age, String email, LocalDate dob) {
        this.id = id;
        this.name = name;
        // this.age = age;
        this.email = email;
        // this.dob = dob;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public int getAge() {
    //     return age;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // public LocalDate getDob() {
    //     return dob;
    // }

    // public void setDob(LocalDate dob) {
    //     this.dob = dob;
    // }
}
