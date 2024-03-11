package com.br.tabelafipe.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverterDados implements IConverterDados {
    ObjectMapper mapper = new ObjectMapper();
    @Override
    public <T> T converterdados(String json, Class<T> T) {
        try{

        return mapper.readValue(json, T);
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
