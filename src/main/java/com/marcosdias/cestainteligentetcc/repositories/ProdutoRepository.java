package com.marcosdias.cestainteligentetcc.repositories;

import com.marcosdias.cestainteligentetcc.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}

