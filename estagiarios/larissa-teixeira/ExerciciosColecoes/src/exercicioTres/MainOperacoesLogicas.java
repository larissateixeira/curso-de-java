/*Implemente um programa que receberá do usuário duas relações de números inteiros
 positivos e um caractere representando uma das seguintes operações:
 + união
 * interseção*/
package exercicioTres;

import java.util.Scanner;
import java.util.TreeSet;

public class MainOperacoesLogicas {

    public static void main(String[] args) {
        TreeSet   <Integer> conjunto1 = new TreeSet();
        TreeSet <Integer> conjunto2 = new TreeSet();
        String primeiroConjunto;
        String [] numeros1;
        String [] numeros2;
        String segundoConjunto;
        char operador;
        
        System.out.println("Digite um conjunto: ");
        primeiroConjunto = new Scanner(System.in).nextLine();
        numeros1 = primeiroConjunto.split(", ");
        for(int i=0; i<numeros1.length; i++){
            conjunto1.add(Integer.parseInt(numeros1[i]));
       
        }
        
        System.out.println("Digite um operador");
        operador = new Scanner(System.in).next().charAt(0);

        System.out.println("Digite um conjunto: ");
        segundoConjunto = new Scanner(System.in).nextLine();
        numeros2 = segundoConjunto.split(", ");
        
        for(int i=0;i<numeros2.length;i++ ){
            conjunto2.add(Integer.parseInt(numeros2[i]));
       
        }
        
        System.out.println("Entrada:\n" + conjunto1 + "\n" + operador + "\n" + conjunto2);

        switch (operador) {
            case '+':
                conjunto1.addAll(conjunto2);
                System.out.println("Saida:\n" + conjunto1);
                break;
            case '*':
                conjunto1.retainAll(conjunto2);
                System.out.println("Saida:\n" + conjunto1);
                break;
            default:
                System.out.println("Operacao invalida");

        }
    }
}
