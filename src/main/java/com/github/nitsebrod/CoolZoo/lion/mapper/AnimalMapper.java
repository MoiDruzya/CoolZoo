package com.github.nitsebrod.CoolZoo.lion.mapper;

import com.github.nitsebrod.CoolZoo.lion.repository.model.Animal;
import com.github.nitsebrod.CoolZoo.lion.repository.model.AnimalDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AnimalMapper {

    AnimalDto animalToDto(Animal animal);

    Animal animalDtoToEntity(AnimalDto animalDto);
}