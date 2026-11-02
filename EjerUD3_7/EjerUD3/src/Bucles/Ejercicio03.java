package Bucles;
/**
 * Muestra los números múltiplos de 5 de 0-100 utilizando un bucle do-while
 * Ejercicio03
 * 
 * @author Andrea
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        //Variables
        int i = 0;

        do {
            System.out.println(i);
            i+=5;
        } while (i<=100);
    }
}
