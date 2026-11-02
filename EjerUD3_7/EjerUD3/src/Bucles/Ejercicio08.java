package Bucles;

import java.util.Scanner;
/**
 * Muestra la tabla de multiplicar de un número introducido por teclado
 * Ejercicio08
 * @author Andrea
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        //creamos el Scanner
        Scanner datos=new Scanner(System.in);

        //Declaramos las variables
        int numeroPedido;
        int resultado;

        //Petición de datos
        System.out.println("\n     ------ TABLA DE MULTIPLICAR ------");
        System.out.println("Qué número quieres que te muestre su tabla de multiplicar?");
        numeroPedido=datos.nextInt();
        
        /**
         * Creo un bucle for para que se repita los números hasta llegar al 10
         *  - int multiplicar=1 ---> esto inicializa la tabla para que empiece por 1
         *  - multiplicar <=10  ---> Esto hace que el bucle se repita hasta que llegue al número 10
         *  - multiplicar++     ---> Aumenta en 1 el número inicializado 
         */
        for(int multiplicar=1;multiplicar<=10;multiplicar++){
            
            resultado=numeroPedido*multiplicar;
            System.out.println(numeroPedido +" * "+ multiplicar +" = "+ resultado); 
        }
        datos.close();
    }
}
