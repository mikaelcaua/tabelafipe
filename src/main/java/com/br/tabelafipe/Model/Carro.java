package com.br.tabelafipe.Model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Carro {
    private String valorVeiculo;
    private String marcaVeiculo;
    private String modeloVeiculo;
    private Integer anoVeiculo;
    private String codigoFip;

    public Carro(DadosCarro dadosCarro) {
        this.valorVeiculo = dadosCarro.valorVeiculo();
        this.marcaVeiculo = dadosCarro.marcaVeiculo();
        this.modeloVeiculo = dadosCarro.modeloVeiculo();
        this.anoVeiculo = dadosCarro.anoVeiculo();
        this.codigoFip = dadosCarro.codigoFipe();
    }

    @Override
    public String toString() {
        return "valorVeiculo='" + valorVeiculo + '\n' +
                "marcaVeiculo='" + marcaVeiculo + '\n' +
                "modeloVeiculo='" + modeloVeiculo + '\n' +
                "anoVeiculo=" + anoVeiculo +'\n' +
                "codigoFip='" + codigoFip ;
    }
}
