package org.example;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Eletronico extends Produto {
    private String garantia;

    public Eletronico(String nome, double preco, String descricao, String garantia) {
        super(nome, preco, descricao);
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGarantia: " + this.garantia;
    }
}
