package Condicional;

import java.util.Scanner;
/**
 * Realiza un programa que calcyule el tiempo que tardará en caer un objeto desde 
 * una altura h. Aplica la fórmula siengo g=9.81m/s²
 * Ejer6
 */
public class Ejer6 {
    public static void main(String[] args) {
        //Scanner
        Scanner datos = new Scanner(System.in);

        //Variables
        double h;
        final double g= 9.81;
        double t=0;

        //Petición de datos
        System.out.printf("\nDime tu altura: ");
        h= datos.nextDouble();

        //Fórmula
        if (h<=0) {
            System.out.println("La altura no puede ser negativa");
        } else {
            t=Math.sqrt((2*h)/g);
            System.out.println("El tiempo que tardaría es: "+t);
        }
        
        datos.close();
    }
}
