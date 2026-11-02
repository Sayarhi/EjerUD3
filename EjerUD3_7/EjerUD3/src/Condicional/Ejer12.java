package Condicional;

import java.util.Scanner;
/**
 * Realiza un minicuestionario con 10 preuntas tipo test
 * Cada pregunta acertada sumará un punto.El programa mostrará al final la calificación obtenida
 * 
 * Ejer12
 * @author Andrea
 */

public class Ejer12 {
    public static void main(String[] args) {
        //Creamos el Scanner 
        Scanner datos = new Scanner(System.in);

        //Variables
        String respuestas;
        int punto=0; //Este será el contador. Siempre será inicializado en 0 ya que Java no sabrá con qué num empezar a sumar si no está inicializado.
        

        //Petición de datos. Cuestionario
        System.out.printf("\n--------------------------------------\n");
        System.out.println("|             CUESTIONARIO           |");
        System.out.println("--------------------------------------");
        
        System.out.printf("\n1)¿Cómo se llama la capital de España?\n");
        respuestas=datos.nextLine();
        if (respuestas.equalsIgnoreCase("Madrid")) {
            System.out.println("\nRespuesta correcta!!");
            System.out.println("+1 punto");

            punto++;
        } else {
            System.out.println("Respuesta incorrecta");
            System.out.println("-1 punto");
            punto--;
        }

        System.out.printf("\n2)¿Cómo se llama la capital de Italia?\n");
        respuestas=datos.nextLine();
        if (respuestas.equalsIgnoreCase("Roma")) {
            System.out.println("\nRespuesta correcta!!");
            System.out.println("+1 punto");

            punto++;
        } else {
            System.out.println("Respuesta incorrecta");
            System.out.println("-1 punto");
            punto--;
        }

        System.out.printf("\n1)¿Cuál es el resultado de la suma de 3+3?\n");
        respuestas=datos.nextLine();
        if (respuestas.equals("6")|| respuestas.equalsIgnoreCase("seis")) {
            System.out.println("\nRespuesta correcta!!");
            System.out.println("+1 punto");

            punto++;
        } else {
            System.out.println("Respuesta incorrecta");
            System.out.println("-1 punto");
            punto--;
        }

        System.out.println("\nFin del cuestionario!!");
        System.out.println("Tus puntos son: "+punto);
        
        if(punto <0){
            System.out.println("Ya me debes puntos o tu alma Muajajajajaja");
        }

        datos.close();
    }
}
