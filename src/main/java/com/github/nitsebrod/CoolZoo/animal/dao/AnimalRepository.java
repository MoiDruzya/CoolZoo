package com.github.nitsebrod.CoolZoo.animal.dao;

import com.github.nitsebrod.CoolZoo.animal.dao.entity.Animal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository {
    Animal getAnimalById(Long id);

    @Query(value = "", nativeQuery = true)
    Animal getAnimalByGender(String gender);
}
