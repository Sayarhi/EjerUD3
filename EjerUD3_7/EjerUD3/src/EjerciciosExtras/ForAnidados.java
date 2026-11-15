package EjerciciosExtras;
/**
 * Por cada vuelta que da el bucle de afuera, el bucle de dentro se ejecuta por completo de pprincipio a fin.
 * ForAnidados
 */
public class ForAnidados {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) { // Bucle externo (Filas)
            for (int j = 1; j <= 3; j++) { // Bucle interno (Columnas)
                System.out.print("i=" + i + ", j=" + j + " | ");
            }
            System.out.println(); // Salto de línea al terminar cada fila
         }
    }
}
