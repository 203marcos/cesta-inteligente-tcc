package com.marcosdias.cestainteligentetcc.entities;


import jakarta.persistence.*;

import java.util.List;

@Table(name = "supermercado")
@Entity
public class Supermercado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String rede;
    private Boolean ativo;

    @OneToMany(mappedBy = "supermercado")
    private List<Produto> produtos;

    @OneToMany(mappedBy = "supermercado")
    private List<Simulacao> simulacoes;
}
