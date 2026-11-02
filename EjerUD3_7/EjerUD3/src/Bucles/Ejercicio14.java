package Bucles;

import java.util.Scanner;
/**
 * Escribe un programa que pida una base y un exponente(entero positivo) 
 * y que calcule la potencia
 * Ejercicio14
 * @author Andrea
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        //Creo la clase Scanner
        Scanner datos = new Scanner(System.in);

        //Declaro las variables
        double base;
        double exponente;
        int exponenteEntero =0;
        double potencia=1;
        

        boolean validacionEntrada=false;


        //Bucle de la validación de entrada para la base, puede poner decimales
        do {
            System.out.println("\nIntroduce una base: "); 
            base=datos.nextDouble();

            if (base<0) {
                System.out.println("Tiene que ser un número positivo\n");
            } else {
                validacionEntrada = true;
            }
        } while (!validacionEntrada);

        /**
         * Bucle para la validación de entrada del exponente
         * - No pueden colocar números negativos
         * - No pueden usar decimales ya que piden número entero
         */
        do {
            validacionEntrada=false;
            System.out.println("\nIntroduce un exponente: ");
            exponente=datos.nextDouble();
            if (exponente<0) {
                System.out.println("Tiene que ser un número positivo\n");
            } else if (exponente%1 !=0) {
                System.out.println("Tiene que ser un número entero\n");
            }else{
                validacionEntrada=true;
                exponenteEntero=(int)exponente;
            }
        } while (!validacionEntrada);

        //Creo un bucle for para que de las vueltas que el usuario ponga como exponente
        for(int n = 0; n<exponenteEntero;n++){
            potencia*=base; //Esto sorve para que se multiplique por el mismo número hasta que acabe el bucle
        }
        System.out.println("--------------------------");
        System.out.println("\nLa potencia es "+(int)potencia);
        datos.close();
    }
}
