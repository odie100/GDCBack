package com.gdc.application.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
public class OrganisationType {
    @Id
    @SequenceGenerator(name = "ot_generator", sequenceName = "ot_generator", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ot_generator")
    Long id;
    String name;
}
