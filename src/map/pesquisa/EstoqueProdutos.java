package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, Integer quantidade, Double preco) {
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    public Double calcularValorTotalEstoque() {
        Double valorTotalEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto produtos : estoqueProdutoMap.values()) {
                valorTotalEstoque += produtos.getQuantidade() * produtos.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        Double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto produto : estoqueProdutoMap.values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1l, "Produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2l, "Produto B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3l, "Produto C", 2, 15.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque $" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());

    }

}


