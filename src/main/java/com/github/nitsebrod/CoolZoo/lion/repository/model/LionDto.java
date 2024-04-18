package com.github.nitsebrod.CoolZoo.lion.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
//todo Класс который мы будем передаватть по сети
public class LionDto {
    private Long id;
    private String name;
}
