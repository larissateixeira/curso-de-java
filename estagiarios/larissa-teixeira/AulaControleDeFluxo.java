public class AulaControleDeFluxo{
	public static void main(String[] args){
		AulaControleDeFluxo aula = new AulaControleDeFluxo();
		System.out.println("O total de caracteres eh " + aula.exercicio2("Programa de Estagio 2012"));
	}
	public int exercicio2(String texto){
		char [] t = texto.toCharArray();
		int total = texto.length();
		for(int i = 0; i<texto.length(); i++){
			if(t[i] == ' '){
				total --;
			}
		}
		//System.out.println("O total de caracteres eh " + total);
		return total;
	}

}