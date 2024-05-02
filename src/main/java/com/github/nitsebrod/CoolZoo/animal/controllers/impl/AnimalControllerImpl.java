package com.github.nitsebrod.CoolZoo.animal.controllers.impl;

import com.github.nitsebrod.CoolZoo.animal.api.AnimalDto;
import com.github.nitsebrod.CoolZoo.animal.api.CreateAnimalDto;
import com.github.nitsebrod.CoolZoo.animal.api.ResponseAnimalDto;
import com.github.nitsebrod.CoolZoo.animal.controllers.AnimalController;
import com.github.nitsebrod.CoolZoo.animal.services.impl.AnimalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animals")
public class AnimalControllerImpl implements AnimalController {

    private final AnimalServiceImpl animalServiceImpl;

    @Autowired
    public AnimalControllerImpl(AnimalServiceImpl animalServiceImpl) {
        this.animalServiceImpl = animalServiceImpl;
    }

    @GetMapping("/{gender}")
    public ResponseAnimalDto getAnimalByGender(@PathVariable String gender) {
        return animalServiceImpl.getAnimalByGender(gender);
    }

    @GetMapping("/{type}")
    public ResponseAnimalDto getAnimalByType(@PathVariable String type) {
        return animalServiceImpl.getAnimalByType(type);
    }

    @GetMapping("/all")
    public Page<ResponseAnimalDto> getAllAnimals( Pageable pageable) {
        return animalServiceImpl.getAllAnimals(pageable);
    }

    @PostMapping()
    public AnimalDto saveNewAnimal(@RequestBody CreateAnimalDto animal) {
        return animalServiceImpl.saveNewAnimal(animal);
    }

    @DeleteMapping("/{animalId}")
    public void deleteAnimalById(@PathVariable Long animalId) {
        animalServiceImpl.deleteAnimalById(animalId);
    }

//    @PutMapping("/{animalId}")
//    public ResponseAnimalDto updateAnimal(@PathVariable CreateAnimalDto animal) {
//        return animalServiceImpl.saveNewAnimal(animal);
//    }
}

