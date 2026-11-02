package EjemplosIfSwitch;

import java.util.Scanner;

public class SentenciaIf02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Variables
        int numero;

        System.out.println("Introduce un numero: ");
        numero=sc.nextInt();

        if(numero<0){
            System.out.println("El número introducido es negativo\n");
        }else{
            System.out.println("El número es positivo\n");
        }
        sc.close();
    }
}
