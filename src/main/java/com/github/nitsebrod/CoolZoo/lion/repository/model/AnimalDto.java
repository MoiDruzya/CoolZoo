package com.github.nitsebrod.CoolZoo.lion.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
//todo Класс который мы будем передаватть по сети
public class AnimalDto {
    private Long id;
    private String name;
    private String description;
    private Integer age;
    private String gender;
    private String type;
}