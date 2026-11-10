package EjemplosNumerosAleatorio;
/**
 * Para que los número aleatorios puedan ser sin decimales es necesario hacer un casting 
 * de la variable querida, en este caso de int, donde se necesita poner el 
 * Math.random()*7 entre parentersis --> (int)(Math.random()*7)
 * 
 * Si no se coloca así , el sout no lo imprime y solo colocará 0
 * Aleatorio03
 */
public class Aleatorio03 {
    public static void main(String[] args) {
        System.out.println("20 números aaleatorios sin decimales entre 0 y 6");
        for(int i = 1;i<=20;i++){
            System.out.print((int)(Math.random()*7)+" ");
        }

        System.out.println();
    }
}
