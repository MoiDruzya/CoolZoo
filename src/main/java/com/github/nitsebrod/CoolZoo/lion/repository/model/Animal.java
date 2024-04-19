package com.github.nitsebrod.CoolZoo.lion.repository.model;

import jakarta.persistence.*;
import lombok.*;

//todo Класс, в который мы будем мапить entity из базы данных
@Getter
@Setter
@ToString
@RequiredArgsConstructor
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
