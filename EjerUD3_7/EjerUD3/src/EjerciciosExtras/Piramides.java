package EjerciciosExtras;

import java.util.Scanner;

public class Piramides {
    public static void main(String[] args) {
        Scanner datos= new Scanner(System.in);

        //Variables
        int altura;
        int alturaRelleno;
        int alturaPiramide;

        //Triánulo rectánulo hueco
        System.out.print("Introduce la altura: ");
        altura=datos.nextInt();

        for(int fila=1;fila<=altura;fila++){
            for(int columnas =1;columnas<=altura;columnas++){
                if (columnas==1||columnas==fila||fila ==altura) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Triángulo rectánulo relleno
        System.out.print("\nDime la altura para el triánulo rellenarlo: ");
        alturaRelleno=datos.nextInt();

        for(int i=1;i<=alturaRelleno;i++){
            for(int j=1;j<=i;j++){
               System.out.print("*");
            }
            System.out.println();
        }

        //Pirámide Rellena
        System.out.println("\nvamos a dibujar la piramide.");
        System.out.print("Altura por favor: ");
        alturaPiramide = datos.nextInt();

        for(int filas = 1; filas <= alturaPiramide; filas++){
            // El ancho total debe llegar hasta (alturaPiramide * 2 - 1)
            for(int columna = 1; columna <= (alturaPiramide * 2) - 1; columna++){
                
                if (columna >= alturaPiramide - (filas - 1) && columna <= alturaPiramide + (filas - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

        //Pirámide hueca
        System.out.println("\nVamos a dibujar la pirámide hueca.");
        System.out.print("Altura por favor: ");
        int alturaPiramideHueca = datos.nextInt();

        for(int filas = 1; filas <= alturaPiramideHueca; filas++){
            for(int columna = 1; columna <= (alturaPiramideHueca * 2) - 1; columna++){
                
                // Si es el lado izquierdo, el lado derecho o la base completa de abajo
                if (columna == alturaPiramideHueca - (filas - 1) || columna == alturaPiramideHueca + (filas - 1) || filas == alturaPiramideHueca) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //pirámide invertida hueca
        
        System.out.println("\nVamos a dibujar la pirámide invertida hueca.");
        System.out.print("Introduce la altura para la pirámide invertida: ");
        int alturaPiramideInvertida = datos.nextInt();

        for(int filas = 1; filas <= alturaPiramideInvertida; filas++){
            for(int columna = 1; columna <= (alturaPiramideInvertida * 2) - 1; columna++){
                
                // Base arriba (fila 1), pared izquierda inclinada y pared derecha inclinada
                if (filas == 1 || columna == filas || columna == (alturaPiramideInvertida * 2) - filas) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

        System.out.println("\nVamos a dibujar el diamante hueco.");
        System.out.print("Introduce la altura para la mitad superior del diamante: ");
        int alturaDiamante = datos.nextInt();

        // --- MITAD SUPERIOR (Pirámide normal) ---
        for(int filas = 1; filas <= alturaDiamante; filas++){
            for(int columna = 1; columna <= (alturaDiamante * 2) - 1; columna++){
                // Pintamos los bordes inclinados de subida
                if (columna == alturaDiamante - (filas - 1) || columna == alturaDiamante + (filas - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // --- MITAD INFERIOR (Pirámide invertida de bajada) ---
        // Empezamos desde la fila 2 para no repetir la línea más ancha del centro
        for(int filas = 2; filas <= alturaDiamante; filas++){
            for(int columna = 1; columna <= (alturaDiamante * 2) - 1; columna++){
                // Pintamos los bordes inclinados de bajada
                if (columna == filas || columna == (alturaDiamante * 2) - filas) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 6. Pirámide dentro de otra (Pirámide anidada)
        System.out.println("\nVamos a dibujar una pirámide dentro de otra.");
        System.out.print("Introduce la altura para la pirámide exterior: ");
        int alturaExterior = datos.nextInt();

        for (int filas = 1; filas <= alturaExterior; filas++) {
            for (int columna = 1; columna <= (alturaExterior * 2) - 1; columna++) {
                
                // 1. CONDICIÓN DE LA PIRÁMIDE EXTERIOR (Grande)
                if (columna == alturaExterior - (filas - 1) || columna == alturaExterior + (filas - 1) || filas == alturaExterior) {
                    System.out.print("*");
                } 
                // 2. CONDICIÓN DE LA PIRÁMIDE INTERIOR (Pequeña, desplazada un par de filas hacia abajo para que quepa)
                // Hacemos que empiece a partir de la fila 3 y sea más estrecha
                else if (filas >= 3 && (columna == alturaExterior - (filas - 3) || columna == alturaExterior + (filas - 3) || filas == alturaExterior - 1)) {
                    System.out.print("@");
                } 
                // 3. EL RESTO ES ESPACIO VACÍO
                else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
