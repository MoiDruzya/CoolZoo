package com.github.nitsebrod.CoolZoo.animal.mapper;

import com.github.nitsebrod.CoolZoo.animal.api.AnimalDto;
import com.github.nitsebrod.CoolZoo.animal.api.CreateAnimalDto;
import com.github.nitsebrod.CoolZoo.animal.api.ResponseAnimalDto;
import com.github.nitsebrod.CoolZoo.animal.dao.entity.Animal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AnimalMapper {

    //todo орет красным, но мавен собирает.
    // Попробовать удалить аннотацию и собрать проект. Мейби это излишнеее
    @Mapping(target = "animalId", source = "animal.id")
    AnimalDto entityToDto(Animal animal);

    Animal dtoToEntity(AnimalDto animalDto);

    Animal createDtoToEntity(CreateAnimalDto createAnimalDto);

    @Mapping(target = "animalId", source = "animal.id")
    ResponseAnimalDto entityToResponseDto(Animal animal);
}