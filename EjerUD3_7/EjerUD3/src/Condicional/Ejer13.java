package Condicional;

import java.util.Scanner;
/**
 * Escribe un programa que ordene los número introducidos de mayor a menor.
 * Ejer13
 */
public class Ejer13 {
    public static void main(String[] args) {
        //Creamos la clase Scanner
        Scanner datos= new Scanner(System.in);

        //Variables
        double a;
        double b;
        double c;
        
        //Petición de los números
        System.out.printf("\n----Orden de números------\n");
        System.out.println("Dime el primer número: ");
        a= datos.nextDouble();
        System.out.println("Dime le segundo: ");
        b=datos.nextDouble();
        System.out.println("Dime el último número: ");
        c=datos.nextDouble();

        if ((a>b)&&(b>c)) {
            System.out.println(a+","+b+","+c);
        }else if((a>c)&&(c>b)){
            System.out.println(a+","+c+","+b);
        }else if((b>a)&&(a>c)){
            System.out.println(b+","+a+","+c);
        }else if((b>c)&&(c>a)){
            System.out.println(b+","+c+","+a);
        }else if((c>a)&&(a>b)){
            System.out.println(c+","+a+","+b);
        }else{
            System.out.println(c+","+b+","+a);
        }

        datos.close();
    }
}
