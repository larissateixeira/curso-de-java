
package exercicioUm;

public class Carga {
    private double peso;
    
    Carga(){
        peso = 0;
    }

    public void setPeso(double peso)throws IllegalArgumentException{
            if(peso<0)
                throw new IllegalArgumentException();
            else
                this.peso = peso;
            
    }
    
    public double getPeso() {
        return peso;
    }
    
}
