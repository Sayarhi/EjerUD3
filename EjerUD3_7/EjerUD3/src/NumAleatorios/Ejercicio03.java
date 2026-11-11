package NumAleatorios;
/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2,3,4,5,6,7,sota,caballo,rey y as
 * Ejercicio03
 * @author Andrea
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        System.out.println("\n--- BARAJA ESPAÑOLA ---\n");

        int carta=(int)(Math.random()*10)+1;
        int baraja=(int)(Math.random()*4)+1;

        String nombreCarta = "";

        if (carta == 8) {
            nombreCarta = "Sota";
        } else if(carta == 9) {
            nombreCarta = "Caballo";
        }else if(carta == 10){
            nombreCarta = "Rey";
        }else if(carta == 1){
            nombreCarta = "As";
        }else{ 
            nombreCarta = String.valueOf(carta);
        }

        switch (baraja) {
            case 1:
                System.out.println(nombreCarta + " de Oros");
                break;
            case 2:
                System.out.println(nombreCarta + " de Copas");
                break;
            case 3:
                System.out.println(nombreCarta + " de Espadas");
                break;
            case 4:
                System.out.println(nombreCarta + " de Bastos");
            default:
                break;
        }    
    }
}
