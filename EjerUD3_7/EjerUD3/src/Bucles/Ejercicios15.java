package Bucles;

import java.util.Scanner;
/**
 * Escribe un programa que dado dos números, uno real(base) y uno entero positivo(exponente),saque por pantalla todas
 * las potencias con base el número dado y exponentes entre uno y el exponente intrducido. No se deben utilizar funciones
 * de exponenciación. Por ejemplo, sin introducimos el 2 y el 5
 *  2^1 2^2 2^3 2^4 y 2^5
 * Ejercicios15
 * @author Andrea
 */
public class Ejercicios15 {
    public static void main(String[] args) {
        //Creo el Scanner
        Scanner datos = new Scanner(System.in);

        //declaro las variables
        double base;
        double exponente;
        int exponenteEntero=0;
        double potencia =1;
        boolean validacionEntrada=false;

        //Bucle de la validación de datos
        do {
            System.out.println("\nIntroduce una base: ");
            base= datos.nextDouble();
            if (base <=0) {
                System.out.println("No puedes meter una base negativa. Tiene que ser mayor que cero");
            }else{
                validacionEntrada=true;
            }
        } while (!validacionEntrada);
        
        //validación de entrada para el exponente
        do {
            validacionEntrada=false;
            System.out.println("\nIntroduce el exponente");
            exponente=datos.nextInt();

            if (exponente<=0) {
                System.out.println("Tiene que ser mayor a 0, no puede ser negativo");
            } else if(exponente%1 !=0){
                System.out.println("No puede ser un número decimal");
            }else{
                validacionEntrada=true;
                exponenteEntero=(int)exponente;
            }
        } while (!validacionEntrada);

        System.out.println("La base es: "+base);
        System.out.println("El exponente es: "+exponente);
    }
}
