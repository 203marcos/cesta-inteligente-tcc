package com.marcosdias.cestainteligentetcc.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Simulacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double orcamento;
    private LocalDateTime dataHora;

    @ManyToOne
    @JoinColumn(name = "supermercado_id")
    private Supermercado supermercado;

    @OneToMany(mappedBy = "simulacao")
    private List<ItemDesejado> itens;

    @OneToOne(mappedBy = "simulacao")
    private ResultadoOtimizacao resultadoOtimizacao;
}