package com.github.nitsebrod.CoolZoo.lion.service;

import com.github.nitsebrod.CoolZoo.lion.repository.model.LionDto;

public interface LionService {
    LionDto getLionById(Long id);
}
