package com.apianimais.br.api.animais.controller;

import com.apianimais.br.api.animais.AnimalRepository;
import com.apianimais.br.api.animais.model.Animal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("animal")
public class AnimalController {

    private AnimalRepository animalRepository;

    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @PostMapping
    public void salvar(@RequestBody Animal animal){
        System.out.println("Animal: " + animal);

        var id = UUID.randomUUID().toString();
        animal.setId(id);

        animalRepository.save(animal);
    }

}
