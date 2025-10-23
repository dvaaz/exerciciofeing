package br.senac.feing_localizacao.component;

import br.senac.feing_localizacao.entity.dto.CepDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name="viacep", url="https://viacep.com.br", path="/ws")
public interface CepFeignClient {
  @GetMapping(value = "/{cep}/json")
  CepDTO getCep(@PathVariable Integer cep);

}
