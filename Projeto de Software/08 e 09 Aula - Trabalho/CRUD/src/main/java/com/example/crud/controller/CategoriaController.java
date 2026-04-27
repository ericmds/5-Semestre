package com.example.crud.controller;

import com.example.crud.model.Categoria;
import com.example.crud.service.CategoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/formulario")
    public String exibirFormulario(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "categoria/formulario";
    }

    @PostMapping("/salvar")
    public String salvarCategoria(@ModelAttribute Categoria categoria, Model model) {
        try {
            categoriaService.salvar(categoria);
            return "redirect:/categoria/listar";
        } catch (RuntimeException e) {
            model.addAttribute("erro", e.getMessage());
            model.addAttribute("categoria", categoria);
            return "categoria/formulario";
        }
    }

    @GetMapping("/listar")
    public String listarCategorias(Model model) {
        model.addAttribute("categorias", categoriaService.listarTodas());
        return "categoria/lista";
    }

    @GetMapping("/editar/{id}")
    public String editarCategoria(@PathVariable Integer id, Model model) {
        Optional<Categoria> categoria = categoriaService.buscarPorId(id);
        categoria.ifPresent(c -> model.addAttribute("categoria", c));
        return "categoria/formulario";
    }

    @GetMapping("/deletar/{id}")
    public String deletarCategoria(@PathVariable Integer id, Model model) {
        try {
            categoriaService.deletar(id);
            return "redirect:/categoria/listar";
        } catch (RuntimeException e) {
            model.addAttribute("erro", e.getMessage());
            model.addAttribute("categorias", categoriaService.listarTodas());
            return "categoria/lista";
        }
    }
}
