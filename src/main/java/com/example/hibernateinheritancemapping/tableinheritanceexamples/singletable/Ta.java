package com.example.hibernateinheritancemapping.tableinheritanceexamples.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "st_ta")
@DiscriminatorValue(value = "3")
public class Ta extends User {
    private Integer rating;
}
