<<<<<<< HEAD
import java.util.Scanner;

public class Donante {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        int peso;

        System.out.println("Ingrese la edad: ");
        edad = teclado.nextInt();
        System.out.println("Ingrese el peso");
        peso = teclado.nextInt();

        if (edad >= 18 && edad <= 65 && peso > 50 ){
            System.out.println("el Donante es compatibe");
        }else {
            System.out.println("El donante no es compatible");
            System.out.println("Debe tener entre 18 y 65 años, pesar mas de 50Kg");
        }

    }
=======
package PACKAGE_NAME;

public class Donante {
>>>>>>> 5cf37c57f21a97ff688805711250ed0b3eb3f112
}
