package com.github.nitsebrod.CoolZoo.animal.controllers;

import com.github.nitsebrod.CoolZoo.animal.api.RequestAnimalDto;
import com.github.nitsebrod.CoolZoo.animal.api.ResponseAnimalDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;

public interface AnimalController {

    @ApiOperation(value = "Получение животного по полу")
//    @GetMapping(value = "/{animal_type}")
    public ResponseAnimalDto getAnimalByGender(String gender);

    @ApiOperation(value = "Получение животного по типу")
    @GetMapping(value = "/{animal_type}")
    public ResponseAnimalDto getAnimalByType(String type);

    @ApiOperation(value = "Получение всех животных")
//    @GetMapping(value = "/{animal_type}")
    public Page<ResponseAnimalDto> getAllAnimals(Pageable pageable);

    @ApiOperation(value = "Добавление нового животного")
//    @GetMapping(value = "/{animal_type}")
    public ResponseAnimalDto saveNewAnimal(RequestAnimalDto animal);

    @ApiOperation(value = "Удаление животного по Id")
//    @GetMapping(value = "/{animal_type}")
    public void deleteAnimalById(Long animalId);

    @ApiOperation(value = "Обновление данных животного")
//    @GetMapping(value = "/{animal_type}")
    public ResponseAnimalDto updateAnimal(RequestAnimalDto animal);
}
