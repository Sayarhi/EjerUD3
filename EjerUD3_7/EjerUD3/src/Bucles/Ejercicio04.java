package Bucles;
/**
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
 * un bucle for.
 * Ejercicio04
 * 
 * @author Andrea
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        /**
         * 1) int i = 320 ---> Inicializamos con el número grando
         * 2) i>=160 ----> el tope será 160 
         */
        for(int i = 320; i>=160;i-=20){
            System.out.println(i);
        }
    }
}
