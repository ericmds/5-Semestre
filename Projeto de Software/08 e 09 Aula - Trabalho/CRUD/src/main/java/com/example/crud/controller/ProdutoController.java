package com.example.crud.controller;

import com.example.crud.model.Produto;
import com.example.crud.repository.ProdutoRepository;
import com.example.crud.service.CategoriaService;
import com.example.crud.service.ProdutoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;
    private final ProdutoService produtoService;
    private final CategoriaService categoriaService;

    public ProdutoController(ProdutoRepository produtoRepository, ProdutoService produtoService, CategoriaService categoriaService) {
        this.produtoRepository = produtoRepository;
        this.produtoService = produtoService;
        this.categoriaService = categoriaService;
    }

    @GetMapping("/formulario")
    public String exibirFormulario(Model model) {
        model.addAttribute("produto", new Produto());
        model.addAttribute("categorias", categoriaService.listarTodas());
        return "formulario";
    }

    @PostMapping("/salvar")
    public String salvarProduto(@ModelAttribute Produto produto, Model model) {
        Map<String, String> erros = new HashMap<>();

        if (produto.getNome() == null || produto.getNome().isBlank()) {
            erros.put("nome", "O nome do produto é obrigatório!");
        } else if (produtoRepository.existsByNomeIgnoreCaseAndIdNot(produto.getNome(), produto.getId())) {
            erros.put("nome", "Já existe um produto com esse nome!");
        }

        if (produto.getValor() <= 0) {
            erros.put("valor", "O valor deve ser maior que zero!");
        }

        if (produto.getCategoria() == null || produto.getCategoria().getId() == null) {
            erros.put("categoria", "Selecione uma categoria para o produto!");
        }

        if (!erros.isEmpty()) {
            model.addAttribute("erros", erros);
            model.addAttribute("produto", produto);
            model.addAttribute("categorias", categoriaService.listarTodas());
            return "formulario";
        }

        try {
            produtoService.salvar(produto);
            return "redirect:/produto/listar";
        } catch (RuntimeException e) {
            erros.put("geral", e.getMessage());
            model.addAttribute("erros", erros);
            model.addAttribute("produto", produto);
            model.addAttribute("categorias", categoriaService.listarTodas());
            return "formulario";
        }
    }

    @GetMapping("/listar")
    public String listarProdutos(Model model) {
        List<Produto> produtos = produtoRepository.findAll();
        model.addAttribute("produtos", produtos);
        return "lista";
    }

    @GetMapping("/deletar/{id}")
    public String deletarProduto(@PathVariable Integer id) {
        produtoRepository.deleteById(id);
        return "redirect:/produto/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarProduto(@PathVariable Integer id, Model model) {
        Optional<Produto> produto = produtoRepository.findById(id);
        produto.ifPresent(p -> model.addAttribute("produto", p));
        model.addAttribute("categorias", categoriaService.listarTodas());
        return "formulario";
    }
}