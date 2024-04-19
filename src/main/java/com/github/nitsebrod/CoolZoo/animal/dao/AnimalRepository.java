package com.github.nitsebrod.CoolZoo.animal.dao;

import com.github.nitsebrod.CoolZoo.animal.dao.entity.Animal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends PagingAndSortingRepository<Animal, Long> {

    @Query(value = "SELECT * FROM animal WHERE gender = :gender", nativeQuery = true)
    Animal findAnimalByGender(@Param("gender") String gender);

    @Query(value = "SELECT * FROM animal WHERE animalType = :animalType", nativeQuery = true)
    Animal findAnimalByType(@Param("animalType") String animalType);
}
