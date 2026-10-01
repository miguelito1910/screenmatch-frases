package br.com.alura.screenmatch_frases.service;

import br.com.alura.screenmatch_frases.dto.FraseDTO;
import br.com.alura.screenmatch_frases.model.Frase;
import br.com.alura.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFrase() {
        List<Frase> frases = repositorio.findAll();


            Frase f = frases.get(new Random().nextInt(frases.size()));

            return new FraseDTO(
                    f.getId(),
                    f.getFrase(),
                    f.getPersonagem(),
                    f.getPoster(),
                    f.getTitulo()
            );

    }
}

