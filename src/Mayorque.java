import java.util.Scanner;

public class Mayorque {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero1 = teclado.nextInt();
        System.out.println("ingrese el segundo numero");
        int numero2 = teclado.nextInt();

        if (numero1 > numero2){
            System.out.println("el numero: "+ numero1 + " es mayor que el numero "+numero2);
        }else if (numero1 < numero2){
            System.out.println("el numero: "+ numero2 + " es mayor que el numero "+numero1);
        }else {
            System.out.println("los numeros son iguales");
        }

    }
}
