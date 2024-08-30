import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //objeto Scanner
        Scanner scannerEnter = new Scanner(System.in); //objeto Scanner
        int menu, subMenu; //declaro tipo de dato y variable

        do {
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
            System.out.print("-Seleccione una opcion: "); //Sin "ln" digita la opcion en la misma linea
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
                    do {
                        System.out.println("------------------------------------------------");
                        System.out.println("-                    Switch                    -");
                        System.out.println("------------------------------------------------");
                        System.out.println("-1. Explicación Switch                         -");
                        System.out.println("-2. Programa de Switch-Valide su calificación  -");
                        System.out.println("-3. Volver al menu                             -");
                        System.out.print("Seleccione una opción del menu: ");
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println();
                                System.out.println("------------------------------------------------");
                                System.out.println("-          1. Explicación Switch               -");
                                System.out.println("------------------------------------------------");
                                System.out.println("La declaración switch es una estructura de     -");
                                System.out.println("control de flujo condicional que permite       -");
                                System.out.println("evaluar una expresión o variable               -");
                                System.out.println("contra varios valores posibles y ejecutar      -");
                                System.out.println("un bloque de código específico para cada caso. -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                System.out.println("  2. Programa de Switch-Valide su calificación");
                                System.out.println();
                                System.out.print("Ingresar rango de 1 -10: ");

                                byte nota = scanner.nextByte();

                                switch (nota) {
                                    case 1:
                                    case 2:
                                        System.out.println("Su calificación es: F");
                                        break;
                                    case 3:
                                    case 4:
                                        System.out.println("Su calificación es: D");
                                        break;
                                    case 5:
                                    case 6:
                                        System.out.println("Su calificación es: C");
                                        break;
                                    case 7:
                                    case 8:
                                        System.out.println("Su calificación es: B");
                                        break;
                                    case 9:
                                    case 10:
                                        System.out.println("Su calificación es: A");
                                        break;
                                    default:
                                        System.out.println("Número no válido, por favor verifique");
                                }
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 3:
                                System.out.println("Volver al menú");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    }
                    while (subMenu != 3);
                    break;
                case 7:
                    do {
                        System.out.println("------------------------------------------------");
                        System.out.println("-                    Ternaria                  -");
                        System.out.println("------------------------------------------------");
                        System.out.println("-1. Explicación Ternaria                       -");
                        System.out.println("-2. Programa de Ternaria-Determine si un número es par o impar -");
                        System.out.println("-3. Volver al menu                             -");
                        System.out.print("Seleccione una opción del menu: ");
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println();
                                System.out.println("------------------------------------------------");
                                System.out.println("-          1. Explicación Ternaria             -");
                                System.out.println("------------------------------------------------");
                                System.out.println("El operador ternario en Java es una             ");
                                System.out.println("construcción que permite tomar decisiones      -");
                                System.out.println("basadas en una condición booleana              -");
                                System.out.println("de manera concisa en una sola línea de código. -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                System.out.println("  2. Programa de Ternaria-Determine si un número es par o impar");
                                System.out.println();
                                System.out.print("Digite el número: ");

                                int numero = scanner.nextInt();{
                                String resultado = (numero % 2 == 0) ? "par" : "impar";
                                System.out.println("El número " + numero + " es " + resultado + ".");
                            }
                            System.out.println("--------------Enter para continuar--------------");
                            scannerEnter.nextLine();
                            break;
                            case 3:
                                System.out.println("Volver al menú");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    }
                    while (subMenu != 3);
                    break;
                case 8:
                    do {
                        System.out.println("------------------------------------------------");
                        System.out.println("-                Bucle DO WHILE                -");
                        System.out.println("------------------------------------------------");
                        System.out.println("-1. Explicación bucle DO WHILE                 -");
                        System.out.println("-2. Programa DO WHILE - Adivina el número      -");
                        System.out.println("-3. Volver al menu                             -");
                        System.out.print("Seleccione una opción del menu: ");
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println();
                                System.out.println("------------------------------------------------");
                                System.out.println("-        1. Explicación bucle DO WHILE         -");
                                System.out.println("------------------------------------------------");
                                System.out.println("El operador ternario en Java es una             ");
                                System.out.println("construcción que permite tomar decisiones      -");
                                System.out.println("basadas en una condición booleana              -");
                                System.out.println("de manera concisa en una sola línea de código. -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                System.out.println("  2. Programa de Ternaria-Determine si un número es par o impar");
                                System.out.println();
                                System.out.print("Digite el número: ");

                                int numero = scanner.nextInt();{
                                String resultado = (numero % 2 == 0) ? "par" : "impar";
                                System.out.println("El número " + numero + " es " + resultado + ".");
                            }
                            System.out.println("--------------Enter para continuar--------------");
                            scannerEnter.nextLine();
                            break;
                            case 3:
                                System.out.println("Volver al menú");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    }
                    while (subMenu != 3);
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
                default:
                    System.out.println("Opcion no valida, intentalo de nuevo");
            }
        } while (menu != 11);
        scanner.close();
        scannerEnter.close();
    }
}