package EjemplosBucles;
/**
 * Bucle do-while que termina cuando se introduce por teclado un número impar
 * 
 * @author Andrea
 */
import java.util.Scanner;

public class TerminaCuandoEsImpar {
    public static void main(String[] args) {
        //creamos el Scanner
        Scanner datos = new Scanner(System.in);

        //Variables
        int num;

        do {
            System.out.println("\nDime un número: ");
            num=datos.nextInt();

            if(num%2 ==0){ //comprueba si el núermo introducido es par o no al dividirlo entr 2 y siempre que el resto de 0
                System.out.println("El número introducido es par. Que bonito es el: "+num);

            }else{
                System.out.println("El número introducido es impar. No me gusta el número: "+num);
            }

        } while (num % 2 ==0); //Al introducir un número impar , el programa salta a esta línea y termina el programa
                              //Si queremos que sea al revés y no pare hasta que coloquemos un par sería 
                              // while(num % 2 != 0);
        datos.close();
    }
}
