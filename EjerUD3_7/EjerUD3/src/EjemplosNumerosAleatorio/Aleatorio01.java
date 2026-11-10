package EjemplosNumerosAleatorio;
/**
 * El Math.random sirve para generar valores aleatorios. 
 * Esto genera un número con decimal de tipo double en el intervalo de (0-1)
 * Aleatorio01
 */
public class Aleatorio01 {
    public static void main(String[] args) {
        System.out.println("Diez números aleatorios: \n");

        for(int i = 1;i<11;i++){
            System.out.println(Math.random());
        }
    }
}
