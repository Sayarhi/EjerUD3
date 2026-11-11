package NumAleatorios;
/**
 * Muestra 20 números enteris aleatorios entre 0 y 10 (ambos incluidos) separados por espacios
 * Ejercicio04
 * @author Andrea
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        System.out.println("\nNúmeros aleatorios\n");
        

        for(int i = 1; i<=20;i++){
            int numero = (int)(Math.random()*11);
            System.out.print(numero + " ");
        }
    }
}
