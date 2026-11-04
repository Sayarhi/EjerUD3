package Bucles;

import java.util.Scanner;
/**
 * Realiza el control de acceso a una caja fuerte.
 * La convinación será un número de 4 cifras. El programa lo tiene que pedir
 * No aciertas ---> mensaje: "lo siento, esa no es la combinanción"
 * Si aciertas ---> mensaje: "La caja fuerte se ha abierto satisfactoriamente"
 * Tenemso 4 oportunidades.
 * Ejercicio07
 * @author Andrea
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        //Creación de Scanner
        Scanner datos=new Scanner(System.in);

        //Variables
        final int COMBINACIOCORRECTA= 9587;
        int combinacionPedida;

        //Petición de datos
        System.out.printf("\nVamos a abrir la caja fuerte");
        
        for(int intentos=1;intentos < 5;intentos++){
            System.out.printf("\nDime una combinación de 4 números: ");
            combinacionPedida=datos.nextInt();

            if (combinacionPedida == COMBINACIOCORRECTA) {
                System.out.println("Felicidades. La caja fuerte está abierta");
                break; //Esto para el programa si es que acierta el cdg
            } else {
                System.out.println("Los siento, esa no es la combinación");
                System.out.println("Inténtalo de nuevo");
            }
            System.out.println("--------------------------\n");
        }
        
        System.out.println("\nHas acabado todos los intentos");
        datos.close();
    }
}
