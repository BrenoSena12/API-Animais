package com.apianimais.br.api.animais.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Animal {

    @Id
    @Column
    private String id;

    @Column
    private String especie;

    @Column
    private String sexo;

    @Column
    private Double idade;

    public Animal(){
    }

    public Animal(String id, String especie, String sexo, Double idade) {
        this.id = id;
        this.especie = especie;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getIdade() {
        return idade;
    }

    public void setIdade(Double idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return  "id='" + id + '\'' +
                ", especie='" + especie + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade;
    }
}