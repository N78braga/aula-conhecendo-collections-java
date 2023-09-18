package organizacao_de_pessoas.pessoas;

import java.util.Comparator;

public class Pessoas implements Comparable<Pessoas> {
    private String nome;
    private int idade;
    private double altura;

    public Pessoas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Pessoas p) {
        return Integer.compare(idade, p.getIdade());
    }

    @Override
    public String toString() {
        return "nome= " + nome + ", idade=" + idade + ", altura=" + altura;
    }
}



