package com.gdc.application.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class TypeJob {
    @Id
    @SequenceGenerator(name = "type_j_generator", sequenceName = "type_j_generator")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "type_j_generator")
    Long id;
    String photo;
    String name;
    String description;
}
