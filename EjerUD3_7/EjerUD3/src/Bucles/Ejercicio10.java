package Bucles;

import java.util.Scanner;
/**
 * Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado.
 * A priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de
 * introducir los datos cuando meta uno negativo
 * Ejercicio10
 * @author Andrea
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        //Creo la clase Scanner
        Scanner datos=new Scanner(System.in);

        //Declaro las variables
        long numeroPedido;
        long contador=0;//Inicializamos el contador a 0
        long suma=0;//Inicializamos la suma a 0

        double media;

        //Petición de datos
        System.out.println("Introduce los números que desees.");
        System.out.println("(Para finalizar coloca un número negativo)");
        

        do {
            numeroPedido = datos.nextLong();
            if (numeroPedido>=0) {
                suma += numeroPedido;
            contador++;
            }
        } while (numeroPedido>=0);

        media=(double)suma/contador;

        System.out.println("La suma de tus número introducidos son: "+suma);
        System.out.println("La media es: "+ media + " .Y has introducido "+ contador+ " números");

        datos.close();
    }
}
