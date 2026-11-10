package EjemplosNumerosAleatorio;
/**
 * Para que no se nos imprima directamente el 0 podemos colocar en la ecuación del Math.random un +1
 * Así el número generado dará un "salto" sumando 1 y nunca dará 0
 * Aleatorio04
 */
public class Aleatorio04 {
    public static void main(String[] args) {
        System.out.println("20 números aleatorios entre 1 y 10(sin decimales):");

        for(int i = 1;i<=20;i++){
            System.out.print((int)(Math.random()*10+1)+ " ");
        }
    }
}
