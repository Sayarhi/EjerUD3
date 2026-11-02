package EjemplosIfSwitch;

import java.util.Scanner;
/**
 * Si no coloco los break; al final de cada case , exceptuando el default,
 * pasa directamente a la última línea. En este caso a sout que hay en el default y termina la ejecución del programa
 * SentenciaSwitch
 */
public class SentenciaSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        int numero;
        String nombreMes;

        System.out.println("Porfa, introduce un número de mes: ");
        numero=sc.nextInt();

        switch (numero) {
            case 1:
                nombreMes="enero";
                break;
            case 2:
                nombreMes="febrero";
                break;
            case 3:
                nombreMes="marzo";
                break;
            case 4:
                nombreMes="abril";
                break;
            case 5:
                nombreMes="mayo";
                break;
            case 6:
                nombreMes="junio";
                break;
            case 7:
                nombreMes="julio";
                break;
            case 8:
                nombreMes="agosto";
                break;
            case 9:
                nombreMes="septiembre";
                break;
            case 10:
                nombreMes="octubre";
                break;
            case 11:
                nombreMes="noviembre";
                break;
            case 12:
                nombreMes="diciembre";
                break;
            default:
                nombreMes ="no existe ese mes";
                
        }

        System.out.println("Mes "+ numero + ": "+ nombreMes);
        sc.close();
    }
}
