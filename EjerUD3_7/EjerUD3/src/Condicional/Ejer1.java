package Condicional;

import java.util.Scanner;

/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qu;e 
 * asignatura toca a primera hora ese día.
 * Ejer1
 * @author Andrea Pasapera
 */
public class Ejer1 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        //Variables
        String dia;
        String asignatura;
        

        System.out.print("\nDime un día de la semana en número: ");
        dia=datos.nextLine();

        switch (dia) {
            case "lunes":
                asignatura ="\033[31mLenguajes de Marcas\033[39;49m";
                System.out.print("\nEl lunes tienes: "+ asignatura + " a primera hora.");
                break;
            case "martes":
                asignatura ="\033[32mBBDD\033[39;49m";
                System.out.print("\nEl martes tienes: "+ asignatura + " a primera hora.");
                break;
            case "miercoles":
                asignatura ="\033[37mNube\033[39;49m";
                System.out.print("\nEl miércoles tienes: "+ asignatura + " a primera hora.");
                break;
            case "jueves":
                asignatura ="\033[31mLenguajes de Marcas\033[39;49m";
                System.out.print("\nEl jueves tienes: "+ asignatura + " a primera hora.");
                break;
            case "viernes":
                asignatura ="\033[36mSistemas Informáticos\033[39;49m";
                System.out.print("\nEl viernes tienes: "+ asignatura + " a primera hora.");
                break;
            case "sabado":
                System.out.println("Es sábado. No tienes clase");
                break;
            case "domingo":
                System.out.println("Es domingo.No tienes clase.");
                break;
            default:
                System.out.println("No existe ese día");
        }

        datos.close();
    }
}
