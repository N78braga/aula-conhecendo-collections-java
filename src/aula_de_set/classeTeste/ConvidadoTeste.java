package aula_de_set.classeTeste;

import aula_de_set.entities.ConjuntoConvidado;

public class ConvidadoTeste {
    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

        conjuntoConvidado.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Existem " + conjuntoConvidado.contarConvidades() + " convidado(s) dentro do set de convidados");

        conjuntoConvidado.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidado.contarConvidades() + " convidado(s)  dentro do set de convidados");

        conjuntoConvidado.exibirConvidados();
    }
}
