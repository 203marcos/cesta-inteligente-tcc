package com.marcosdias.cestainteligentetcc.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ResultadoOtimizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valorTotal;
    private Double trocoEstimado;
    private String status;

    @OneToOne
    @JoinColumn(name = "simulacao_id", unique = true)
    private Simulacao simulacao;

    @OneToMany(mappedBy = "resultadoOtimizacao")
    private List<ItemResultado> itensResultado;
}

