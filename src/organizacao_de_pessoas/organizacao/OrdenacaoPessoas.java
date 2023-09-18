package organizacao_de_pessoas.organizacao;

import organizacao_de_pessoas.comparator.ComparatorPorAltura;
import organizacao_de_pessoas.pessoas.Pessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoas> pessoasList = new ArrayList<>();

    public void adionarPessoas(String nome, int idade, double altura) {
        pessoasList.add(new Pessoas(nome, idade, altura));
    }

    public List<Pessoas> ordenarPorIdade() {
        List<Pessoas> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;

    }

    public List<Pessoas> ordenarPorAltura() {
        List<Pessoas> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
}
