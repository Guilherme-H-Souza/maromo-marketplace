package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Carrinho {
    private final List<Produto> produtos = new LinkedList<>();

    //recebe um objeto do tipo Produto para ser adicionado na lista produtos
    public void adicionarProduto(Produto produto) {
        if (produto != null) {
            produtos.add(produto);
            System.out.println("Produto adicionado com sucesso!\n");
            imprimirInformacoes(produto);
        } else {
            System.out.println("Produto não encontrado!");
        }

    }

    //recebe um objeto do tipo Produto que deve ser removido da lista produtos
    public void removerProduto(Produto produto) {
        if (produto != null && produtos.contains(produto)) {
            produtos.remove(produto);
            System.out.println("Produto removido com sucesso!\n");
        } else {
            System.out.println("Produto não encontrado!");
        }

    }

    //lista todos os produtos adicionados na lista produtos
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("O carrinho está vazio!");
        } else {
            for (Produto produto : produtos) {
                imprimirInformacoes(produto);
            }
        }
    }

    //soma o preço de todos os produtos que foram adicionados na lista produtos
    public void totalCompra() {
        if (produtos.isEmpty()) {
            System.out.println("O carrinho está vazio!");
        } else {
            double total = produtos.stream().map(preco -> preco.getPreco()).reduce(0.0, (a, b) -> a + b);
            System.out.println("O valor total da compra é R$" + total);
        }
    }

    //imprime na tela os dados de determinado produto
    private static void imprimirInformacoes(Produto produto) {
        if (produto instanceof Eletronico) {
            System.out.println((Eletronico) produto);
        } else {
            System.out.println((Vestuario) produto);
        }
        System.out.println("========================================================");
    }
}
