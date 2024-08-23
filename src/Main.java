import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu; //declaro tipo de dato y variable

        do { // do-while primero se ejecuta una vez el código (do) y, a continuación,
            // se evalúa la condición. Si esta no se cumple, el hilo de ejecución sale del bucle.
            System.out.println("------------------------------------------------");
            System.out.println("-          MENU CAPITULO PROGRAMACION          -");
            System.out.println("-                YRINCO2-WORTIZ3               -");
            System.out.println("------------------------------------------------");
            System.out.println("-       1.  Datos Primitivos                   -");
            System.out.println("-       2.  String                             -");
            System.out.println("-       3.  Constantes                         -");
            System.out.println("-       4.  Tipo de operadores                 -");
            System.out.println("-       5.  Condicional IF, ELSE, IF ELSE      -");
            System.out.println("-       6.  Condicional Switch                 -");
            System.out.println("-       7.  Condicional ternaria               -");
            System.out.println("-       8.  Bucle DO WHILE                     -");
            System.out.println("-       9.  Bucle WHILE                        -");
            System.out.println("-       10. Bucle FOR                          -");
            System.out.println("-       11. Chao                               -");
            System.out.println("Seleccione una opcion: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Has seleccionado la Opción 1.");
                    break;
                case 2:
                    System.out.println("Has seleccionado la Opción 2.");
                    break;
                case 3:
                    System.out.println("Has seleccionado la Opción 3.");
                    break;
                case 4:
                    System.out.println("Has seleccionado la Opción 4");
                    break;
                case 5:
                    System.out.println("Has seleccionado la Opción 5");
                    break;
                case 6:
                    System.out.println("Has seleccionado la Opción 6");
                    break;
                case 7:
                    System.out.println("Has seleccionado la Opción 7");
                    break;
                case 8:
                    System.out.println("Has seleccionado la Opción 8");
                    break;
                case 9:
                    System.out.println("Has seleccionado la Opción 9");
                    break;
                case 10:
                    System.out.println("Has seleccionado la Opción 10");
                    break;
                case 11:
                    System.out.println("Chao");
                    break;
            }
            System.out.println();
        } while (menu != 11);

        scanner.close();
    }
}