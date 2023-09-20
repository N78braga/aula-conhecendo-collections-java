package aula_ondernando_em_set.cadastros;

import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos> {
    private long cod;
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(long cod, String nome, double preco, int quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produtos produtos)) return false;
        return getCod() == produtos.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public String toString() {
        return "(" + nome + ", " + cod + ", " + preco + ", " + quantidade + ")";
    }

    @Override
    public int compareTo(Produtos p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class comparatorPorPreco implements Comparator<Produtos> {

    @Override
    public int compare(Produtos p1, Produtos p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}