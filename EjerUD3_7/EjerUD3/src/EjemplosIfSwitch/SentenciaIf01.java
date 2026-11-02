package EjemplosIfSwitch;

import java.util.Scanner;

/**ta
 * Ejemplo 2 Sentencia If 01
 * Si el usuario escribe la respuesta correcta nos saltará al sout de el "if"
 * si no , pasará directamente al else
 * Ejemplo2
 */
public class SentenciaIf01 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        //Variables
        String respuesta;
        System.out.println("¿Cuál es la capital de Kiribati?");
        respuesta = datos.nextLine();

        if(respuesta.equalsIgnoreCase("Tawara")){ // el .equalsIgnoreCase es para que el usuario, si pone minúsculas sirve igual la respuesta
            System.out.println("La respuesta es correcta");
        }else{
            System.out.println("No es correcto");
        }
        datos.close();
    }
}
