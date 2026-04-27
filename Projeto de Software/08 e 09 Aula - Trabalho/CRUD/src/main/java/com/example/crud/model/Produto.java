package com.example.crud.model;

import jakarta.persistence.*;

@Entity // Diz que essa classe é uma tabela no banco
public class Produto {

    @Id                                                 // GenerationType.UUID - Cria id's aleatrios, maneira mais segura
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
    private int id;

    @Column(unique = true, nullable = false, length = 100) //Nao pode repetir, nao pode se nulo, tamanho 100
    private String nome;

    private String descricao;
    private double valor;
    private int quantidade;
    private String imagem;

    @ManyToOne // muitos produtos podem ter uma categoria
    @JoinColumn(name = "categoria_id") // chave estrangeira no banco
    private Categoria categoria;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public String getImagem() { return imagem; }
    public void setImagem(String imagem) { this.imagem = imagem; }
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public Produto() {}

    @Override
    public String toString() {
        return "Produto{id=" + id + ", nome='" + nome + '\'' +
                ", categoria=" + (categoria != null ? categoria.getNome() : "N/A") + '}';
    }
}
