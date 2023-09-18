package organizacao_de_pessoas.comparator;

import organizacao_de_pessoas.pessoas.Pessoas;

import java.util.Comparator;

public class ComparatorPorAltura implements Comparator<Pessoas> {
    @Override
    public int compare(Pessoas p1, Pessoas p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
