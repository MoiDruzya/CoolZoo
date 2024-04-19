package com.github.nitsebrod.CoolZoo.lion.service;

import com.github.nitsebrod.CoolZoo.lion.repository.model.AnimalDto;


public interface AnimalService {
    AnimalDto getAnimalById(Long id);
}
