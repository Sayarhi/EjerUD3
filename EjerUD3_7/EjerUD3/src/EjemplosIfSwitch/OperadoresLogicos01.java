package EjemplosIfSwitch;

import java.util.Scanner;

public class OperadoresLogicos01 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        //Variables
        int num;

        System.out.println("Adivina el número que estoy pensando: ");
        System.out.println("Tiene que ser un número del 1 al 100");
        num=teclado.nextInt();
        
        if((num < 1)||(num > 100)){
            System.out.println("Tiene que ser entre el 1 y el 100");
            System.out.println("Tienes otra opstunidad: ");
            num = teclado.nextInt();

        }

        if(num == 67){
            System.out.println("Lo adivinaste!");
        }else{
            System.out.println("No lo has adivinado, sorry");
        }
        
        teclado.close();
    }
}
