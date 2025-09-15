package com.aula.projeto02.sistema.Controllers;

import com.aula.projeto02.sistema.Dtos.TecnicoDto;
import com.aula.projeto02.sistema.Models.Tecnico;
import com.aula.projeto02.sistema.Repositories.TecnicoRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tecnico")
public class TecnicoController {

    @Autowired
    private TecnicoRepositorie tecnicoRepositorie;

    @GetMapping
    public List<Tecnico> getAll() {
        return tecnicoRepositorie.findAll();
    }

    @GetMapping("/{id}")
    public Tecnico getById(@PathVariable Long id){
        Optional<Tecnico> tecnico = tecnicoRepositorie.findById(id);
        if(tecnico.isEmpty()) {
            return null;
        } else {
            return tecnico.get();
        }
    }

    @PostMapping
    public Tecnico add(@RequestBody TecnicoDto tecnicoDto){
        Tecnico tecnico = new Tecnico();
        tecnico.setNome(tecnicoDto.nome());
        return tecnicoRepositorie.save(tecnico);

    }
}
