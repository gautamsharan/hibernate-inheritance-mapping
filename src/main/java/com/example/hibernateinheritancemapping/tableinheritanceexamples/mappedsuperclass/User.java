package com.example.hibernateinheritancemapping.tableinheritanceexamples.mappedsuperclass;

import jakarta.persistence.*;

@MappedSuperclass
public class User {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
