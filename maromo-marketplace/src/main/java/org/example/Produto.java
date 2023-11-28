package org.example;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Produto {
    private String nome;
    private double preco;
    private String descricao;
}
