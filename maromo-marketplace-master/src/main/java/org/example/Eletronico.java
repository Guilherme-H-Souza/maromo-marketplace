
package org.example;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

/*
 * A classe Eletronico representa um produto eletrônico, que é uma especialização da classe Produto.
 *
 * Possui informações adicionais específicas para produtos eletrônicos, como garantia.
 */
public class Eletronico extends Produto {

    /**
     * O período de garantia do produto eletrônico.
     */
    private String garantia;

    /**
     * Construtor para criar uma instância de Eletronico com informações iniciais.
     *
     * @param nome      O nome do produto eletrônico.
     * @param preco     O preço do produto eletrônico.
     * @param descricao A descrição do produto eletrônico.
     * @param garantia  O período de garantia do produto eletrônico.
     */
    public Eletronico(String nome, double preco, String descricao, String garantia) {

        // Chama o construtor da classe pai (Produto) para inicializar os atributos comuns.
        super(nome, preco, descricao);

        // Inicializa o atributo específico para produtos eletrônicos.
        this.garantia = garantia;
    }
}
