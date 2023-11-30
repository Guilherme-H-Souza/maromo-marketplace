package org.example;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

/*
 * A classe Produto representa um produto genérico
 * que pode ser adicionado a um carrinho de compras.
 * Contém informações básicas sobre um produto,
 * como nome, preço e descrição.
 */
public class Produto {

    /**
     * O nome do produto.
     */
    private String nome;

    /**
     * O preço do produto.
     */
    private double preco;

    /**
     * A descrição do produto.
     */
    private String descricao;
}
