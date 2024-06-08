package com.example.hibernateinheritancemapping.tableinheritanceexamples.tableperclass;

import jakarta.persistence.Entity;

@Entity(name = "tpc_mentor")
public class Mentor extends User {
    private Long numOfHours;
}
