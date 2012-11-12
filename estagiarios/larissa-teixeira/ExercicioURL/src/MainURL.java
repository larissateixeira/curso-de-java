/*Crie um programa que recebe do usuário uma url e exibe os headers devolvidos
 após submeter a url. As linhas abaixo realizam a conexão e devolvem os headers:
 URL url = new URL("http://www.google.com");
 URLConnection conexao = url.openConnection();
 Map<String, List<String>> headers = conexao.getHeaderFields();
 */


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

public class MainURL {

    public static void main(String[] args) {
        try {
            String endereco = JOptionPane.showInputDialog("Digite uma URL:");
            URL url = new URL(endereco);
            URLConnection conexao = url.openConnection();
            Map<String, List<String>> headers = conexao.getHeaderFields();
            Set<String> chaves = headers.keySet();
            String valores = "";
            for (String chave : chaves){  
                if(chave != null)
                    valores += headers.get(chave) + "\n"; 
            }
            JOptionPane.showMessageDialog(null, valores); 
            
        }catch (MalformedURLException mal) {
            JOptionPane.showMessageDialog(null, "Erro na URL");
        }catch (IOException io) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
}