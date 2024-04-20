package com.github.nitsebrod.CoolZoo.animal.dao.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "Animal")
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "animal_generator")
    @SequenceGenerator(name = "animal_generator",
            sequenceName = "animal_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String description;
    private Integer age;
    private String gender;
    private String type;
}
