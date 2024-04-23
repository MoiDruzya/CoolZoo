package com.github.nitsebrod.CoolZoo.animal.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "animal_generator")
    @SequenceGenerator(name = "animal_generator", sequenceName = "animal_id_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String description;
    private Integer age;
    private String gender;
    private String type;
}
