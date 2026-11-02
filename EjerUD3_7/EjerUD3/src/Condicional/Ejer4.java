package Condicional;

import java.util.Scanner;
/**
 * ENUNCIADO:
 * Programa que calcula el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias 
 * (40 primeras horas) se pagan 12 euros la hora. A partir de 41 son 16h x hora
 * Ejer4
 * /////////////////////////////////////////
 * PASOS:
 * 
 * /////////////////////
 * @author Andrea
 */
public class Ejer4 {
    public static void main(String[] args) {
        //Clase Scanner
        Scanner datos = new Scanner(System.in);

        //Variables
        double horasTrabajadas;
        final int eurosPrimerasHoras = 12;// 40 horas es una constante ---> 40h=12euros
        final int eurosSegundasHoras = 16;
        double horasExtras;//41h es una constante ----> 41h=16euros
        double sueldoSemanal=0;
        double horasTrabajadasMensual;

        //Petición de datos
        System.out.printf("\nPor favor, introduce el número de horas trabajadas durante la semana: ");
        horasTrabajadas=datos.nextDouble();

        if ((horasTrabajadas <= 40)) {

            sueldoSemanal= horasTrabajadas*eurosPrimerasHoras;
            System.out.println("Tu sueldo semanal sería: "+sueldoSemanal+ " euros.");

        } else {
            horasExtras=horasTrabajadas-40;
            sueldoSemanal=(horasExtras*eurosSegundasHoras)+(40*eurosPrimerasHoras);
            System.out.println("Tu sueldo semanal es: "+sueldoSemanal+" euros.");
        }

        horasTrabajadasMensual = sueldoSemanal*4;
        System.out.println("Mensualmente es: "+horasTrabajadasMensual+" euros.");

        datos.close();
    }
}
