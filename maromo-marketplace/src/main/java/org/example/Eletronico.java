package org.example;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Eletronico extends Produto {
    private String garantia;

    public Eletronico(String nome, double preco, String descricao, String garantia) {
        super(nome, preco, descricao);
        this.garantia = garantia;
    }
}
