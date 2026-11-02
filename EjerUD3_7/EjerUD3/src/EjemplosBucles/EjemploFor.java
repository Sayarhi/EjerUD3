package EjemplosBucles;
/**
 * Bucle for
 * 
 * @author Andrea
 * EjemploFor
 */
public class EjemploFor {
    public static void main(String[] args) {
        //bucle for
        for(int i =1;i<11;i++){
            // int i=1 ----> inicializa el programa en 1
            // i<11 -------> el valor de i(1) se imprimirá hasta máx 10 ya que nos dice que i es menor que 11
            // i++ --------> incrementa el valor de i(1) hasta que se llegue al tope

            System.out.println(i);//imprime todos los números de i , incrementados a 1 más, hasta llegar a 10
        }

        System.out.println("_____________________________________\n");

        /**
         * Aquí hace lo mismo solo que, en vez de color el valor de i directamente, le añadimos
         * una operación cuyo resultado será el valor de i.
         * En este caso i=1+2; -----> esto hará que el bucle inicialice en 3 y no en 1.
         */
        for(int b =1+2;b<11;b++){
            System.out.println(b);
        }
    }
}
