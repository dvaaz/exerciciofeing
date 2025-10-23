package br.senac.feing_localizacao.controller;

import br.senac.feing_localizacao.component.CepFeignClient;
import br.senac.feing_localizacao.entity.dto.CepDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CepController {
  @Autowired
  CepFeignClient feignClient;

  @GetMapping()
  @CrossOrigin(origins="*")
  public ResponseEntity<CepDTO> buscarCep(){
    return ResponseEntity.ok()
  }
}
