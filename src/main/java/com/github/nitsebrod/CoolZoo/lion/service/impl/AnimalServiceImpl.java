package com.github.nitsebrod.CoolZoo.lion.service.impl;

import com.github.nitsebrod.CoolZoo.lion.repository.AnimalRepository;
import com.github.nitsebrod.CoolZoo.lion.repository.model.Animal;
import com.github.nitsebrod.CoolZoo.lion.repository.model.AnimalDto;
import com.github.nitsebrod.CoolZoo.lion.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnimalServiceImpl implements AnimalService {

    //todo инжектнуть бин репозитория в конструктор
    @Autowired
    private final AnimalRepository animalRepository;

    @Override
    public AnimalDto getAnimalById(Long id) {
        //todo заменить на вызов из репозитория
        Animal animalById = animalRepository.getAnimalById(id);
    }

}
