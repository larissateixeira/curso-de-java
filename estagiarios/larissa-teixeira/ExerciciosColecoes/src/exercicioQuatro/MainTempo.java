/*Implemente um programa para medir o tempo de execução de algumas classes
 da API de collections (pelo menos 4 delas) no que diz respeito a adicionar e
 percorrer elementos. Receba do usuário a quantidade de elementos que serão
 inseridos. Dica: Use System.currentTimeMillis() para pegar o tempo atual em milissegundos.*/
package exercicioQuatro;

import java.util.*;

public class MainTempo {

    public static void main(String[] args) {
        long t = 0;
        Iterator iterator;
        
        System.out.println("Digite a quantidade de numeros a serem adicionados:");
        int quantidade = new Scanner(System.in).nextInt();

        //TREESET
        t = System.currentTimeMillis();
        TreeSet vetor = new TreeSet();
        for (int i = 0; i < quantidade; i++) {
            vetor.add(i);
        }
        for (int i = 0; i < vetor.size(); i++) {
            iterator = vetor.iterator();
        }
        t = System.currentTimeMillis() - t;
        System.out.println("TreeSet: " + t);

        //ARRAYLIST
        t = System.currentTimeMillis() - t;
        ArrayList array = new ArrayList();
        for (int i = 0; i < quantidade; i++) {
            array.add(i);
        }
        for (int i = 0; i < array.size(); i++) {
            iterator = array.iterator();
        }
        t = System.currentTimeMillis() - t;
        System.out.println("Array: " + t);

        //HASHMAP
        t = System.currentTimeMillis() - t;
        HashMap map = new HashMap();
        for (int i = 0; i < quantidade; i++) {
            map.put(i, "");
        }
        for (int i = 0; i < map.size(); i++) {
            Object get = map.get(i);
        }
        t = System.currentTimeMillis() - t;
        System.out.println("Map: " + t);
        
        //LINKEDLIST
        t = System.currentTimeMillis() - t;
        LinkedList list = new LinkedList();
        for (int i = 0; i < quantidade; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            iterator = list.iterator();
        }
        t = System.currentTimeMillis() - t;
        System.out.println("List: " + t);
    }
}
