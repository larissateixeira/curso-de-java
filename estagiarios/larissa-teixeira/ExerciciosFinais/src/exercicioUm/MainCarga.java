/*Crie a classe Carga com o atributo double peso. Ela terá um construtor e um
 método setter para o peso. Valide o peso (peso > 0) antes de jogar no atributo
 e caso seja inválido lance a exceção IllegalArgumentException do pacote lang.
 */
package exercicioUm;

public class MainCarga {

    public static void main(String[] args) {
        Carga cargaPositiva = new Carga();
        Carga cargaNegativa = new Carga();
        cargaPositiva.setPeso(4);
        cargaNegativa.setPeso(-1);
    }
    
}
