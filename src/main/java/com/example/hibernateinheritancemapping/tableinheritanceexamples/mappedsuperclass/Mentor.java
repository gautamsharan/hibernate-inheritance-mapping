package com.example.hibernateinheritancemapping.tableinheritanceexamples.mappedsuperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "msc_mentor")
public class Mentor extends User {
    private Long numOfHours;
}
