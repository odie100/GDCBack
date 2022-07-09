package com.gdc.application.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Student {
    @Id
    @SequenceGenerator(name = "student_generator", sequenceName = "student_generator", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_generator")
    Long id;
    String name;
    String firstname;
    String phone_number;
    String address;
    String spinneret;
}
