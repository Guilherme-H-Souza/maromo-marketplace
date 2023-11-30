package org.example;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    private String nome;
    private double preco;
    private String descricao;

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nPreco: " + this.preco + "\nDescrição: " + this.descricao;
    }
}
