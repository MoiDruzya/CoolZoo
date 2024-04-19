package com.github.nitsebrod.CoolZoo.animal.controllers;

import com.github.nitsebrod.CoolZoo.animal.api.AnimalDto;
import com.github.nitsebrod.CoolZoo.animal.services.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
@RequiredArgsConstructor
public class AnimalController {

    @Autowired
    private final AnimalService animalService;

    @GetMapping("/{gender}")
    public AnimalDto getAnimalByGender(@PathVariable String gender) {
        return animalService.getAnimalByGender(gender);
    }

    @GetMapping("/{type}")
    public AnimalDto getAnimalByType(@PathVariable String type) {
        return animalService.getAnimalByType(type);
    }

    @GetMapping("/all")
    public Page<AnimalDto> getAllAnimals(@PathVariable Pageable pageable) {
        return animalService.getAllAnimals(pageable);
    }


}
