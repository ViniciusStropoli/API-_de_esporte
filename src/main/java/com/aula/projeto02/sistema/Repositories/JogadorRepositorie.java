package com.aula.projeto02.sistema.Repositories;

import com.aula.projeto02.sistema.Controllers.JogadorController;
import com.aula.projeto02.sistema.Models.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JogadorRepositorie extends JpaRepository<Jogador, Long> {
    List<Jogador> findByTime_id(Long time_id);
}