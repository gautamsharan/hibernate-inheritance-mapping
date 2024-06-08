package com.example.hibernateinheritancemapping.tableinheritanceexamples.joinedclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity(name = "jc_user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
