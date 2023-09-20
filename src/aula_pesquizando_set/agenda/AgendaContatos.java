package aula_pesquizando_set.agenda;

import aula_pesquizando_set.contato.Contato;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet = new HashSet<>();

    public void adicionarContato(String nome, int telefone) {
        contatoSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

            for (Contato contato : contatoSet) {
                if (contato.getNome().startsWith(nome)) {
                    contatosPorNome.add(contato);
                }
            }

        return contatosPorNome;
    }
    public Contato atulaozarNumeroContato(String nome, int novoTelefone){
        Contato contatoAutualizado = null;
        for (Contato contato: contatoSet) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setTelefone(novoTelefone);
                contatoAutualizado = contato;
                break;
            }
        }
        return contatoAutualizado;
    }


}
