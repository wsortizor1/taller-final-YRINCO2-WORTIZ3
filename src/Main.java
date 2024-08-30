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
                    do {
                        System.out.println("*");
                        System.out.println("*");
                        System.out.println("------------------------------------------------");
                        System.out.println("-              Datos Primitivos                -");
                        System.out.println("------------------------------------------------");
                        System.out.println("-1. Explicación de Datos Primitivos            -");
                        System.out.println("-2. Ejemplo de Datos Primitivos                -");
                        System.out.println("-3. Otros ejemplos de datos primitivos         -");
                        System.out.println("-4. Volver                                     -");
                        System.out.print("Seleccione una opción del submenu: ");
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------");
                                System.out.println("-    1. Explicación de Datos Primitivos        -");
                                System.out.println("------------------------------------------------");
                                System.out.println("Los datos primitivos son los tipos de datos    -");
                                System.out.println("más básicos y fundamentales en Java. Incluyen  -");
                                System.out.println("int, char, boolean, byte, short, long, float,  -");
                                System.out.println("y double.                                      -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                System.out.println();
                                System.out.println();
                                System.out.println("  2. Ejemplo de Datos Primitivos"  );
                                System.out.println("------------------------------------------------");
                                System.out.println("En este ejemplo, se declara una variable llamada");
                                System.out.println("numero de tipo int y se le asigna el valor 10.  ");
                                System.out.println("	Luego se imprime el valor de la variable 	");
                                System.out.println("			en la consola.  					");
                                System.out.println("------------------------------------------------");
                                System.out.println("public class EjemploDatosPrimitivos {          -");
                                System.out.println("    public static void main(String[] args) {   -");
                                System.out.println("        int numero = 10;                       -");
                                System.out.println("        System.out.println(\"El valor de la     -");
                                System.out.println("        variable numero es: \" + numero);       -");
                                System.out.println("    }                                          -");
                                System.out.println("}                                              -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 3:
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println(" 3. Otros ejemplos de datos primitivos");
                                System.out.println("------------------------------------------------");
                                System.out.println("char: para caracteres individuales como 'a' 'Z'-");
                                System.out.println("boolean: para valores booleanos (true o false).-");
                                System.out.println("double: números punto flotante  doble precisión-");
                                System.out.println("float: números punto flotante  precisión simple-");
                                System.out.println("long: para números enteros largos.			   -");
                                System.out.println("short: para números enteros cortos.		       -");
                                System.out.println("byte: para números enteros muy pequeños.  	   -");
                                System.out.println("                                               -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 4:
                                System.out.println("Volver al menú");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (subMenu != 4);
                    break;
                case 2:
                    do {
                        System.out.println("*");
                        System.out.println("*");
                        System.out.println("------------------------------------------------");
                        System.out.println("-                  String                      -");
                        System.out.println("------------------------------------------------");
                        System.out.println("-1. Explicación de string                      -");
                        System.out.println("-2. Ejemplo y caracteristica del string        -");
                        System.out.println("-3. Volver                                     -");
                        System.out.print("Seleccione una opción del submenu: ");
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------");
                                System.out.println("-    1. Explicacion de string                  -");
                                System.out.println("------------------------------------------------");
                                System.out.println(" un String es un tipo de dato que se utiliza   -");
                                System.out.println(" para representar texto.                       -");
                                System.out.println(" Básicamente, es una secuencia de caracteres   -");
                                System.out.println(" que se encuentran entre comillas dobles.      -");
                                System.out.println("    Por ejemplo, 'Hola mundo' es un String   -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                System.out.println();
                                System.out.println();
                                System.out.println("  2. Ejemplo de String                        ");
                                System.out.println("------------------------------------------------");
                                System.out.println(" Inmutabilidad: Una vez que se crea un String,  ");
                                System.out.println(" su valor no puede ser modificado.              ");
                                System.out.println(" Cualquier operación que parezca modificar un 	");
                                System.out.println(" String en realidad crea un nuevo objeto String	");
                                System.out.println(" Declaración: Para declarar un String,          ");
                                System.out.println(" simplemente utilizas la palabra clave	String  ");
                                System.out.println(" seguida del nombre de la variable y el valor   ");
                                System.out.println(" y el valor entre comillas dobles.              ");
                                System.out.println("------------------------------------------------");
                                System.out.println("                                               -");
                                System.out.println("      String saludo = 'Hola, mundo';           -");
                                System.out.println("                                               -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 3:
                                System.out.println("Volver al menú");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (subMenu != 3);
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