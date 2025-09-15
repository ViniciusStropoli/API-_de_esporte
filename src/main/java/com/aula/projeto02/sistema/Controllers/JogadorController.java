package com.aula.projeto02.sistema.Controllers;


import com.aula.projeto02.sistema.Models.Jogador;
import com.aula.projeto02.sistema.Repositories.JogadorRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    @Autowired
    public JogadorRepositorie jogadorRepositorie;

    @GetMapping
    public List<Jogador> getAll() {
        return jogadorRepositorie.findAll();
    }

    @GetMapping("/time/{time_id}")
    public List<Jogador> getAllByTime(@PathVariable Long time_id) {
        return jogadorRepositorie.findByTime_id(time_id);
    }

}
