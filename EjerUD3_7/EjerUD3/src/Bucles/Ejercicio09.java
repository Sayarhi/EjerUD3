package Bucles;

import java.util.Scanner;
/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado
 * La única limitación en el número de dígitos la establece el tipo de dato que se use(long o long)
 * Ejercicio09
 * @author Andrea
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        //Creo un Scanner
        Scanner datos=new Scanner(System.in);

        //Varibles
        long numeroPedido;
        long cuenta=0;
        long aux;

        //Petición de datos
        System.out.printf("\nIntroduce un número para contar cuantos dígitos tiene: ");
        numeroPedido=datos.nextLong();

        aux =Math.abs(numeroPedido); //Para que guarde el número en el auxiliar y lo convertimos en positivo ese número si es que introducen un número negativo

        do {
            cuenta ++;//Incrementa el contador por cada dígito
            /**
             * Para que se pueda ir contando los dígitos de un número hacemos que el auxiliar vaya descontando
             * el último digito por cada vuelta que da hasta que el resultado de la división de 0 y ya no pueda
             * quitar más. 
             */
            aux /=10;
        } while (aux >0);

        System.out.println("El número "+numeroPedido+" tiene "+cuenta+" números");
        datos.close();
    }
}
