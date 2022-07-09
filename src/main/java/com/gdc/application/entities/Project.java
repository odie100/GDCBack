package com.gdc.application.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Project {
    @Id
    @SequenceGenerator(name = "project_generator", sequenceName = "project_generator", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_generator")
    Long id;
    String title;
    String delay;
    String budget;
    String details;
    Date start;
    Date end;
}
