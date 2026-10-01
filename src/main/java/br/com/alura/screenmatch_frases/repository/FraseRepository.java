package br.com.alura.screenmatch_frases.repository;

import br.com.alura.screenmatch_frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FraseRepository extends JpaRepository<Frase,Long> {

    List<Frase> findAll();
    Optional<Frase> findById(Long id);

}
