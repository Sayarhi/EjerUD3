package NumAleatorios;
/**
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa.
 * Esta baraja está dividida en cuantro palos: picas,corazones,diamantes y tréboles.
 * Cada palo está formado por 13 cartas, de as cuales 9 son numerales y 4 literales:
 *  2,3,4,5,6,7,8,9,10,J,Q,KyA(con valor 1). Para convertir un número en una cades de caracteres 
 * podemos usar String.valueOf(n)
 * Ejercicio02
 * @author Andrea
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.println("\n--- BARAJA FRANCESA ---\n");

        //variables
        int carta=(int)(Math.random()*4)+1;//Para el palo
        int baraja=(int)(Math.random()*13)+1;//Para la carta
        
        String nombreCarta =""; //Creamos una variable de tipo String para guardar el nombre de la carta
        
        if(baraja == 11){
            nombreCarta="J";
        } else if(baraja == 12){
            nombreCarta="Q";
        }else if(baraja == 13){
            nombreCarta="K";
        }else if(baraja == 1){
            nombreCarta="AS";
        }else{
            //Sirve para covertir el número entero a formato texto
           nombreCarta = String.valueOf(baraja);
        }
                

        switch (carta) {
            case 1:
                System.out.println(nombreCarta + " de tréboles\n");
                break;
            case 2:
                 System.out.println(nombreCarta + " de diamantes\n");
                break;
            case 3:
                 System.out.println(nombreCarta + " de corazones\n");
                break;
            case 4:
                 System.out.println(nombreCarta + " de picas\n");
                break;
            default:
                break;
        }
    
    }
}
