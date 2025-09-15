package com.aula.projeto02.sistema.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @JsonIgnore

    @OneToOne
    @JoinColumn(name = "time_id")
    private Time time;
}
