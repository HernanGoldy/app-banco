import java.util.Scanner;

public class DesafioBanco {

    public static void main(String[] args) {

        String nombre = "John Smith";
        String tipoDeCuenta = "Corriente";
        int saldo = 15999;
        int opcion = 0;

        System.out.println("*********************************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: $" + saldo + "\n");
        System.out.println("*********************************************************");

        String menu = """
                *** Escriba el múmero de la opción que desea ejecutar ***
                1 - Consultar saldo
                2 - Extraer
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);

        while (opcion != 9) {
            System.out.print(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Saldo disponible: $" + saldo + "\n");
                    System.out.println("*********************************************************");
                }
                case 2 -> {
                    System.out.println("¿Cuál es el valor que desea extraer?");
                    int valorAExtraer = teclado.nextInt();
                    // Si el saldo es insuficiente el cliente no podrá realizar la transacción
                    if (saldo < valorAExtraer) {
                        System.out.println("El saldo disponible es insuficiente");
                        System.out.println("Su saldo actual es: $" + saldo + "\n");
                        System.out.println("*********************************************************");
                    } else {
                        saldo -= valorAExtraer;
                        System.out.println("Valor extraído: $" + valorAExtraer);
                        System.out.println("Saldo disponible: $" + saldo + "\n");
                        System.out.println("*********************************************************");
                    }
                }
                case 3 -> {
                    System.out.println("¿Cuál es el valor que desea depositar?");
                    int valorADepositar = teclado.nextInt();
                    saldo += valorADepositar;
                    System.out.println("Valor depositado: $" + valorADepositar);
                    System.out.println("Saldo disponible: $" + saldo + "\n");
                    System.out.println("*********************************************************");
                }
                case 9 -> System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                default -> System.out.println("Opción no valida\n");
            }
        }
    }
}
