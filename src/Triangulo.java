import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1;
        int valor2;
        int valor3;

        System.out.println("por favor ingrese lado 1:");
        valor1 = teclado.nextInt();
        System.out.println("por favor ingrese lado 2:");
        valor2 = teclado.nextInt();
        System.out.println("por favor ingrese lado 3:");
        valor3 = teclado.nextInt();

        if (valor1 + valor2 > valor3 && valor2 + valor3 > valor1 && valor1 + valor3 > valor2){
            System.out.println("Los lados pueden formar un triangulo");

        }else {
            System.out.println("los lados no pueden formar un triangulo");
        }


    }
}
