import java.io.IOException;
import java.util.Scanner;
import java.lang.RuntimeException;

public class Principal{
    public static void main(String[] args) throws IOException, RuntimeException {
        Scanner consola = new Scanner(System.in);

        ConsultaMoneda monedaConsulta = new ConsultaMoneda();
        RuntimeException conversor = monedaConsulta.buscarConversion ("USD", "DOP");
        System.out.println(conversor);

        System.out.println("*****************************************************");
        System.out.println("    BIENVENIDOS AL CONVERSOR DE MONEDAS by iAbran  \n");
        String menu = """ 
        1) USD ---> DOP
        2) DOP ---> USD
        3) USD ---> BRL
        4) BRL ---> USD
        5) USD ---> COP
        6) COP ---> USD
        9) Salir

            Elija la opcion deseada a continuacion:
        """;
        int opciones = 0;

        while (opciones != 9) {
            System.out.println(menu);
            System.out.println("******************************************************");
            opciones = consola.nextInt();

            switch (opciones) {
                case 1:
                    conversor = monedaConsulta.buscarConversion("USD","DOP");
                    System.out.println("1 USD equivale a: " + conversor.hashCode() + "  Pesos DOP");
                    System.out.println("********************************************");
                    break;
                case 2:
                    conversor = monedaConsulta.buscarConversion("DOP","USD");
                    System.out.println("1 DOP equivale a: " + conversor.hashCode() + " USD");
                    System.out.println("********************************************");
                    break;
                case 3:
                    conversor = monedaConsulta.buscarConversion("USD", "BRL");
                    System.out.println("1 USD equivale a: " + conversor.hashCode() + " BRL");
                    System.out.println("********************************************");
                    break;
                case 4:
                    conversor = monedaConsulta.buscarConversion("BRL", "USD");
                    System.out.println("1 BRL equivale a: " + conversor.hashCode() + " USD");
                    System.out.println("********************************************");
                    break;
                case 5:
                    conversor = monedaConsulta.buscarConversion("USD", "COP");
                    System.out.println("1 USD equivale a: " + conversor.hashCode() + " Pesos COP");
                    System.out.println("********************************************");
                    break;
                case 6:
                    conversor = monedaConsulta.buscarConversion("COP", "USD");
                    System.out.println("1 COP equivale a: " + conversor.hashCode() + " USD");
                    System.out.println("********************************************");
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestro servicios");
                    System.out.println("********************************************");
                    break;
                default:
                    System.out.println("Lo sentimos, opcion incorrecta ");
                    System.out.println("********************************************");
                    break;
            }
        }
    }
}