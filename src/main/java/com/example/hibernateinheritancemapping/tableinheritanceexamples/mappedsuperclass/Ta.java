package com.example.hibernateinheritancemapping.tableinheritanceexamples.mappedsuperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "msc_ta")
public class Ta extends User {
    private Integer rating;
}
