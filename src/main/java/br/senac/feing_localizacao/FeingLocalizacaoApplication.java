package br.senac.feing_localizacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeingLocalizacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeingLocalizacaoApplication.class, args);
	}

}
