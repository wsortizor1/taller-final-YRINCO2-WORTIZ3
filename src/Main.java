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
            System.out.println("*");
            System.out.println("*");
            System.out.print("---------Seleccione una opcion : "); //Sin "ln" digita la opcion en la misma linea
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
                        System.out.println("*");
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
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------");
                                System.out.println("  2. Ejemplo de Datos Primitivos               -");
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
                                System.out.println("------------------------------------------------");
                                System.out.println(" 3.    Otros ejemplos de datos primitivos       ");
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
                                System.out.println("-----------------Volver al menú-----------------");
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
                        System.out.println("*");
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
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------");
                                System.out.println("     2.     Ejemplo de String                  -");
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
                    do {
                        System.out.println("*");
                        System.out.println("*");
                        System.out.println("------------------------------------------------");
                        System.out.println("-                  Constantes                  -");
                        System.out.println("------------------------------------------------");
                        System.out.println("-1. Explicación de constantes                  -");
                        System.out.println("-2. Ejemplo y caracteristica de constantes     -");
                        System.out.println("-3. Volver                                     -");
                        System.out.println("*");
                        System.out.print("Seleccione una opción del submenu: ");
                        subMenu = scanner.nextInt();

                        switch (subMenu) {
                            case 1:
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------");
                                System.out.println("-    1. Explicacion de constante               -");
                                System.out.println("------------------------------------------------");
                                System.out.println(" Es un valor que no cambia durante la ejecucion-");
                                System.out.println(" del programa. se utilizan para representar    -");
                                System.out.println(" valores fijos y de lectura unica              -");
                                System.out.println(" las constantes en JAVA se declaran usando     -");
                                System.out.println(" la palabra clave final                        -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------");
                                System.out.println("       2. Ejemplo de constante                 -");
                                System.out.println("------------------------------------------------");
                                System.out.println(" Constantes literales                           ");
                                System.out.println(" Por ejemplo, el numero '25' en                 ");
                                System.out.println(" 'int edad =25; ' es una constante literarl   	");
                                System.out.println("                                               	");
                                System.out.println(" Constantes definidas con 'final'               ");
                                System.out.println(" ejemplo como 'final int MAX_VALUE =100;'       ");
                                System.out.println(" que define que una constante no puede ser      ");
                                System.out.println(" modificada                                     ");
                                System.out.println("------------------------------------------------");
                                System.out.println(" Ejemplo de uso: constante 'PI' para calculos  -");
                                System.out.println(" final double PI = 3.14159;                    -");
                                System.out.println(" double area = PI * radio * radio;             -");
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

                case 4:
                    do {
                        System.out.println("*");
                        System.out.println("*");
                        System.out.println("------------------------------------------------");
                        System.out.println("-              Tipo de operadores              -");
                        System.out.println("------------------------------------------------");
                        System.out.println("-1. Operadores Aritméticos                     -");
                        System.out.println("-2. Operadores de Comparación                  -");
                        System.out.println("-3. Operadores de Asignación                   -");
                        System.out.println("-4. Operadores Lógicos                         -");
                        System.out.println("-5. Operadores Unarios                         -");
                        System.out.println("-6. Operadores de Condicional Ternario         -");
                        System.out.println("-7. Operadores de Tipo                         -");
                        System.out.println("-8. Operadores Bit a Bit                       -");
                        System.out.println("-9. Volver                                     -");
                        System.out.println("*");
                        System.out.print("Seleccione una opción del submenu: ");
                        subMenu = scanner.nextInt();

                        switch (subMenu) {
                            case 1:
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------");
                                System.out.println("-    1. Operadores Aritméticos                 -");
                                System.out.println("------------------------------------------------");
                                System.out.println(" Estos operadores se utilizan para realizar    -");
                                System.out.println(" operaciones matemáticas básicas               -");
                                System.out.println(" Suma (+): a + b                               -");
                                System.out.println(" Resta: a - b                                  -");
                                System.out.println(" Multiplicación (*): a * b                     -");
                                System.out.println(" División (/): a / b                           -");
                                System.out.println(" Módulo (%): a % b                             -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;

                            case 2:
                                System.out.println();
                                System.out.println();
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("  2.     Operadores de Comparación                                   -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println(" Estos operadores se utilizan para comparar dos valores.             -");
                                System.out.println(" Igual a (==): a == b                                                -");
                                System.out.println(" No igual a (!=): a != b         							  	     -");
                                System.out.println(" Mayor que (>): a > b									 		     -");
                                System.out.println(" Menor que (<): a < b												 -");
                                System.out.println(" Mayor o igual que (>=): a >= b										 -");
                                System.out.println(" Menor o igual que (<=): a <= b   							         -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("--------------Enter para continuar------------------------------------");
                                scannerEnter.nextLine();
                                break;

                            case 3:
                                System.out.println();
                                System.out.println();
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("  3.     Operadores de Asignación                                    -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println(" Estos operadores se utilizan para asignar valores a las variables.  -");
                                System.out.println(" Asignación (=): a = b                                               -");
                                System.out.println(" Asignación con suma (+=): a += b (equivalente a a = a + b)  	     -");
                                System.out.println(" Asignación con resta (-=): a -= b (equivalente a a = a - b)         -");
                                System.out.println("Asignación con multiplicación (*=): a *= b (equivalente a a = a * b) -");
                                System.out.println(" eAsignación con división (/=): a /= b (equivalente a a = a / b)     -");
                                System.out.println("Asignación con módulo (%=): a %= b (equivalente a a = a % b)         -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("--------------Enter para continuar------------------------------------");
                                scannerEnter.nextLine();
                                break;

                            case 4:
                                System.out.println();
                                System.out.println();
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("  4.            Operadores Lógicos                                   -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println(" Estos operadores se utilizan para combinar condiciones booleanas.   -");
                                System.out.println(" AND lógico (&&): a && b (true si ambas condiciones son verdaderas)  -");
                                System.out.println(" OR lógico (||): a || b (true si al menos una de las condiciones es verdadera)   -");
                                System.out.println(" NOT lógico (!): !a (invierte el valor booleano de a)                -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("--------------Enter para continuar------------------------------------");
                                scannerEnter.nextLine();
                                break;

                            case 5:
                                System.out.println();
                                System.out.println();
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("  5. 		   Operadores Unarios                                    -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println(" Estos operadores operan sobre un solo operando.					 -");
                                System.out.println(" Negación (-): -a (invierte el signo del valor)                      -");
                                System.out.println(" Incremento (++): a++ o ++a (aumenta el valor en 1)	 			     -");
                                System.out.println(" Decremento (--): a-- o --a (disminuye el valor en 1)		         -");
                                System.out.println(" Complemento a uno (~): ~a (invierte todos los bits del valor)		 -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("--------------Enter para continuar------------------------------------");
                                scannerEnter.nextLine();
                                break;

                            case 6:
                                System.out.println();
                                System.out.println();
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("  6. 		  Operadores de Condicional Ternario                     -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println(" Se utilizan para realizar una asignación basada en una condición.   -");
                                System.out.println(" 												                     -");
                                System.out.println(" Ternario (?:): condition ? trueValue : falseValue 	 			     -");
                                System.out.println(" (si condition es verdadera, devuelve trueValue; de lo contrario,    -");
                                System.out.println(" devuelve falseValue)	      										 -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("--------------Enter para continuar------------------------------------");
                                scannerEnter.nextLine();
                                break;

                            case 7:
                                System.out.println();
                                System.out.println();
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("  7. 		 Operadores de Tipo						                 -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println(" Estos operadores se utilizan para trabajar con tipos de datos.	  	 -");
                                System.out.println(" 												                     -");
                                System.out.println(" Instanceof (instanceof): a instanceof Type (verifica si 			 -");
                                System.out.println(" a es una instancia del tipo Type)								     -");
                                System.out.println("   				    	      										 -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("--------------Enter para continuar------------------------------------");
                                scannerEnter.nextLine();
                                break;

                            case 8:
                                System.out.println();
                                System.out.println();
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("  8. 		 Operadores Bit a Bit					                 -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println(" Estos operadores trabajan con los bits individuales de los valores. -");
                                System.out.println(" AND bit a bit (&): a & b 						                     -");
                                System.out.println(" OR bit a bit (|): a | b								 			 -");
                                System.out.println(" XOR bit a bit (^): a ^ b										     -");
                                System.out.println(" Desplazamiento a la izquierda (<<): a << b (desplaza los bits       -");
                                System.out.println(" de a hacia la izquierda b posiciones) 							     -");
                                System.out.println(" Desplazamiento a la derecha sin signo (>>>): a >>> b (desplaza los  -");
                                System.out.println(" bits de a hacia la derecha b posiciones sin signo) 			     -");
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("--------------Enter para continuar------------------------------------");
                                scannerEnter.nextLine();
                                break;

                            case 9:
                                System.out.println("Volver al menú");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (subMenu != 9);
                    break;

                case 5:
                    do {
                        System.out.println("*");
                        System.out.println("*");
                        System.out.println("------------------------------------------------");
                        System.out.println("-       Condicional IF, ELSE, IF ELSE          -");
                        System.out.println("------------------------------------------------");
                        System.out.println("-1. Estructura if					           -");
                        System.out.println("-2. Estructura if-else                         -");
                        System.out.println("-3. Estructura if-else if-else                 -");
                        System.out.println("-4. Volver                                     -");
                        System.out.println("*");
                        System.out.print("Seleccione una opción del submenu: ");
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------");
                                System.out.println("-    1. Estructura if                          -");
                                System.out.println("------------------------------------------------");
                                System.out.println(" La estructura if se usa para ejecutar un      -");
                                System.out.println(" bloque de código si una condición es verdadera-");
                                System.out.println("												");
                                System.out.println(" int number = 10;                              -");
                                System.out.println(" if (number > 0) {                             -");
                                System.out.println("  System.out.println(El número es positivo);   -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                System.out.println();
                                System.out.println();
                                System.out.println("------------------------------------------------");
                                System.out.println("  2. Estructura if-else						   -");
                                System.out.println("------------------------------------------------");
                                System.out.println(" La estructura if-else permite ejecutar un     -");
                                System.out.println(" bloque de código si la condición es verdadera -");
                                System.out.println("	y otro bloque si la condición es falsa.    -");
                                System.out.println("												");
                                System.out.println("------------------------------------------------");
                                System.out.println(" if (condition) {						       -");
                                System.out.println(" // Bloque de código a ejecutar si la          -");
                                System.out.println(" condición es verdadera 						");
                                System.out.println("        } else {		                       -");
                                System.out.println("  // Bloque de código a ejecutar si la         -");
                                System.out.println(" condición es falsa								");
                                System.out.println("    }                                          -");
                                System.out.println("}                                              -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 3:
                                System.out.println("*");
                                System.out.println("*");
                                System.out.println("------------------------------------------------------------");
                                System.out.println("           3.     Estructura if-else if-else	    	   -");
                                System.out.println("------------------------------------------------------------");
                                System.out.println(" La estructura if-else if-else permite manejar             -");
                                System.out.println(" múltiples condiciones.							           -");
                                System.out.println(" Puedes usar varias cláusulas else if para verificar       -");
                                System.out.println(" múltiples condiciones y un bloque else al final para      -");
                                System.out.println(" manejar el caso en que ninguna de condiciones anteriores  -");
                                System.out.println(" sea verda                                                 -");
                                System.out.println("                                                           -");
                                System.out.println("------------------------------------------------------------");
                                System.out.println("   if (condition1) {   						   			   -");
                                System.out.println(" // Bloque de código a ejecutar si condition1 es verdadera -");
                                System.out.println(" } else if (condition2) {  							       -");
                                System.out.println(" // Bloque de código a ejecutar si condition1 es falsa     -");
                                System.out.println("       y condition2 es verdadera  				    	   -");
                                System.out.println(" } else {                                                  -");
                                System.out.println(" // Bloque de código a ejecutar si ninguna de las          -");
                                System.out.println(" condiciones anteriores es verdadera                       -");
                                System.out.println("  }                                                        -");
                                System.out.println("------------------------------------------------------------");
                                System.out.println("---------------------Enter para continuar-------------------");
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

                                int numero = scanner.nextInt();
                            {
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
                                System.out.println("Los ciclos do-while son una estructura de       ");
                                System.out.println("de control cíclica, que nos permiten ejecutar  -");
                                System.out.println("una o varias líneas de código de forma         -");
                                System.out.println("repetitiva sin necesidad de tener un valor     -");
                                System.out.println("inicial e incluso a veces sin siquiera conocer -");
                                System.out.println("cuándo se va a dar el valor final.             -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                System.out.println("Adivine un número del 1 al 10");

                                int numero = (int) (Math.random() * 10) + 1; // Número aleatorio del 1 al 10
                                int intento;

                                do {
                                    System.out.print("Digite el número: ");
                                    intento = scanner.nextInt();

                                    if (intento < numero) {
                                        System.out.println("Demasiado bajo, intente nuevamente");
                                    } else if (intento > numero) {
                                        System.out.println("Demasiado alto, intente nuevamente");
                                    }
                                } while (intento != numero);

                                System.out.println("¡Felicidades! Has adivinado el número.");

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
                    do {
                        System.out.println("------------------------------------------------");
                        System.out.println("-                  Bucle WHILE                 -");
                        System.out.println("------------------------------------------------");
                        System.out.println("-1. Explicación bucle WHILE                    -");
                        System.out.println("-2. Programa WHILE - Sumatoria de número       -");
                        System.out.println("-3. Volver al menu                             -");
                        System.out.print("Seleccione una opción del menu: ");
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println();
                                System.out.println("------------------------------------------------");
                                System.out.println("-        1. Explicación bucle WHILE            -");
                                System.out.println("------------------------------------------------");
                                System.out.println("El bucle while se encuentra en casi todos      -");
                                System.out.println("los lenguajes de programación, y Java no es    -");
                                System.out.println("una excepción. El ciclo while en Java y otros  -");
                                System.out.println("lenguajes ejecuta una declaración o bloque     -");
                                System.out.println("de declaraciones siempre que el valor de la    -");
                                System.out.println("condición que lo activó sea verdadero.         -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                System.out.print("Introduce el valor de N: ");//Introduce N
                                int N = scanner.nextInt();

                                int suma = 0;// se inicializan las variables
                                int contador = 1;// se inicializan las variables

                                while (contador <= N) {
                                    suma += contador;// Añadir contador a la suma
                                    contador++;// Incrementa el contador
                                }
                                System.out.println("La suma de los números del 1 al " + N + " es: " + suma);

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
                case 10:
                    do {
                        System.out.println("------------------------------------------------");
                        System.out.println("-               Explicacion bucle FOR          -");
                        System.out.println("------------------------------------------------");
                        System.out.println("-1. Explicación bucle FOR                      -");
                        System.out.println("-2. Programa FOR - Sumatoria de número         -");
                        System.out.println("-3. Volver al menu                             -");
                        System.out.print("Seleccione una opción del menu: ");
                        subMenu = scanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println();
                                System.out.println("------------------------------------------------");
                                System.out.println("-        1. Explicación bucle FOR              -");
                                System.out.println("------------------------------------------------");
                                System.out.println("El bucle for en Java toma como punto de partida-");
                                System.out.println("un índice de control. Al final de cada bucle,  -");
                                System.out.println("este índice se actualiza según una regla que   -");
                                System.out.println("estableces en la estructura del bucle.         -");
                                System.out.println("Acto seguido, el bucle comprueba si el índice  -");
                                System.out.println("satisface la condición booleana.               -");
                                System.out.println("------------------------------------------------");
                                System.out.println("--------------Enter para continuar--------------");
                                scannerEnter.nextLine();
                                break;
                            case 2:
                                System.out.print("Introduce el valor de N: ");//Introduce N
                                int N = scanner.nextInt();

                                int suma = 0; // declaro la variable

                                // declaro la variable e inicializar la variable del ciclo; la condicion; valor de i en cuanto va a incrementar
                                for (int i = 1; i <= N; i++)
                                    suma += i; // Sumar i a suma

                                System.out.println("La suma de los números del 1 al " + N + " es: " + suma);

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