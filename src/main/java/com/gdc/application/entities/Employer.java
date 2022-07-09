package com.gdc.application.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Employer {
    @Id
    @SequenceGenerator(name = "employer_generator", sequenceName = "employer_generator", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employer_generator")
    Long id;
    String name;
    String firstname;
    String phone_number;
    String address;
}
