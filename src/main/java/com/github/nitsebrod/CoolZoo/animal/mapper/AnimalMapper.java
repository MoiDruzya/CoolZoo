package com.github.nitsebrod.CoolZoo.animal.mapper;

import com.github.nitsebrod.CoolZoo.animal.api.RequestAnimalDto;
import com.github.nitsebrod.CoolZoo.animal.api.ResponseAnimalDto;
import com.github.nitsebrod.CoolZoo.animal.dao.entity.Animal;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AnimalMapper {

    @Mapping(source = "id", target = "animalId")
    ResponseAnimalDto toDto(Animal animal);

    @Mapping(source = "animalId", target = "id")
    Animal toEntity(RequestAnimalDto requestAnimalDto);
}