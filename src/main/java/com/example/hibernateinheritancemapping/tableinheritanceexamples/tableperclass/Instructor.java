package com.example.hibernateinheritancemapping.tableinheritanceexamples.tableperclass;

import jakarta.persistence.Entity;

@Entity(name = "tpc_instructor")
public class Instructor extends User {
    private String Course;
}
