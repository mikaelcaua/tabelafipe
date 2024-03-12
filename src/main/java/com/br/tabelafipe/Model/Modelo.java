package com.br.tabelafipe.Model;

public class Modelo {
    private Integer codigo;
    private String nome;

    public Modelo(String codigo, String nome) {
        this.codigo = Integer.parseInt(codigo);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return " codigo=" + codigo +
                ", nome='" + nome + '\'';
    }
}
