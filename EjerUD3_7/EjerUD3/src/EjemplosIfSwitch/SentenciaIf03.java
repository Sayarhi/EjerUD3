package EjemplosIfSwitch;

import java.util.Scanner;

public interface SentenciaIf03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        double notas;

        System.out.println("¿Qué nota has sacado en el último examen?");
        notas=sc.nextDouble();

        if(notas>=5){
            System.out.println("\nHas aprobado!!\n");
        }else{
            System.out.println("\nLo siento, has suspendido\n");
        }

        sc.close();
    }
}
