package org.example;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    public Map<String, Produto> produtos = new HashMap<>();

    public Estoque() {
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
    }

    //recebe uma chave e retorna o seu valor correspondente
    public Produto recebeKey(String key) {
        return produtos.get(key);
    }
}
