package com.gdc.application.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
public class Diploma {
    @Id
    @SequenceGenerator(name = "diploma_generator", sequenceName = "diploma_generator", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "diploma_generator")
    Long id;
    String title;
    Date date;
}
