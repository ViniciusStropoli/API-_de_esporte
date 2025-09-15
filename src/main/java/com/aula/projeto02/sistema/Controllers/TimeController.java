package com.aula.projeto02.sistema.Controllers;

import com.aula.projeto02.sistema.Models.Time;
import com.aula.projeto02.sistema.Repositories.TimeRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/time")
public class TimeController {

    @Autowired
    private TimeRepositorie timeRepositorie;

    @GetMapping
    public List<Time> getAll() {
        return timeRepositorie.findAll( );
    }
}
