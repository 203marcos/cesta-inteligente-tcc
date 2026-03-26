package com.marcosdias.cestainteligentetcc.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "produto")
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String marca;
    private Double gramatura;
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "supermercado_id")
    private Supermercado supermercado;

    @OneToMany(mappedBy = "produto")
    private List<ItemResultado> itensResultado;


}
