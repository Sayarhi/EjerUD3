package EjerciciosExtras;

import java.util.Scanner;

public class EjercicioExt01 {
    public static void main(String[] args) {
        //Creamos el Scanner
        Scanner datos = new Scanner(System.in);

        //Variables
        double numeroIntroducido;
        int altura;
        int contador=0;
        boolean validacionEntrada=false;

        //Petición de datos
        System.out.println("\nImpresión de la letra Z\n");
        

        do {
            System.out.print("Dime la altura que sea <= 5 y siendo este número entero: ");
            numeroIntroducido = datos.nextDouble();

            if (numeroIntroducido%1 !=0) {
                System.out.println("Tienes que introducir un número entero. no sirve decimal");
            }else if(numeroIntroducido<5){
                System.out.println("El número introducido tiene que ser <= 5.");
            }else {
                validacionEntrada = true;
                altura=(int)(numeroIntroducido);

                for(int fila = 1; fila<=altura;fila++){ //filas
                    for(int columna=1; columna<=altura;columna++ ){
                        if (fila == 1 || fila == altura || columna+fila == altura+1) { //columnas
                            System.out.print("*");//verdadero
                            contador++;
                        } else {
                            System.out.print(" ");//si es falso
                        }
                    }
                    System.out.println();
                }
            }
        } while (!validacionEntrada);

        System.out.println("Hay "+contador+" asteriscos");
        datos.close();
    }
}
