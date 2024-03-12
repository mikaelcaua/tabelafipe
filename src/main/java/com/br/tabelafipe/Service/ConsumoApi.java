package com.br.tabelafipe.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {
    private String URL = "https://parallelum.com.br/fipe/api/v1/carros/marcas";
    public String obterDadosApi(String path){

    HttpClient response = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder(URI.create(URL+path)).build();
    HttpResponse<String> json;
        try{
            json = response.send(request, HttpResponse.BodyHandlers.ofString());
            return json.body();
        }
         catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
