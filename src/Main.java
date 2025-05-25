import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double ingresoNumero;


        for (int i = 0; i < 10; i++) {
            ingresoNumero = teclado.nextDouble();
            if (ingresoNumero %2 == 0){
                System.out.println("El número "+ingresoNumero + " es par");
            }else {
                System.out.println("El número "+ingresoNumero + " es impar");
            }


        }
    }
}