package com.github.nitsebrod.CoolZoo.animal.controllers;

import com.github.nitsebrod.CoolZoo.animal.api.AnimalDto;
import com.github.nitsebrod.CoolZoo.animal.api.CreateAnimalDto;
import com.github.nitsebrod.CoolZoo.animal.api.ResponseAnimalDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface AnimalController {

//    @ApiOperation(value = "Получение животного по типу")
//        //todo --------------------------------------------------------------------
//        //todo ВО ВСЕХ АННОТАЦИЯХ ЭТОГО ИНТЕРФЕЙСА НАДО ПЕРЕПИСАТЬ МАППИНГИ
//        // - ИНАЧЕ БУДУТ ВЫДАВАТЬ 400 BAD_REQUEST
//        //todo --------------------------------------------------------------------
////    @GetMapping(value = "/{animal_type}")
//    ResponseAnimalDto getAnimalByGender(String gender);
//
//    @ApiOperation(value = "Получение животного по типу")
////    @GetMapping(value = "/{animal_type}")
//    ResponseAnimalDto getAnimalByType(String type);

    @ApiOperation(value = "Получение животного по типу")
    @GetMapping(value = "/all")
    Page<ResponseAnimalDto> getAllAnimals(Pageable pageable);

    @ApiOperation(value = "Получение животного по типу")
    @PostMapping()
    AnimalDto saveNewAnimal(CreateAnimalDto animal);

//    @ApiOperation(value = "Получение животного по типу")
////    @GetMapping(value = "/{animal_type}")
//    public void deleteAnimalById(Long animalId);
//
//    @ApiOperation(value = "Получение животного по типу")
////    @GetMapping(value = "/{animal_type}")
//    public ResponseAnimalDto updateAnimal(CreateAnimalDto animal);
}
