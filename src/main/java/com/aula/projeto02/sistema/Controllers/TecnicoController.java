package com.aula.projeto02.sistema.Controllers;

import com.aula.projeto02.sistema.Models.Tecnico;
import com.aula.projeto02.sistema.Repositories.TecnicoRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tecnico")
public class TecnicoController {

    @Autowired
    private TecnicoRepositorie tecnicoRepositorie;

    @GetMapping
    public List<Tecnico> getAll() {
        return tecnicoRepositorie.findAll();
    }

    @GetMapping("/time/{id}")
    public List<Tecnico> findByTime_Id(Long time_id){
        return tecnicoRepositorie.findByTime_Id(time_id);
    }
}
