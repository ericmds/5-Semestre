package example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data // Cria Get, Set
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Dizendo que é Autoincrement
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;
    private String imagem;
}


