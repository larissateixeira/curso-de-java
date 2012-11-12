
package exercicioDois;

import java.util.ArrayList;

public class Lembrete{
   ArrayList<String> tarefas;
   Lembrete(){
       tarefas = new ArrayList();
   }
    @Override
   public String toString(){
    String conteudo = "";
    for(int i = 0; i<tarefas.size(); i++)
        conteudo += "\n\t -" + tarefas.get(i);
    conteudo += "\n";
    return conteudo;
   }
   
}