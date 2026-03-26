package com.marcosdias.cestainteligentetcc.entities;

import jakarta.persistence.*;

@Entity
public class RestricaoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean obrigatorio;
    private Boolean marcaObrigatoria;
    private Integer quantidadeMinima;
    private Double gramaturaObrigatoria;

    @OneToOne
    private ItemDesejado itemDesejado;
}
