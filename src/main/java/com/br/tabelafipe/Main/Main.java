package com.br.tabelafipe.Main;
import com.br.tabelafipe.Model.*;
import com.br.tabelafipe.Service.ConsumoApi;
import com.br.tabelafipe.Service.ConverterDados;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    private String json;
    private ConsumoApi consumo = new ConsumoApi();
        private ConverterDados converter = new ConverterDados();

    private Scanner scanner = new Scanner(System.in);

    public void exibeMenu(){
        Integer entradaMarcaId;
        Integer entradaModeloId;
        json = consumo.obterDadosApi("");

        List<Marca> marcas = (Arrays.asList(converter.converterdados(json, DadosMarca[].class))).
                                            stream().map(dm -> new Marca(dm.codigo(), dm.nome())).
                                            collect(Collectors.toList()).stream().
                                            sorted(Comparator.comparing(m -> m.getCodigo())).
                                            collect(Collectors.toList());
        marcas.forEach(System.out::println);



        System.out.println("\n\n\nInsira o código da marca do carro:");
        entradaMarcaId = scanner.nextInt();
        json = consumo.obterDadosApi("/"+entradaMarcaId+"/modelos");
        ListDadosModelo listDadosModelo = converter.converterdados(json, ListDadosModelo.class);
        List<Modelo> modelos = Arrays.asList(listDadosModelo.getDadosModelo()).stream().
                                map(dm -> new Modelo(dm.codigo(), dm.nome())).collect(Collectors.toList());
        modelos.forEach(System.out::println);



        System.out.println("\n\n\nInsira o código do modelo do carro:");
        entradaModeloId = scanner.nextInt();
        json = consumo.obterDadosApi("/"+entradaMarcaId+"/modelos/"+entradaModeloId+"/anos");
        System.out.println(json);



















    }
}
