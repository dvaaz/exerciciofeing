package br.senac.feing_localizacao.service;

import br.senac.feing_localizacao.component.CepFeignClient;
import br.senac.feing_localizacao.entity.dto.CepDTO;
import org.springframework.stereotype.Service;

@Service
public class CepService {
    private final CepFeignClient feingClient;

    public CepService(CepFeignClient feingClient) {
        this.feingClient = feingClient;
    }

}
