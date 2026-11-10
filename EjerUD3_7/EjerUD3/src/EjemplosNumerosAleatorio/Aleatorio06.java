package EjemplosNumerosAleatorio;

public class Aleatorio06 {
    public static void main(String[] args) {
        System.out.println("Genera al azar piedra, papel o tijera: ");

        //Genera un número al azar entre 0 y 2 ambos incluidos
        int mano=(int)(Math.random()*3);

        switch (mano) {
            case 0:
                System.out.println("piedra");
                break;
            
            case 1:
                System.out.println("papel");
                break;
            
            case 2:
                System.out.println("tijera");
                break;

            default:
                break;
        }
    }
}
