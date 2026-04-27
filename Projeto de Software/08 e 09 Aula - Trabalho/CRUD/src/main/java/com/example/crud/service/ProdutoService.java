package com.example.crud.service;

import com.example.crud.model.Produto;
import com.example.crud.repository.CategoriaRepository;
import com.example.crud.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final CategoriaRepository categoriaRepository;

    public ProdutoService(ProdutoRepository produtoRepository, CategoriaRepository categoriaRepository) {
        this.produtoRepository = produtoRepository;
        this.categoriaRepository = categoriaRepository;
    }

    public void salvar(Produto produto) {
        categoriaRepository.findById(produto.getCategoria().getId())
                .ifPresent(produto::setCategoria);
        produtoRepository.save(produto);
    }
}
