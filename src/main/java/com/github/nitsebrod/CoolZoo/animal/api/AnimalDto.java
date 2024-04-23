package com.github.nitsebrod.CoolZoo.animal.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnimalDto {
    private Long animalId;
    private String description;
    private String name;
    private Integer age;
    private String gender;
    private String type;
}
