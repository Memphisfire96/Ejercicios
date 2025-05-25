import java.util.Scanner;

public class ValorCompra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingresa el valor de la compra");
        double valor = teclado.nextDouble();

        if(valor >= 100.00){
            double descuento = valor * 0.10;
            double valorTotal = valor - descuento;
            System.out.println("Descuento del 10 % aplicado");
            System.out.println("nuevo valor: "+valorTotal);
        }else {
            System.out.println("Descuento no aplicado");
            System.out.println("valor asignado: " +valor);
        }
    }
}
