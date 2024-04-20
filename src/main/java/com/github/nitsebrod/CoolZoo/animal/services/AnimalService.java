package com.github.nitsebrod.CoolZoo.animal.services;

import com.github.nitsebrod.CoolZoo.animal.api.AnimalDto;
import com.github.nitsebrod.CoolZoo.animal.dao.entity.Animal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AnimalService {
    AnimalDto getAnimalByGender(String gender);

    AnimalDto getAnimalByType(String type);

    Page<AnimalDto> getAllAnimals(Pageable pageable);

    AnimalDto saveNewAnimal(AnimalDto animalDto);

    void deleteAnimalById(Long animalId);

    AnimalDto updateAnimalById(Animal animal) throws Exception;
}
