package Bucles;

import java.util.Scanner;
/**
 * Escribe un programa que muestre los n primeros terminos de la serie Fibonacci.
 * fn=fn-1+fn-2
 * Ejercicio12
 * @author Andrea 
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        //Creo el Scanner para la petición de datos
        Scanner datos = new Scanner(System.in);

        //Declaro las variable
        boolean validacionEntrada = false;
        double numeroIntroducido;
        int numeroPedido =0;//Lo incializo
        int fibonacci;
        int antiguo=0;
        int nuevo;

        //Bucle para la petición de datos si necesitamos un número entero
        do {
            
            //Petición de datos
            System.out.printf("%24s\n" ,"--------------------");
            System.out.printf("%21s\n" ,"SERIE FIBONACCI");
            System.out.printf("%24s\n" ,"--------------------");
            System.out.printf("\nIntroduce un número: ");
            numeroIntroducido=datos.nextDouble();

            if (numeroIntroducido<0) {
                System.out.println("No pueden ser números negativos");
            } else if (numeroIntroducido%1 !=0)  {
                System.out.println("No se pueden introducir números decimales");
            }else{
                validacionEntrada=true;
                numeroPedido=(int)numeroIntroducido;
            }
        } while (!validacionEntrada);
        
        //El número nuevo será el antiugo + 1 para que , al inicializarlo nos de el siguiente número
        nuevo=antiguo+1;
        //bucle for calcular las vueltas que tiene que dar según el número introducido
        for(int vuelta=0; vuelta<numeroPedido;vuelta++){
            System.out.println(antiguo);//par empezar a imprimir el primer número con el que inicializamos y los que serán antiguo
            
            fibonacci=antiguo+nuevo;
            
            //Hacemos "auxiliares" las variables por los cambios en los que tenemos de números nuevos y viejos
            antiguo=nuevo;
            nuevo=fibonacci;
        }
        datos.close();
    }
}
