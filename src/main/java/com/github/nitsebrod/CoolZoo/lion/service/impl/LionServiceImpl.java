package com.github.nitsebrod.CoolZoo.lion.service.impl;

import com.github.nitsebrod.CoolZoo.lion.repository.model.LionDto;
import com.github.nitsebrod.CoolZoo.lion.service.LionService;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
public class LionServiceImpl implements LionService {

    //todo инжектнуть бин репозитория в конструктор

    @Override
    public LionDto getLionById(Long id) {
        //todo заменить на вызов из репозитория
        return LionDto.builder().id(id).name("Petya the Lion").build();
    }

}
