package Bucles;
/**
 * Muestra los números del 320 al 160, contando 20 en 20 utilizando un bucle do-while
 * Ejercicio06
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        //declaro variable
        int i=360;

        do {
            System.out.println(i);
            i-=20;
        } while (i>=160);
    }
}
