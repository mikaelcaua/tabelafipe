package com.br.tabelafipe.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCarro(@JsonAlias("Valor") String valorVeiculo,
                         @JsonAlias("Marca") String marcaVeiculo,
                         @JsonAlias("Modelo") String modeloVeiculo,
                         @JsonAlias("AnoModelo") Integer anoVeiculo,
                         @JsonAlias("CodigoFipe") String codigoFipe) {
}
