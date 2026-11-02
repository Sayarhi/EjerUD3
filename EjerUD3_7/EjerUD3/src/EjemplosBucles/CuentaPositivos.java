package EjemplosBucles;

import java.util.Scanner;

/**
 * Bucle while que termina cuando introduce por teclado un número negativos
 * 
 * @author Andrea
 * 
 * CuentaPositivos
 */
public class CuentaPositivos {
    public static void main(String[] args) {
        //Creamos el Scanner
        Scanner teclado = new Scanner(System.in);

        //declaro las variables inicializándolas
        int numeroIntroducido =0;
        int cuentaNumeros =0;
        int suma =0;

        //Petición de datos
        System.out.println("\nPor favor, introduce números y pulsando INTRO(número enteros).");
        System.out.println("Para terminar, introduce un número negativo.");
        //numeroIntroducido = teclado.nextInt(); ---> Esto no lo colocamos debajo de la petición de datos porque no sabe que hacer al momento de dar un número negativo ya que no le han puesto una restricción específico

        while (numeroIntroducido >=0) {
            numeroIntroducido = teclado.nextInt(); //Lo colocamos dentro del while para que , al detectar un número negativo, pare el programa
            cuentaNumeros ++; //Incrementa en 1 la variable
            suma += numeroIntroducido; //Equivale a suma = suma+NumeroIntroducido
        }

        System.out.println("Has introducido "+(cuentaNumeros-1)+" números positivos.");
        System.out.println("La suma total de ellos es "+(suma-numeroIntroducido));

        teclado.close();
    }
}
