package aula_ondernando_em_set.cadastros;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produtos> produtosSet = new HashSet<>();

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtosSet.add(new Produtos(cod, nome, preco, quantidade));
    }

    public Set<Produtos> exibirProdutosPorNome() {
        Set<Produtos> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produtos> exibirProdutoPorPreco() {
        Set<Produtos> produtosPorPreco = new TreeSet<>(new comparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1l, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2l, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1l, "Produto 5", 10d, 2);
        cadastroProdutos.adicionarProduto(9l, "Produto 9", 2d, 2);

        System.out.println(cadastroProdutos.produtosSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());


    }

}

