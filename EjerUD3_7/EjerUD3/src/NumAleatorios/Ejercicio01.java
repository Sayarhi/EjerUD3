package NumAleatorios;
/**
 * Escribe un programa que muestre la tirada de tres dados.
 * Se debe mostrar también la suma total(los puntos suman entre los tres dados) 
 * Ejercicio01
 * @author
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        System.out.println("Tira los dados");

        //variables
        int puntos=0;

        for(int i=1; i<=3;i++){
            //Esto sirve para que en cada tirada salga un número aleatorio
            int dado=(int)(Math.random()*6)+1;
            System.out.println(dado);   
            puntos+=dado;//Guardamos los puntos y se suman
        }
        System.out.println("Tus puntos en total es: "+ puntos );
    }
}
