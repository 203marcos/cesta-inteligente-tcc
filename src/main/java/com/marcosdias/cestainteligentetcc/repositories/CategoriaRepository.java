package com.marcosdias.cestainteligentetcc.repositories;

import com.marcosdias.cestainteligentetcc.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}

