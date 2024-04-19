package com.github.nitsebrod.CoolZoo.lion.repository;

import com.github.nitsebrod.CoolZoo.lion.repository.model.Animal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository {
    Animal getAnimalById(Long id);

    @Query(value = "", nativeQuery = true)
    Animal getAnimalByGender(String gender);
}
