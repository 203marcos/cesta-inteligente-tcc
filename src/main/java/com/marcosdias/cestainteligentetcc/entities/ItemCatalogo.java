package com.marcosdias.cestainteligentetcc.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ItemCatalogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    private Categoria categoria;

    @OneToMany(mappedBy = "itemCatalogo")
    private List<ItemDesejado> itensDesejados;
}