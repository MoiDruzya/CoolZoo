package com.github.nitsebrod.CoolZoo.animal.services.impl;

import com.github.nitsebrod.CoolZoo.animal.api.AnimalDto;
import com.github.nitsebrod.CoolZoo.animal.api.CreateAnimalDto;
import com.github.nitsebrod.CoolZoo.animal.api.ResponseAnimalDto;
import com.github.nitsebrod.CoolZoo.animal.dao.AnimalRepository;
import com.github.nitsebrod.CoolZoo.animal.dao.entity.Animal;
import com.github.nitsebrod.CoolZoo.animal.mapper.AnimalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AnimalServiceImpl {

    private final AnimalRepository animalRepository;
    private final AnimalMapper animalMapper;

    @Autowired
    public AnimalServiceImpl(AnimalRepository animalRepository, AnimalMapper animalMapper) {
        this.animalRepository = animalRepository;
        this.animalMapper = animalMapper;
    }

    public ResponseAnimalDto getAnimalByType(String type) {
        Animal animal = animalRepository.findAnimalByType(type);
        return animalMapper.entityToDto(animal);
    }

    public Page<ResponseAnimalDto> getAllAnimals(Pageable pageable) {
        List<Animal> pageableAnimals = animalRepository.findAll();
        List<ResponseAnimalDto> animalList = pageableAnimals
                .stream()
                .map(animalMapper::entityToDto)
                .collect(Collectors.toList());
        return new PageImpl<>(animalList, pageable, 2);
    }

    public ResponseAnimalDto getAnimalByGender(String gender) {
        //todo заменить на вызов из репозитория
        Animal animal = animalRepository.findAnimalByGender(gender);
        return animalMapper.entityToDto(animal);


        public AnimalDto saveNewAnimal (CreateAnimalDto createAnimalDto){
            Animal entity = animalMapper.createDtoToEntity(createAnimalDto);
            return animalMapper.entityToDto(
                    animalRepository.save(entity));
        }

        public void deleteAnimalById (Long animalId){
            animalRepository.deleteById(animalId);
        }

        //todo потом возвращать Optional<AnimalDto> и посмотреть че кого

        public ResponseAnimalDto updateAnimalById (Animal animal) throws IllegalArgumentException {
            Optional<Animal> animalOpt = animalRepository.findById(animal.getId());
            ResponseAnimalDto updatedResponseAnimalDto;
            if (animalOpt.isEmpty()) {
                throw new IllegalArgumentException("huyno");
            } else {
                Animal entityToSafe = animalRepository.save(animal);
                updatedResponseAnimalDto = animalMapper.entityToDto(entityToSafe);
            }
            return updatedResponseAnimalDto;

        }
