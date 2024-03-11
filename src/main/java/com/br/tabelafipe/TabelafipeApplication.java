package com.br.tabelafipe;

import com.br.tabelafipe.Main.Main;
import com.br.tabelafipe.Model.DadosCarro;
import com.br.tabelafipe.Service.ConsumoApi;
import com.br.tabelafipe.Service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TabelafipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TabelafipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.exibeMenu();
	}
}
