package Condicional;

import java.util.Scanner;
/**
 * ENUNCIADO:
 * Realiza un programa que resuelva una ecuación de primer grado(del tipo ax+b=0)
 * Ejer5
 * //////////////////////////////////////
 * PASOS:
 * 1-
 * 2-
 * 3-
 * 4-
 * ////////////////////////////////////
 * @author Andrea
 */
public class Ejer5 {
    public static void main(String[] args) {
        //Creamos el scanner
        Scanner datos=new Scanner(System.in);

        //Variables
        double a;
        double x;
        double b;

        //Petición de datos
        System.out.printf("\nEste programa resuelve ecuaciones de primer grado del tipo ax + b = 0\n");
        System.out.printf("\nPor favor, introduzca el valor de a: ");
        a=datos.nextDouble();
        System.out.printf("\nAhora introduzca el valor de b: ");
        b=datos.nextDouble();

        //Operación
        if (a!=0) {
            //formula ax+b+0
            x=-b/a;
            System.out.println("La solución de x es: "+ x);
        }else if (b==0) {
            System.out.println("Tiene varias soluciones");
        }else {
            System.out.println("Esta ecuación no tiene solución real.");
        }

        datos.close();
    }
}
