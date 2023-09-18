package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasPraRemover = new ArrayList<>();
        for(Tarefa tarefas : tarefaList){
            if (tarefas.getDescricao().equals(descricao)) {
                tarefasPraRemover.add(tarefas);
            }
        }
        tarefaList.removeAll(tarefasPraRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }
}
