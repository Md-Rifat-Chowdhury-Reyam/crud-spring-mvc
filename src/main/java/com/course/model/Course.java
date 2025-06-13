package com.course.model;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String instructor;
    private String email;

    // Constructors, getters, and setters
    public Course() {}

    public Course(String name, String instructor, String email) {
        this.name = name;
        this.instructor = instructor;
        this.email = email;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getInstructor() { return instructor; }
    public void setInstructor(String instructor) { this.instructor = instructor; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}