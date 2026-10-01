package br.com.alura.screenmatch_frases.controller;

import br.com.alura.screenmatch_frases.dto.FraseDTO;
import br.com.alura.screenmatch_frases.repository.FraseRepository;
import br.com.alura.screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FraseController {
    @Autowired
    private FraseRepository repository;

    @Autowired
    private FraseService servico;


    @RequestMapping("/series/frases")
    public FraseDTO obterFrase(){
        return servico.obterFrase();
    }


}
