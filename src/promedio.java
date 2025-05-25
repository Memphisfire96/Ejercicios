<<<<<<< HEAD
import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double media = 0.0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("ingrese el promedio del estudiante: ");
            media = teclado.nextDouble();
            if (media >= 7.0){
                System.out.println("El estudiante tuvo un promedio de " + media + " y fue aprobado");
            }else if(media >= 5.0 ){
                System.out.println("El estudiante tuvo un promedio de " + media + " y esta en recuperación");
            }else{
                System.out.println("El estudiante tuvo un promedio de " + media + " y esta reprobado");
            }
        }
    }
=======
package PACKAGE_NAME;

public class promedio {
>>>>>>> 5cf37c57f21a97ff688805711250ed0b3eb3f112
}
