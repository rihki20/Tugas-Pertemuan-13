package com.example.recycler;

// Student.java
public class Student {
    private String nim;
    private String name;
    private String email;
    private String dateOfBirth;

    public Student(String nim, String name, String email, String dateOfBirth) {
        this.nim = nim;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
