package com.br.tabelafipe.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ListDadosModelo(@JsonAlias("modelos") DadosModelo[] modelos) {
    public DadosModelo[] getDadosModelo(){
        return  modelos;
    }
}


