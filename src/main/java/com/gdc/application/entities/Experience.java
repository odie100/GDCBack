package com.gdc.application.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Experience {
    @Id
    @SequenceGenerator(name = "xp_generator", sequenceName = "xp_generator", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "xp_generator")
    Long id;
    String duration;
    String occupation;
    String enterprise;
}
