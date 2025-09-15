package com.aula.projeto02.sistema.Repositories;

import com.aula.projeto02.sistema.Models.Tecnico;
import com.aula.projeto02.sistema.Models.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimeRepositorie extends JpaRepository<Time, Long> {
    List<Time> findByCidade(String cidade);
}