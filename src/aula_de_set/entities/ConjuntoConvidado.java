package aula_de_set.entities;

import aula_de_set.operaçõesBasicas.Convidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    private Set<Convidado> convidadoSet = new HashSet<>();

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado removerConvidado = null;
        if (!convidadoSet.isEmpty()) {
            for (Convidado convidado : convidadoSet) {
                if (convidado.getCodigoConvite() == codigoConvite) {
                    removerConvidado = convidado;
                    break;

                }
            }
            convidadoSet.remove(removerConvidado);
        }
    }

    public int contarConvidades() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }
}
