package EjemplosNumerosAleatorio;
/**
 * Al colocar Math.random()*10 no dará números(con decimales) pero hasta el 
 * 10 como máx sin tener que llegar a ello..
 * Aleatorio02
 */
public class Aleatorio02 {
    public static void main(String[] args) {
        System.out.println("20 números aleatorios entre 0 y 10");
        System.out.println(" sin llegar a 10 (con decimales):");

        for(int i =1;i<=20;i++){
            System.out.println(Math.random()*10+" ");
        }
    }
}
