package com.github.nitsebrod.CoolZoo.lion.controller;

import com.github.nitsebrod.CoolZoo.lion.repository.model.LionDto;
import com.github.nitsebrod.CoolZoo.lion.service.LionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lion")
public class LionController {
    @Autowired
    private final LionService lionService;

    //todo альтернативный способ - @RequiredArgsConstructor из библиотеки @Lombok. Тогда наши поля будут автоматически на этапе компиляции
    // добавляться в конструктор
    public LionController(LionService lionService) {
        this.lionService = lionService;
    }

//    @GetMapping("/name")
//    public Lion getLionByName(@RequestBody Lion lion) {
//        System.out.println("getLionByName otrabotal");
//        return lion;
//    }

    @GetMapping("/{id}")
    public LionDto getLionById(@PathVariable Long id) {
        System.out.println("getLionByName otrabotal");
        return lionService.getLionById(id);
    }
}
