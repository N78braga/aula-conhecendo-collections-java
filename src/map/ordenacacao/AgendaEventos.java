package map.ordenacacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
       // Evento evento = new Evento(nome, atracao);
        //eventoMap.put(data, evento);
        eventoMap.put(data, new Evento(nome, atracao));
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proxímo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }

        /*Set<LocalDate>dateSet = eventoMap.keySet(); //este Set return todas as key porém ele não conhece os values.

        Collection<Evento> values = eventoMap.values(); //Já esta collection retuern todos os values porém ele não
        conhece as key.

        eventoMap.get();*/

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(20023, Month.SEPTEMBER, 21), "Evento 1 ", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(20023, 7, 9), "Evento 2", " Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3 ",  "Atração 3");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }
}
