package com.course.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
The Model layer represents the data structure of the application.
 In this case, we will create a Course entity that maps to a database table.
 */
@NoArgsConstructor //@NoArgsConstructor: This annotation generates constructors with no arguments.
@AllArgsConstructor //@AllArgsConstructor: This annotation generates constructors with all field arguments
@Data //@Data: This annotation generates getters, setter, toString, required argument constructors,  equals & hashCode.
@Entity //@Entity: This annotation defines that a class can be mapped to a table.
@Table(name = "courses") //@Table: This annotation specifies the name of the database table used for mapping.
public class CourseModel {
    @Id //@Id: This annotation marks the primary key for the entity.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedValue: This annotation provides the specification of generation strategies for the values of the primary keys.
    private long id;

    @Column(name = "course-name") //@Column: This annotation marks the column name in the table for that particular attribute.
    private String courseName;

    @Column(name = "instructor")
    private String instructor;

    @Column (name = "email")
    private String email;

}
