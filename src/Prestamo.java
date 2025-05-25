import java.util.Scanner;

public class Prestamo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorPrestamo;

        valorPrestamo = teclado.nextDouble();

        if (valorPrestamo >= 1000 && valorPrestamo <= 5000){
            System.out.println("El valor" + valorPrestamo+ " está dentro del intervalo permitido para el préstamo.");
        }else{
            System.out.println("El valor" + valorPrestamo +" no está dentro del intervalo permitido para el préstamo.");
            teclado.close();

        }
    }
}
