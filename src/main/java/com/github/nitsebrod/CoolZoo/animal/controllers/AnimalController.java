package com.github.nitsebrod.CoolZoo.animal.controllers;

import com.github.nitsebrod.CoolZoo.animal.api.AnimalDto;
import com.github.nitsebrod.CoolZoo.animal.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lion")
public class AnimalController {
    @Autowired
    private final AnimalService animalService;

    //todo альтернативный способ - @RequiredArgsConstructor из библиотеки @Lombok. Тогда наши поля будут автоматически на этапе компиляции
    // добавляться в конструктор
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

//    @GetMapping("/name")
//    public Lion getLionByName(@RequestBody Lion lion) {
//        System.out.println("getLionByName otrabotal");
//        return lion;
//    }

    @GetMapping("/{id}")
    public AnimalDto getLionById(@PathVariable Long id) {
        System.out.println("getLionByName otrabotal");
        return animalService.getAnimalById(id);
    }
}
