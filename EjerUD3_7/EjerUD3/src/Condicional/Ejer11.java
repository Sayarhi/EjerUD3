package Condicional;

import java.util.Scanner;
/**
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la media noche.
 * Ejer11
 * @author Andrea
 */
public class Ejer11 {
    public static void main(String[] args) {
        //Creo la clase Scanner
        Scanner datos= new Scanner(System.in);

        //Variables
        int hora;
        int minutos;
        int segundosTotalesEnUnDia=24*3600; //Necesitasmos el total de las horas para poder restar los segundos de la hora introducida con los de un día entero
        int segundosTranscurridos; //Esencial para realizar la resta de los seundos que pasan en un día con los transcurridos cuando el usuario coloca su hora
        int segundosFaltan;

        //Petición de datos

        System.out.println("Calculemos cuanto queda para llegar a media noche");
        System.out.printf("\nDime solamente la hora(0-23): ");//Pedimos que le hora máx sea 23 porque al llear a media noche lo calculamos como 00:00
        hora=datos.nextInt();

        System.out.printf("\nAhora dime los minutos(0-59): ");//Aquí hacemos lo mismo. Como el max es 60 mint, pedimos como tope hasta 59
        minutos= datos.nextInt();

        if ((hora>=0 && hora <=23) && (minutos>=0 && minutos<=59)) {
            /**
             * 1h=60 mint=3600 seg ----------------->(60mint*60seg = 3600 segundos en 1h) 
             * 1 mint= 60 seg
             */
            segundosTranscurridos=(hora*3600)+(minutos*60);
            segundosFaltan= segundosTotalesEnUnDia - segundosTranscurridos;

            System.out.println("Los segundos que faltan para la medianoche son: "+segundosFaltan + " segundos.");

        } else {
            System.out.println("Error. Esa hora no existe");
        }

        datos.close();
    }
}
