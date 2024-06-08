package com.example.hibernateinheritancemapping.tableinheritanceexamples.tableperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity(name = "tpc_user")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
