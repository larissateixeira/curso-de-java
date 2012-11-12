/*Crie uma classe Lembrete com um atributo List<String> tarefas. Em um método
 main, crie um mapa cujas chaves serão os dias da semana (String) e os valores
 serão objetos da classe Lembrete. Escreva algum código demonstrando a estrutura
 criada.*/

package exercicioDois;

import java.util.HashMap;

public class MainAgendaMap {

    public static void main(String[] args) {
         HashMap<String, Lembrete> agenda = new HashMap();
         Lembrete lembrete = new Lembrete();
         lembrete.tarefas.add("Estudar");
         lembrete.tarefas.add("Sair");
         agenda.put("Domingo", lembrete);
         agenda.put("Segunda", lembrete);
         agenda.put("Terça", lembrete);
         agenda.put("Quarta", lembrete);
         agenda.put("Quinta", lembrete);
         agenda.put("Sexta", lembrete);
         agenda.put("Sabado", lembrete);
         System.out.println(agenda.toString());
    }
}
