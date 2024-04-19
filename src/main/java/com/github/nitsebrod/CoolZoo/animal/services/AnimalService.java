package com.github.nitsebrod.CoolZoo.animal.services;

import com.github.nitsebrod.CoolZoo.animal.api.AnimalDto;


public interface AnimalService {
    AnimalDto getAnimalById(Long id);
}
