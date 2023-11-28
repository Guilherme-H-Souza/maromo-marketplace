package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Carrinho {
    private final List<Produto> produtos = new LinkedList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!\n");
        imprimirInformacoes(produto);
    }

    Scanner sc = new Scanner(System.in);
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println("Produto removido com sucesso!\n");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("O carrinho está vazio!");
        } else {
            for (Produto produto : produtos) {
                imprimirInformacoes(produto);
            }
        }
    }

    public void totalCompra() {
        if (produtos.isEmpty()) {
            System.out.println("O carrinho está vazio!");
        } else {
            double total = 0;
            for (Produto produto : produtos) {
                total += produto.getPreco();
            }
            System.out.println("O valor total da compra é R$" + total);
        }
    }

    private static void imprimirInformacoes(Produto produto) {
        System.out.println("Nome: " + produto.getNome());
        System.out.println("R$" + produto.getPreco());
        System.out.println("Descrição: " + produto.getDescricao());

        if (produto instanceof Eletronico) {
            System.out.println("Garantia: " + ((Eletronico) produto).getGarantia());
        } else {
            System.out.println("Tamanho: " + ((Vestuario) produto).getTamanho());
            System.out.println("Cor: " + ((Vestuario) produto).getCor());
        }
        System.out.println("========================================================");
    }
}
