package com.github.nitsebrod.CoolZoo.animal.mapper;

import com.github.nitsebrod.CoolZoo.animal.dao.entity.Animal;
import com.github.nitsebrod.CoolZoo.animal.api.AnimalDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AnimalMapper {

    AnimalDto animalToDto(Animal animal);

    Animal animalDtoToEntity(AnimalDto animalDto);
}