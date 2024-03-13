package com.br.tabelafipe.Model;

public class Ano {
    private String codigo;
    private String nome;

    public Ano(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  "codigo do ano='" + codigo + '\'' +
                ", nome='" + nome + '\'';
    }
}
