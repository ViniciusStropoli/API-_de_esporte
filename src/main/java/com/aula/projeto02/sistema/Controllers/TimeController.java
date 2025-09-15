package com.aula.projeto02.sistema.Controllers;

import com.aula.projeto02.sistema.Dtos.TimeDto;
import com.aula.projeto02.sistema.Models.Tecnico;
import com.aula.projeto02.sistema.Models.Time;
import com.aula.projeto02.sistema.Repositories.TimeRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/time")
public class TimeController {

    @Autowired
    private TimeRepositorie timeRepositorie;

    @GetMapping
    public List<Time> getAll() {
        return timeRepositorie.findAll();
    }

    @GetMapping("/cidade/{cidade}")
    public List<Time> findByCidade(@PathVariable String cidade) {
        return timeRepositorie.findByCidade(cidade);
    }

    @PostMapping
    public Time add(@RequestBody TimeDto timeDto) {
        Optional<Tecnico> tecnico = tecnicoRepositorie.findById(timeDto.tecnico_id());
        if(tecnico.isEmpty()) return null;
        Time time = new Time();
        time.setNome(timeDto.nome());
        time.setCidade(timeDto.cidade());
        time.setTecnico(tecnico.get());
        return timeRepositorie.save(time);
    }

}
