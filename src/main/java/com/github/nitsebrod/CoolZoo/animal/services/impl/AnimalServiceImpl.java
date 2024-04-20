package com.github.nitsebrod.CoolZoo.animal.services.impl;

import com.github.nitsebrod.CoolZoo.animal.api.AnimalDto;
import com.github.nitsebrod.CoolZoo.animal.dao.AnimalRepository;
import com.github.nitsebrod.CoolZoo.animal.dao.entity.Animal;
import com.github.nitsebrod.CoolZoo.animal.mapper.AnimalMapper;
import com.github.nitsebrod.CoolZoo.animal.services.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private final AnimalRepository animalRepository;
    @Autowired
    private final AnimalMapper animalMapper;


    @Override
    public AnimalDto getAnimalByType(String type) {
        Animal animal = animalRepository.findAnimalByType(type);
        return animalMapper.toDto(animal);
    }

    @Override
    public Page<AnimalDto> getAllAnimals(Pageable pageable) {
        Page<Animal> pageableAnimals = animalRepository.findAll(pageable);
        List<AnimalDto> animalList = pageableAnimals
                .stream()
                .map(animalMapper::toDto)
                .collect(Collectors.toList());
        return new PageImpl<>(animalList, pageable, 2);
    }

    @Override
    public AnimalDto getAnimalByGender(String gender) {
        //todo заменить на вызов из репозитория
        Animal animal = animalRepository.findAnimalByGender(gender);
        return animalMapper.toDto(animal);
    }

    @Override
    public AnimalDto saveNewAnimal(AnimalDto animalDto) {
        Animal entity = animalMapper.toEntity(animalDto);
        Animal save = animalRepository.save(entity);
        return animalMapper.toDto(save);
    }

    @Override
    public void deleteAnimalById(Long animalId) {
        animalRepository.deleteById(animalId);
    }

    //todo потом возвращать Optional<AnimalDto> и посмотреть че кого
    @Override
    public AnimalDto updateAnimalById(Animal animal) throws IllegalArgumentException {
        Optional<Animal> animalOpt = animalRepository.findById(animal.getId());
        AnimalDto updatedAnimalDto;
        if (animalOpt.isEmpty()) {
            throw new IllegalArgumentException("huyno");
        } else {
            Animal entityToSafe = animalRepository.save(animal);
            updatedAnimalDto = animalMapper.toDto(entityToSafe);
        }
        return updatedAnimalDto;
    }
}
