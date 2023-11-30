package org.example;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Produto> produtos = new HashMap<>();
        produtos.put("celular", new Eletronico("Celular", 999.99, "Smartphone avançado", "01/01/2023"));
        produtos.put("laptop", new Eletronico("Laptop", 1499.99, "Notebook de alta performance", "02/01/2023"));
        produtos.put("fonesdeouvido", new Eletronico("Fones de Ouvido", 79.99, "Fones sem fio confortáveis", "03/01/2023"));
        produtos.put("televisão", new Eletronico("Televisão", 799.99, "TV 4K com HDR", "04/01/2023"));
        produtos.put("cameradigital", new Eletronico("Câmera Digital", 499.99, "Câmera de alta resolução", "05/01/2023"));
        produtos.put("impressora", new Eletronico("Impressora", 199.99, "Impressora a laser colorida", "06/01/2023"));
        produtos.put("consoledevideogame", new Eletronico("Console de Videogame", 299.99, "Console de última geração", "07/01/2023"));
        produtos.put("monitor", new Eletronico("Monitor", 249.99, "Monitor LED de 24 polegadas", "08/01/2023"));
        produtos.put("tablet", new Eletronico("Tablet", 199.99, "Tablet leve e portátil", "09/01/2023"));
        produtos.put("cadeiradeescritório", new Eletronico("Cadeira de Escritório", 129.99, "Cadeira ergonômica", "10/01/2023"));

        produtos.put("camiseta", new Vestuario("Camiseta", 29.99, "Camiseta casual", Tamanho.M, "Branca"));
        produtos.put("calçajeans", new Vestuario("Calça Jeans", 59.99, "Calça jeans moderna", Tamanho.G, "Azul"));
        produtos.put("vestido", new Vestuario("Vestido", 39.99, "Vestido elegante", Tamanho.P, "Preto"));
        produtos.put("blusademoletom", new Vestuario("Blusa de Moletom", 49.99, "Blusa de moletom confortável", Tamanho.GG, "Cinza"));
        produtos.put("shorts", new Vestuario("Shorts", 24.99, "Shorts esportivo", Tamanho.M, "Azul Marinho"));
        produtos.put("sapato", new Vestuario("Sapato", 79.99, "Sapato social", Tamanho.GG, "Preto"));
        produtos.put("jaqueta", new Vestuario("Jaqueta", 69.99, "Jaqueta de couro", Tamanho.G, "Marrom"));
        produtos.put("saia", new Vestuario("Saia", 34.99, "Saia leve", Tamanho.P, "Rosa"));
        produtos.put("meia", new Vestuario("Meia", 5.99, "Meia confortável", Tamanho.PP, "Branca"));
        produtos.put("cachecol", new Vestuario("Cachecol", 19.99, "Cachecol de lã", Tamanho.PP, "Vermelho"));

        Carrinho carrinho = new Carrinho();
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
                        Produto produtoAdicionado = produtos.get(sc.nextLine().toLowerCase().replace(" ", ""));
                        carrinho.adicionarProduto(produtoAdicionado);
                        break;
                    case 2:
                        System.out.println("========================================================");
                        System.out.println("Digite o nome do produto que deseja remover:");
                        Produto produtoRemovido = produtos.get(sc.nextLine().toLowerCase().replace(" ", ""));
                        carrinho.removerProduto(produtoRemovido);
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