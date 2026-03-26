package com.marcosdias.cestainteligentetcc.entities;

import jakarta.persistence.*;

@Table(name = "categoria")
@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
}
