package com.apianimais.br.api.animais;

import com.apianimais.br.api.animais.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, String> {

}
