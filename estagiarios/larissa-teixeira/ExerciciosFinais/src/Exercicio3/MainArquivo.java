/*Abra um arquivo chamado series.tv em qualquer diretório e escreva o nome de
 suas 5 séries favoritas nele (uma por linha). Encerre o fluxo de escrita.
 Abra o arquivo e leia o conteúdo exibindo-o na saída. Encerre o fluxo de leitura.*/
package Exercicio3;

import java.io.*;

public class MainArquivo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        OutputStream arq = new FileOutputStream("series.txt");
        OutputStreamWriter arqow = new OutputStreamWriter(arq);
        BufferedWriter arqw = new BufferedWriter(arqow);
        arqw.write("How I Met Your mother\n"
                + "Gossip Girl\n"
                + "Pretty Little Liars\n"
                + "Touch\n"
                + "New Girl");
        arqw.close();
        InputStream arqi = new FileInputStream("series.txt");
        InputStreamReader arqir = new InputStreamReader(arqi);
        BufferedReader arqr = new BufferedReader(arqir);
        while(arqr.ready()){
            System.out.println(arqr.readLine());
        }
        arqr.close();
    }
}
