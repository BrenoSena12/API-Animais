package com.apianimais.br.api.animais.controller;

import com.apianimais.br.api.animais.model.Animal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("animal")
public class AnimalController {

    @PostMapping
    public void salvar(Animal animal){

        System.out.println("Animal: " + animal);
    }

}
