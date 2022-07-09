package com.gdc.application.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Organization {
    @Id
    @SequenceGenerator(name = "org_generator", sequenceName = "org_generator", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "org_generator")
    Long id;
    String name;
    String address;
    String phone_number;
    String email;
}
