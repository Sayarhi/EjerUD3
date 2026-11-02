package Condicional;

import java.util.Scanner;
/**
 * Realiza un programa que resuelva una ecuación de segundo grado
 * ax^2+bx-c=0
 * Ejer9
 */
public class Ejer9 {
    public static void main(String[] args) {
        //Creamos el nuevo Scanner
        Scanner datos=new Scanner(System.in);

        //Variables
        double a;
        double b;
        double c;
        double x1;
        double x2;
        double discriminante; //Discriminte es la solución de la formula de la parte de dentro de la raíz cuadrada
        double dividendo1;
        double dividendo2;

        //Petición de los datos
        System.out.printf("\nVamos a realizar un Ecuación de Segundo Grado.");
        System.out.printf("\nDime el valor de a: ");
        a=datos.nextDouble();
        System.out.printf("\nDime el valor de b: ");
        b=datos.nextDouble();
        System.out.printf("\nDime el valor de c: ");
        c=datos.nextDouble();

        

        //Resultado
        if (a==0) {
            System.out.println("Error. No se puede dividir entre 0.Se vuelve cuación de primer grado");
        } else {
            
            /**
             * 
             */
            discriminante=(b*b)-(4*a*c);


            if (discriminante <0 ) {
                System.out.println("Error. No puede tener solución porque no se puede dividir entre 0");

            } else {

                //Saco dos dividendos diferente por el +- de la formula
                dividendo1=(-b+Math.sqrt(discriminante));
                dividendo2=(-b-Math.sqrt(discriminante));

                /**
                 * Variables
                 * x1 y x2
                 */
                x1= dividendo1/(2*a);
                x2= dividendo2/(2*a);
                
                System.out.printf("\nLas soluciones son: ");
                System.out.printf("\nx1= "+x1);
                System.out.printf("\nx2= "+x2);
            }

            datos.close();
        }
        
       

    }
}
