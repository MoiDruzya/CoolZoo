package com.github.nitsebrod.CoolZoo.lion.repository.impl;

import com.github.nitsebrod.CoolZoo.lion.repository.LionRepository;
import com.github.nitsebrod.CoolZoo.lion.repository.model.Lion;
import org.springframework.stereotype.Repository;

@Repository
//todo тут строчкой ниже писать Марку чтобы узнать путь истинный
public class LionRepositoryImpl implements LionRepository {

    @Override
    public Lion getLionById(Long id) {
        //todo тут написать запрос в бд
        return null;
    }
}
