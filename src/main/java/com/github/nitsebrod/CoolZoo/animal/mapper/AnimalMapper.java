package com.github.nitsebrod.CoolZoo.animal.mapper;

import com.github.nitsebrod.CoolZoo.animal.api.AnimalDto;
import com.github.nitsebrod.CoolZoo.animal.dao.entity.Animal;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Bean;

@Mapper(componentModel = "spring")
public interface AnimalMapper {

    AnimalDto toDto(Animal animal);

    Animal toEntity(AnimalDto animalDto);
}