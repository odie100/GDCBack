package com.gdc.application.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Partenaria {
    @SequenceGenerator(name = "partenaria_generator", sequenceName = "partenaria_generator", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "partenaria_generator")
    Long id;
    String photo;
    String name;
    String description;
}
