package aula_pesquizando_set.teste;

import aula_pesquizando_set.agenda.AgendaContatos;

public class AgendaContatoTeste {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Calvacante", 11111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
        System.out.println("Contato atulaizado:" + agendaContatos.atulaozarNumeroContato("Maria Silva", 5555555));

    }
}
