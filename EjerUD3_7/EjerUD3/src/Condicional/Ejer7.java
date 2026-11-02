package Condicional;

import java.util.Scanner;
/**
 * Realiza un programa que calcule la media de tres notas.
 * Ejer7
 */
public class Ejer7 {
    public static void main(String[] args) {
        //Creamos la clase Scanner
        Scanner datos=new Scanner(System.in);

        //variables
        double n1;
        double n2;
        double n3;
        double media;

        //Petición de datos
        System.out.printf("\n--------- CALCULO DE MEDIAS ----------\n");
        System.out.printf("Dime que has sacado en tu primera nota: ");
        n1= datos.nextDouble(); //petición de la primera nota

        System.out.printf("\nDime tu segunda nota: ");
        n2=datos.nextDouble(); //petición de la segunda nota

        System.out.printf("\nTu tercera nota: ");
        n3=datos.nextDouble();//petición de la tercera

        //formula para sacar las medias
        media=(n1+n2+n3)/3;

        //Usamos If/else para marcar los tipos de clasificación según su rango.
        if (media <5) {
            System.out.println("Tienes un insuficiente con un: "+media+" de media.");
        }else if((media>=5)&&(media<7)){
            System.out.println("Tienes un aprobado con un: "+media+" de media.");
        }else if ((media>=7)&&(media<9)) {
            System.out.println("Tienes un notable con un: "+media+" de media.");
        }else if ((media>=9)&&(media<=10)) {
            System.out.println("Tienes un sobresaliente con un: "+media+" de media.");
        }else{
            System.out.println("No puede existir esa media");
        }

        datos.close();
    }
}
