package com.example.hibernateinheritancemapping.tableinheritanceexamples.tableperclass;

import jakarta.persistence.Entity;

@Entity(name = "tpc_ta")
public class Ta extends User {
    private Integer rating;
}
