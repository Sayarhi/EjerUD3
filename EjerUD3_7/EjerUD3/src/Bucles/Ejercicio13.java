package Bucles;

import java.util.Scanner;
/**
 * Escribe un programa que lea una lista de diez números y determine 
 * cuántos son positios y negativos.
 * Ejercicio13
 * @author Andrea
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        //Creo el Scanner
        Scanner datos = new Scanner(System.in);

        //Declaro las variables
        int negativos=0;
        int positios=0;

        int numeroPedido=0;
        double numeroIntroducido;
        boolean validacionEntrada=false;


        //bucle para la validación de entrada
        System.out.println("\nIntroduce diez números tanto positivos como negativos");
        

        for(int vuelta=0;vuelta<10;vuelta++){

            validacionEntrada=false;
            do {
                System.out.printf("Numero %-1d :", (vuelta+1));
                numeroIntroducido=datos.nextDouble();

                if (numeroIntroducido%1 !=0) {
                    System.out.println("No puedes introducir números decimales");
                } else {
                    validacionEntrada=true;
                    numeroPedido=(int)numeroIntroducido;
                }

            } while (!validacionEntrada);

            if (numeroPedido<0) {
                negativos++;
            } else {
                positios++;
            }
        }

        System.out.println("\nTus número introducidos tienes:");
        System.out.println("Negativos: "+negativos);
        System.out.println("Positivos: "+positios);

        datos.close();
    }
}
