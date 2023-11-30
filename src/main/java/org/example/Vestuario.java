package org.example;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Vestuario extends Produto {
    private Tamanho tamanho;
    private String cor;

    public Vestuario(String nome, double preco, String descricao, Tamanho tamanho, String cor) {
        super(nome, preco, descricao);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTamanho: " + this.tamanho + "\nCor: " + this.cor;
    }
}
