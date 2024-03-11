package com.br.tabelafipe.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {
    public String obterDadosApi(String url){

    HttpClient response = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder(URI.create(url)).build();
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
