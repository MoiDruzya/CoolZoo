package com.github.nitsebrod.CoolZoo.animal.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class AnimalDto {
    private Long id;
    private String name;
    private String description;
    private Integer age;
    private String gender;
    private String type;
}
