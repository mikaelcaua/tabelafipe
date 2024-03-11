package com.br.tabelafipe.Main;

import com.br.tabelafipe.Model.DadosCarro;
import com.br.tabelafipe.Service.ConsumoApi;
import com.br.tabelafipe.Service.ConverterDados;

public class Main {
    public void exibeMenu(){
        ConverterDados converter = new ConverterDados();
        ConsumoApi consumo = new ConsumoApi();
        String json = consumo.obterDadosApi("https://parallelum.com.br/fipe/api/v1/carros/marcas/59/modelos/5940/anos/2014-3");

        DadosCarro teste = converter.converterdados(json, DadosCarro.class);
        System.out.println(teste);
    }
}
