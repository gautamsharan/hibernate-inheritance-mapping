package com.example.hibernateinheritancemapping.tableinheritanceexamples.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "st_instructor")
@DiscriminatorValue(value = "1")
public class Instructor extends User {
    private String Course;
}
