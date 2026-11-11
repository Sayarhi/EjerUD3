package NumAleatorios;
/**
 * Muestra 50 números enteros aleatorios entre 100 y 199(ambos incluidos) separado por espacios.
 * Muestra  también el max y mini y la media de esos números
 * Ejercicio05
 * @author Andrea
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        System.out.println("\n --- Numeros aleatorios ---\n");
        
        int max;
        int mini;
        int media;

        for(int i =1;i<=50;i++){
            int numero=(int)(Math.random()*199)+1;
            if((numero>=100 && numero <=199)){
                System.out.print(i+" "+numero);
            }
        }
        //max=
       // media=(max+mini)/3;
        //System.out.println("El número máx es: "+ max);
        //System.out.println("El número mínimo es: "+ mini);
//System.out.println("La media de ambos es: "+media);
    }
}
