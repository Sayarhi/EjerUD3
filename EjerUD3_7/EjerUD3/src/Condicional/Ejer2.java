package Condicional;

import java.util.Scanner;
/**
 * ENUNCIADO:
 * Realiza un programa que pida una hora por teclado y que muestre:
 * - Buenos días
 * - Buenas tarde
 * - Buenas noche
 * Según la hora. Se utilizará los tramos de :
 *  6am-12pm
 *  13pm-20pm
 *  21pm-5am
 * SOLO SE TIENE EN CUENTA LAS HORAS, NO SE DEBE INTRODUCIR MINUTOS POR TECLADO.
 * 
 * ////////////////////////////////////////////////////////////////////////////
 * @author Andrea
 */
public class Ejer2 {
    public static void main(String[] args) {
        //Creamos el Scanner
        Scanner datos = new Scanner(System.in);

        //variables
        int horas;
        String mensaje;

        System.out.print("\nDime una hora sin los minutos: ");
        horas=datos.nextInt();

        if ((horas>=6)&&(horas <=12)) {
            mensaje="Buenos días";
            System.out.println(mensaje);

        } else if((horas>=13)&&(horas <=20)){
            mensaje="Buenas tardes";
            System.out.println(mensaje);

            }else if((horas >= 21 && horas <= 23) || (horas >= 0 && horas <= 5)){
                mensaje="Buenas noches";
                System.out.println(mensaje);

                }else {
                  System.out.println("Esa hora no existe");  
                }

        datos.close();
    }
}
