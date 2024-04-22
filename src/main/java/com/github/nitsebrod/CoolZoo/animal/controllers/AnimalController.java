package com.github.nitsebrod.CoolZoo.animal.controllers;

import com.github.nitsebrod.CoolZoo.animal.api.AnimalDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;

public interface AnimalController {

    @ApiOperation(value = "Получение животного по типу")
//    @GetMapping(value = "/{animal_type}")
    public AnimalDto getAnimalByGender(String gender );

    @ApiOperation(value = "Получение животного по типу")
    @GetMapping(value = "/{animal_type}")
    public AnimalDto getAnimalByType(String type);

    @ApiOperation(value = "Получение животного по типу")
//    @GetMapping(value = "/{animal_type}")
    public Page<AnimalDto> getAllAnimals(Pageable pageable);

    @ApiOperation(value = "Получение животного по типу")
//    @GetMapping(value = "/{animal_type}")
    public AnimalDto saveNewAnimal(AnimalDto animal);

    @ApiOperation(value = "Получение животного по типу")
//    @GetMapping(value = "/{animal_type}")
    public void deleteAnimalById(Long animalId);

    @ApiOperation(value = "Получение животного по типу")
//    @GetMapping(value = "/{animal_type}")
    public AnimalDto updateAnimal(AnimalDto animal);
}
