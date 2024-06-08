package com.example.hibernateinheritancemapping.tableinheritanceexamples.mappedsuperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "msc_instructor")
public class Instructor extends User {
    private String Course;
}
