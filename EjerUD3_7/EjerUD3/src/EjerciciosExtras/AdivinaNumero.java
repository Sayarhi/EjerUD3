package EjerciciosExtras;

import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Generar número secreto entre 1 y 10
        int numeroSecreto = (int) (Math.random() * 10) + 1; 
        int intento;

        System.out.println("=== JUEGO: ADIVINA EL NÚMERO ===");

        // Bucle do-while para repetir mientras falle
        do {
            System.out.print("Introduce un número del 1 al 10: ");
            intento = scanner.nextInt();

            if (intento != numeroSecreto) {
                System.out.println("¡Fallaste! Prueba otra vez.\n");
            }

        } while (intento != numeroSecreto);

        // 4. Si acierta, sale del bucle y felicita
        System.out.println("\n¡Enhorabuena, has ganado! El número era el " + numeroSecreto);
        
        scanner.close();
    }
}
