package com.aula.projeto02.sistema.Models;

import jakarta.persistence.*;

public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
}
