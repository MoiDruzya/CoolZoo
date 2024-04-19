package com.github.nitsebrod.CoolZoo.animal.services;

import com.github.nitsebrod.CoolZoo.animal.api.AnimalDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AnimalService {
    AnimalDto getAnimalByGender(String gender);
    AnimalDto getAnimalByType(String type);
    Page<AnimalDto> getAllAnimals(Pageable pageable);
}
