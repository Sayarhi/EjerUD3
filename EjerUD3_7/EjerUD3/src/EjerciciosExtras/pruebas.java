package EjerciciosExtras;

public class pruebas {
    public static void main(String[] args) {
        int altura = 6;
        
        for(int fila =1;fila<=altura;fila++){
            for(int columna=1;columna<=altura;columna++){
                if (fila == 1 || fila == altura || fila+columna == altura+1) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
