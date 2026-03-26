package com.marcosdias.cestainteligentetcc.entities;

import jakarta.persistence.*;

@Entity
public class ItemDesejado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantidadeDesejada;

    @ManyToOne
    private Simulacao simulacao;

    @ManyToOne
    @JoinColumn(name = "item_catalogo_id")
    private ItemCatalogo itemCatalogo;

    @OneToOne(mappedBy = "itemDesejado")
    private RestricaoItem restricao;
}