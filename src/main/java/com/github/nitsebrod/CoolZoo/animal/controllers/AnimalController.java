package com.github.nitsebrod.CoolZoo.animal.controllers;

import com.github.nitsebrod.CoolZoo.animal.api.RequestAnimalDto;
import com.github.nitsebrod.CoolZoo.animal.api.ResponseAnimalDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;

public interface AnimalController {

    @ApiOperation(value = "Получение животного по типу")
//    @GetMapping(value = "/{animal_type}")
    public ResponseAnimalDto getAnimalByGender(String gender);

    @ApiOperation(value = "Получение животного по типу")
    @GetMapping(value = "/{animal_type}")
    public ResponseAnimalDto getAnimalByType(String type);

    @ApiOperation(value = "Получение животного по типу")
//    @GetMapping(value = "/{animal_type}")
    public Page<ResponseAnimalDto> getAllAnimals(Pageable pageable);

    @ApiOperation(value = "Получение животного по типу")
//    @GetMapping(value = "/{animal_type}")
    public ResponseAnimalDto saveNewAnimal(RequestAnimalDto animal);

    @ApiOperation(value = "Получение животного по типу")
//    @GetMapping(value = "/{animal_type}")
    public void deleteAnimalById(Long animalId);

    @ApiOperation(value = "Получение животного по типу")
//    @GetMapping(value = "/{animal_type}")
    public ResponseAnimalDto updateAnimal(RequestAnimalDto animal);
}
