package Bucles;

import java.util.Scanner;
/**
 * Escribe un programa que muestre tres columnas, el cuadrado y el cubo
 * de los 5 primeros números enteros a partir de uno que se introduce 
 * por teclado.
 * Ejercicio11
 * @author Andrea
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        //Creo la clase Scanner
        Scanner datos= new Scanner(System.in);

        //Declaro las variables
        double numeroLeido;
        int numeroPedido=0;
        int numeroSiguiente=0;
        int cuadrado;
        int cubo;
        boolean validarEntrada= false;
        
        do {
            //Petición de datos
            System.out.printf("\nIntroduce un número entero para sacar el cuadrado y cubo de sus siguientes cinco primeros: ");
            numeroLeido=datos.nextDouble();

            if (numeroLeido<0) {
                System.out.println("Tienes que introducir un número positivo");
            } else if(numeroLeido%1 !=0){
                System.out.println("No puedes colocar decimales.");            
            }else{
                validarEntrada =true;
                numeroPedido=(int)numeroLeido;
                
            }
        } while (!validarEntrada);

        
        for(int vueltas =0;vueltas<5;vueltas++ ){ //controlamos las vueltas que dará el bucle 

            //se suma el número pedido + la vuelta que da porque, si hacemos la suma del numeroPedido + 1 siempre dará el mismo resultado
            numeroSiguiente= numeroPedido+vueltas;
            
            //operaciones: cubo y cuadrado
            cuadrado= numeroSiguiente*numeroSiguiente;
            cubo = numeroSiguiente*numeroSiguiente*numeroSiguiente;
            System.out.println("-------------------------------------------------------");
            System.out.printf("Número: %-5d | Cuadrado: %-5d | Cubo: %-5d\n" , numeroSiguiente,cuadrado,cubo);
        }
        datos.close();
    }
}
