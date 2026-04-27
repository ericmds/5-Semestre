package com.example.crud.repository;

import com.example.crud.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    boolean existsByCategoria_Id(Integer categoriaId);
    boolean existsByNomeIgnoreCaseAndIdNot(String nome, Integer id);
}