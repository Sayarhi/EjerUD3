package Condicional;

import java.util.Scanner;
/**
 * ENUNCIADO:
 * Escribe un programa en que dado un número del 1 al 7 escriba el correspondiente nombre 
 * del día de la semana
 * /////////////////////////////////////////////////////
 * PASOS:
 * 1-Creo el Scanner
 * 2-Declaro variables
 * 3-Pido los datos por pantalla
 * 4-Creo un Switch para colocar los días de la semana
 * 5-Mantengo la esstructura de control controlada
 * Ejer3
 * //////////////////////////////
 * @author Andrea
 */
public class Ejer3 {
    public static void main(String[] args) {
        //Creo la clase scanner
        Scanner datos= new Scanner(System.in);

        //Variables
        String dia;
        int numero;

        //Petición de datos
        System.out.printf("\nDime un día de la semana(1 al 7): ");
        numero=datos.nextInt();
        System.out.println("-----------------------------------------");

        switch (numero) {
            case 1:
                    dia="lunes";
                    System.out.println("El día "+numero+" es: "+dia);
                break;
            case 2:
                    dia="martes";
                    System.out.println("El día "+numero+" es: "+dia);
                break;
            case 3:
                    dia="miercoles";
                    System.out.println("El día "+numero+" es: "+dia);
                break;
            case 4:
                    dia="jueves";
                    System.out.println("El día "+numero+" es: "+dia);
                break;
            case 5:
                    dia="viernes";
                    System.out.println("El día "+numero+" es: "+dia);
                break;
            case 6:
                    dia="sabado";
                    System.out.println("El día "+numero+" es: "+dia);
                break;
            case 7:
                    dia="domingo";
                    System.out.println("El día "+numero+" es: "+dia);
                break;
            default:
                System.out.println("Tiene que ser un día entre el 1 al 7");
        }
        datos.close();
    }
}
