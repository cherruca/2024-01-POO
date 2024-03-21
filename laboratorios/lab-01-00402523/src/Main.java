//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    // se declaran 3 variables estaticas para poder usar en las funciones
    // los 2 numeros a operar y la instancia del Scanner
    private static float numero_uno;
    private static float numero_dos;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int menu_opcion;
        float resultado;

        do {
            // se despliega el menu y se solicita seleccionar una opcion
            System.out.println("===== CALCULADORA =====\n\r1) Sumar\n\r2) Restar\n\r3) Multiplicar\n\r4) Dividir\n\r5) SALIR\nIngrese una opcion: ");
            menu_opcion = sc.nextInt();

            if (menu_opcion == 1) {
                System.out.println("\t=== SUMA ===\n");
                pedir_numeros();
                resultado = sumar(numero_uno, numero_dos);

                System.out.println("\nEl resultado de la suma " + numero_uno + " + " + numero_dos + " es igual a: " + resultado);

            } else if (menu_opcion == 2) {
                System.out.println("\t=== RESTA ===\n");
                pedir_numeros();
                resultado = restar(numero_uno, numero_dos);

                System.out.println("\nEl resultado de la resta " + numero_uno + " - " + numero_dos + " es igual a: " + resultado);

            } else if (menu_opcion == 3) {
                System.out.println("\t=== MULTIPLICACION ===\n");
                pedir_numeros();
                resultado = multiplicar(numero_uno, numero_dos);

                System.out.println("\nEl resultado de la multiplicacion " + numero_uno + " * " + numero_dos + " es igual a: " + resultado);

            } else if (menu_opcion == 4) {
                System.out.println("\t=== DIVISION ===\n");
                pedir_numeros();

                // validar para que el divisor no sea 0
                if (numero_dos != 0) {
                    // si el divisor es diferente de 0, se procede con la division de forma normal
                    resultado = dividir(numero_uno, numero_dos);
                    System.out.println("\nEl resultado de la division " + numero_uno + " ÷ " + numero_dos + " es igual a: " + resultado);
                } else {
                    // si el divisor es 0, se despliega un mensaje de error para continuar con la ejecucion del programa
                    System.out.print("\t\tERROR: El divisor NO puede ser 0.\n");
                }

            } else if (menu_opcion == 5) {
                // opcion para salir del programa
                System.out.println("\tPrograma finalizado, adios.\n");
            } else {
                // mensaje por defecto si no se selecciona una opcion valida del menu
                System.out.println("\tPor favor seleccione una opcion del menu\n");
            }
        } while (menu_opcion != 5);
    }

    // funcion de suma
    public static float sumar(float primer_numero, float segundo_numero) {
        return primer_numero + segundo_numero;
    }

    // funcion de resta
    public static float restar(float primer_numero, float segundo_numero) {
        return primer_numero - segundo_numero;
    }

    // funcion de multiplicacion
    public static float multiplicar(float primer_numero, float segundo_numero) {
        return primer_numero * segundo_numero;
    }

    // funcion de division, solo se ejecuta cuando el divisor NO es 0
    public static float dividir(float primer_numero, float segundo_numero) {
        return primer_numero / segundo_numero;
    }

    // funcion para solicitar los numeros al usuario y almacenarlos en las variables estaticas
    public static void pedir_numeros() {
        System.out.print("\t\tIngrese el primer numero: ");
        numero_uno = sc.nextFloat();

        System.out.print("\t\tIngrese el segundo numero: ");
        numero_dos = sc.nextFloat();
    }
}

