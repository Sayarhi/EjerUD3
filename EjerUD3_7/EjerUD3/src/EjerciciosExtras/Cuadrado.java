package EjerciciosExtras;

import java.util.Scanner;
/**
 * cuadrado sin relleno 
 * Silo quisiera con relleno no sería necesario que hiciera una condición if/else, simplemente con un for aninado sirve
 * Cuadrado
 */
public class Cuadrado {
   public static void main(String[] args) {
        Scanner datos= new Scanner(System.in);

        //variables
        int altura;
        int alturaRelleno;
        int contador=0;
        int contador2=0;
        int suma;
        int media;

        System.out.print("Introdue una altura: ");
        altura=datos.nextInt();

        for(int fila = 1; fila <= altura;fila ++){
            for(int columnas =1;columnas <=altura; columnas++){
                if (fila==1||fila==altura||columnas==1||columnas == altura) {
                    System.out.print("X");
                    contador++;
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();//salto de linea
        }

        System.out.print("\nAhora dime una altura para el cuadrado relleno: ");
        alturaRelleno=datos.nextInt();

        for(int fi=1; fi<=alturaRelleno;fi++){
            for(int colm=1;colm<=alturaRelleno;colm++){
                System.out.print("@");
                contador2++;
            }
            System.out.println();
        }

        suma=contador+contador2;
        media=suma/2;

        System.out.println("\nLa suma de ambos es: "+suma);
        System.out.println("La media de ambas figuras es: "+media);

   }
}
