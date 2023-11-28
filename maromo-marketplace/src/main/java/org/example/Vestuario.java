package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Vestuario extends Produto {
    private Tamanho tamanho;
    private String cor;

    public Vestuario(String nome, double preco, String descricao, Tamanho tamanho, String cor) {
        super(nome, preco, descricao);
        this.tamanho = tamanho;
        this.cor = cor;
    }
}
