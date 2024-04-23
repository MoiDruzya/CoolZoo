package com.github.nitsebrod.CoolZoo.animal.dao;

import com.github.nitsebrod.CoolZoo.animal.dao.entity.Animal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {

    @Query(value = "SELECT * FROM animal WHERE gender = :gender", nativeQuery = true)
    Animal findAnimalByGender(@Param("gender") String gender);

    @Query(value = "SELECT * FROM animal WHERE type = :animalType", nativeQuery = true)
    Animal findAnimalByType(@Param("animalType") String animalType);

//    @Query(value = "INSERT INTO animal(id, name, description, age, gender, animal_type) " +
//            "values(id, name, description, age, gender, type)", nativeQuery = true)
//    Animal save(Animal animal);

    List<Animal> findAll();
}
