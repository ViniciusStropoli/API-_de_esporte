package com.aula.projeto02.sistema.Repositories;

import com.aula.projeto02.sistema.Models.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TecnicoRepositorie extends JpaRepository<Tecnico, Long> {
    List<Tecnico> findByTime_Id(Long time_id);

}
