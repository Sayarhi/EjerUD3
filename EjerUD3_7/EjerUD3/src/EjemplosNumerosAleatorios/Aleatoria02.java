package EjemplosNumerosAleatorios;

public class Aleatoria02 {
    public static void main(String[] args) {
        System.out.println("\n5 números aleatorios entre 0 y 7");
        System.out.println("Sin llegar a 10 (con decimales): \n");
        
        for(int i =1; i<=5;i++){
            System.out.println(Math.random()*7+" ");
        }
        System.out.println("----------------------------");
        for(int i =1; i<=5;i++){
            System.out.println((int)(Math.random()*7)+" ");
        }
    }
}
