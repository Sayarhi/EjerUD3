package EjerciciosExtras;

import java.util.Scanner;

public class Abecedario {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.println("=== GENERADOR DE TODO EL ABECEDARIO EN CONSOLA ===");
        System.out.print("Introduce una letra mayúscula (A-Z): ");
        char letra = datos.next().toUpperCase().charAt(0);

        System.out.print("Introduce la altura (recomendado número impar, ej: 7): ");
        int altura = datos.nextInt();
        
        // Calculamos el centro exacto de la matriz
        int mitad = (altura / 2) + 1;

        // Recorremos la cuadrícula con 'i' (filas) y 'j' (columnas)
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                
                boolean pintar = false;

                // Evaluamos la condición matemática para cada letra del abecedario
                switch (letra) {
                    case 'A':
                        pintar = (j == 1 || j == altura || i == 1 || i == mitad);
                        break;
                    case 'B':
                        pintar = (j == 1 || (i == 1 && j < altura) || (i == mitad && j < altura) || (i == altura && j < altura) || (j == altura && ((i > 1 && i < mitad) || (i > mitad && i < altura))));
                        break;
                    case 'C':
                        pintar = (i == 1 || i == altura || j == 1);
                        break;
                    case 'D':
                        pintar = (j == 1 || (i == 1 && j < altura) || (i == altura && j < altura) || (j == altura && i > 1 && i < altura));
                        break;
                    case 'E':
                        pintar = (j == 1 || i == 1 || i == mitad || i == altura);
                        break;
                    case 'F':
                        pintar = (j == 1 || i == 1 || i == mitad);
                        break;
                    case 'G':
                        pintar = (j == 1 || i == 1 || i == altura || (j == altura && i >= mitad) || (i == mitad && j >= mitad));
                        break;
                    case 'H':
                        pintar = (j == 1 || j == altura || i == mitad);
                        break;
                    case 'I':
                        pintar = (i == 1 || i == altura || j == mitad);
                        break;
                    case 'J':
                        pintar = (j == mitad || i == 1 || (i == altura && j <= mitad) || (j == 1 && i >= mitad && i < altura));
                        break;
                    case 'K':
                        pintar = (j == 1 || j == altura - i + 1 || j == i);
                        break;
                    case 'L':
                        pintar = (j == 1 || i == altura);
                        break;
                    case 'M':
                        pintar = (j == 1 || j == altura || (i == j && i <= mitad) || (i + j == altura + 1 && i <= mitad));
                        break;
                    case 'N':
                        pintar = (j == 1 || j == altura || i == j);
                        break;
                    case 'O':
                        pintar = (i == 1 || i == altura || j == 1 || j == altura);
                        break;
                    case 'P':
                        pintar = (j == 1 || i == 1 || i == mitad || (j == altura && i > 1 && i < mitad));
                        break;
                    case 'Q':
                        pintar = ((i == 1 && j > 1 && j < altura) || (i == altura && j > 1 && j < altura) || (j == 1 && i > 1 && i < altura) || (j == altura && i > 1 && i < altura) || (i == j && i >= mitad));
                        break;
                    case 'R':
                        pintar = (j == 1 || i == 1 || i == mitad || (j == altura && i > 1 && i < mitad) || (i == j && i >= mitad));
                        break;
                    case 'S':
                        pintar = (i == 1 || i == mitad || i == altura || (j == 1 && i > 1 && i < mitad) || (j == altura && i > mitad && i < altura));
                        break;
                    case 'T':
                        pintar = (i == 1 || j == mitad);
                        break;
                    case 'U':
                        pintar = (j == 1 || j == altura || i == altura);
                        break;
                    case 'V':
                        pintar = (j == 1 && i <= mitad || j == altura && i <= mitad || (i == j && i >= mitad) || (i + j == altura + 1 && i >= mitad));
                        break;
                    case 'W':
                        pintar = (j == 1 || j == altura || (i == j && i >= mitad) || (i + j == altura + 1 && i >= mitad));
                        break;
                    case 'X':
                        pintar = (j == i || j == altura - i + 1);
                        break;
                    case 'Y':
                        pintar = ((j == i || j == altura - i + 1) && i <= mitad) || (j == mitad && i >= mitad);
                        break;
                    case 'Z':
                        pintar = (i == 1 || i == altura || j == altura - i + 1);
                        break;
                    default:
                        System.out.println("Letra no encontrada en el sistema.");
                        break;
                }

                // Imprimimos el asterisco si se cumple la condición, o espacio vacío si no
                if (pintar) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Salto de línea por cada fila completada
        }
        
        datos.close();
    }
}
