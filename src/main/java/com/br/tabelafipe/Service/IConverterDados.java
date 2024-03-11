package com.br.tabelafipe.Service;

public interface IConverterDados {
    <T> T converterdados(String json, Class<T> T);
}
