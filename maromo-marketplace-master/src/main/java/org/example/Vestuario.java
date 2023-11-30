package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

/*
 * A classe Vestuario representa um produto de vestuário, que é uma especialização da classe Produto.
 * Contém informações adicionais específicas para produtos de vestuário, como tamanho e cor.
 */
public class Vestuario extends Produto {

    /**
     * O tamanho do produto de vestuário.
     */
    private Tamanho tamanho;

    /**
     * A cor do produto de vestuário.
     */
    private String cor;

    /**
     * Construtor para criar uma instância de Vestuario com informações iniciais.
     *
     * @param nome      O nome do produto de vestuário.
     * @param preco     O preço do produto de vestuário.
     * @param descricao A descrição do produto de vestuário.
     * @param tamanho   O tamanho do produto de vestuário.
     * @param cor       A cor do produto de vestuário.
     */
    public Vestuario(String nome, double preco, String descricao, Tamanho tamanho, String cor) {

        // Chama o construtor da classe pai (Produto) para inicializar os atributos comuns.
        super(nome, preco, descricao);

        // Inicializa os atributos específicos para produtos de vestuário.
        this.tamanho = tamanho;
        this.cor = cor;
    }
}
