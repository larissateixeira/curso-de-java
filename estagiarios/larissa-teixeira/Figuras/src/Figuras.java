
public class Figuras {

    public static void main(String[] args) {
        Figuras triangulo = new Figuras();
        //triangulo.triang1();
        //triangulo.triang2();
        //triangulo.triang3();
        //triangulo.triang4();
        triangulo.losango();

    }

    public void triang1() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void triang2() {
        for (int i = 10; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void triang3() {
        for (int i = 10; i > 0; i--) {
            for (int j = 10; j > 0; j--) {
                if (j < i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public void triang4() {
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > 1; j--) {
                if (j < i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public void losango() {
        int qtd = 0;
        while (qtd < 21/2) {
            for (int j = 0; j < 21; j++) {
                if (j >= ((21 / 2) - qtd) && j <= ((21 / 2) + qtd)) {
                    System.out.print("*");

                } else System.out.print(" ");

            }
            qtd++;
            System.out.println("");
        }        
        while (qtd >= 0) {
            for (int j = 0; j < 21; j++) {
                if (j >= ((21 / 2) - qtd) && j <= ((21 / 2) + qtd)) {
                    System.out.print("*");

                } else System.out.print(" ");
            }
            qtd--;
            System.out.println("");
        }
    }
}
