package com.example.crud.service;

import com.example.crud.model.Categoria;
import com.example.crud.repository.CategoriaRepository;
import com.example.crud.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;
    private final ProdutoRepository produtoRepository;

    public CategoriaService(CategoriaRepository categoriaRepository, ProdutoRepository produtoRepository) {
        this.categoriaRepository = categoriaRepository;
        this.produtoRepository = produtoRepository;
    }

    public void salvar(Categoria categoria) {
        if (categoria.getNome() == null || categoria.getNome().isBlank()) {
            throw new RuntimeException("O nome da categoria é obrigatório!");
        }

        boolean nomeJaExiste = categoriaRepository.findAll().stream()
                .anyMatch(c -> c.getNome().equalsIgnoreCase(categoria.getNome())
                        && !c.getId().equals(categoria.getId()));

        if (nomeJaExiste) {
            throw new RuntimeException("Já existe uma categoria com esse nome!");
        }

        categoriaRepository.save(categoria);
    }

    public List<Categoria> listarTodas() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> buscarPorId(Integer id) {
        return categoriaRepository.findById(id);
    }

    public void deletar(Integer id) {
        if (produtoRepository.existsByCategoria_Id(id)) {
            throw new RuntimeException("Não é possível excluir a categoria pois ela possui produtos vinculados!");
        }
        categoriaRepository.deleteById(id);
    }
}
