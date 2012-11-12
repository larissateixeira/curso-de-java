//Gere todos os números entre 1 e 1000 e ordene em ordem decrescente utilizando um TreeSet.
package exercicioUm;

import java.util.Collections;
import java.util.TreeSet;

public class MainOrdemDescrescente {

    public static void main(String[] args) {
        TreeSet<Integer> vetor = new TreeSet(Collections.reverseOrder());
        for(int i = 1; i<=1000; i++){
            vetor.add(i);
        }
        System.out.println(vetor);
    }
}
