package br.senac.feing_localizacao.component;

import br.senac.feing_localizacao.entity.dto.CepDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name="cep", url="https://viacep.com.br", path="/ws")
public interface CepFeignClient {
  @GetMapping(value = "{cep}")
  public ResponseEntity<CepDTO> buscarCep(@PathVariable Integer cep);

}
