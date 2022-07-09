package com.gdc.application.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Speciality {
    @Id
    @SequenceGenerator(name = "spec_generator", sequenceName = "spec_generator",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "spec_generator")
    Long id;
    String name;
    String description;
}
