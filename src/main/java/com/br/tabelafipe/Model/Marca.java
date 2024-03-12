package com.br.tabelafipe.Model;

public class Marca {
    private Integer codigo;
    private String nome;

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Marca(String codigo, String nome) {
        this.codigo = Integer.parseInt(codigo);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return " codigo=" + codigo +
                ", nome='" + nome + '\'';
    }
}
