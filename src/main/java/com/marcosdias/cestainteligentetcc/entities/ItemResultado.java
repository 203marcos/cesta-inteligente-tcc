package com.marcosdias.cestainteligentetcc.entities;

import jakarta.persistence.*;

@Entity
public class ItemResultado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantidade;
    private Double precoUnitario;
    private Double subtotal;

    @ManyToOne
    @JoinColumn(name = "resultado_otimizacao_id")
    private ResultadoOtimizacao resultadoOtimizacao;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;
}

