package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) throws InterruptedException {

        Carrinho carrinho = new Carrinho();
        Estoque estoque = new Estoque();
        Scanner sc = new Scanner(System.in);

        System.out.println("===================MAROMO MARKETPLACE===================");
        System.out.println("BEM-VINDO A LOJA OFICIAL DO MAROMO!");

        do {
            try {
                System.out.println("========================================================");
                System.out.println("1 - Adicionar um produto no carrinho");
                System.out.println("2 - Remover um produto do carrinho");
                System.out.println("3 - Listar os itens no carrinho");
                System.out.println("4 - Calcular o total do compra");
                System.out.println("0 - Finalizar sessão");
                System.out.print("Escolha: ");
                int opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.println("========================================================");
                        System.out.println("Digite o nome do produto que deseja adicionar:");
                        String keyAdicionar = sc.nextLine().toLowerCase().replace(" ", "");
                        carrinho.adicionarProduto(estoque.recebeKey(keyAdicionar));
                        break;
                    case 2:
                        System.out.println("========================================================");
                        System.out.println("Digite o nome do produto que deseja remover:");
                        String keyRemover = sc.nextLine().toLowerCase().replace(" ", "");
                        carrinho.removerProduto(estoque.recebeKey(keyRemover));
                        break;
                    case 3:
                        System.out.println("========================================================");
                        try {
                            carrinho.listarProdutos();
                        } catch (Exception e) {
                            System.out.println("========================================================");
                            System.out.println("[ERRO] Produto não encontrado!");
                        }
                        break;
                    case 4:
                        System.out.println("========================================================");
                        carrinho.totalCompra();
                        break;
                    case 0:
                        System.out.println("========================================================");
                        System.out.println("Saindo...");
                        Thread.sleep(1000);
                        return;
                    default:
                        System.out.println("========================================================");
                        System.out.println("Opcão inválida! Tente novamente");
                        break;
                }
            } catch (Exception e) {
                System.out.println("========================================================");
                System.out.println("[ERRO] Digite apenas números inteiros!");
            }
        } while (true);
    }
}