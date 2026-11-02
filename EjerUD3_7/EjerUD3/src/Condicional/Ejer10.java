package Condicional;

import java.util.Scanner;
/**
 * Escribeun documento quenos dia el horóscopo a partir del día y el mes de nacimiento
 * Ejer10
 * 
 * 1) Aries: 21 de marzo-19 de abril (3-4)
 * 2) Tauro: 20 de abril-20 de mayo(4-5)
 * 3) Géminis: 21 de mayo - 20 de junio(5-6)
 * 4) Cancer: 21 de junio - 22 de julio(6-7)
 * 5) Leo: 23 de julio - 22 de agosto (7-8)
 * 6) Virgo: 23 de agosto - 22 de septiembre(8-9)
 * 7) Libra: 23 de septiembre - 22 de octubre(9-10)
 * 8) Escorpio: 23 de octubre- 21 de noviembre(10-11)
 * 9) Sagitario: 22 de noviembre  21 de diciembre(11-12)
 * 10) Capricornio: 22 de diciembre - 19 de enero(12-1)
 * 11) Acuario: 20 de enero - 18 de febrero (1-2)
 * 12) Piscis: 19 de febrero - 20 de marzo(2-3)
 * @author Andrea
 */
public class Ejer10 {
    public static void main(String[] args) {
        //Creo la clase Scanner
        Scanner datos=new Scanner(System.in);

        //Variables
        int dia;
        int mes;
        String horoscopo;

        //Petición de datos
        System.out.printf("\n------ HOROSCOPO --------\n");

        System.out.printf("\nDime tu mes de nacimiento((1-12): ");
        mes=datos.nextInt();

        System.out.printf("\nDime tu día de nacimiento: ");
        dia=datos.nextInt();

        if ((mes == 3 && dia >=21 && dia <=31)||(mes==4 && dia>=1 && dia <=19)) { 
            /**
             * Hacemos este modo de condición para que controlemos el rango de días de cada mes
             * Y con ello colocar de que mes a que mes y de qué día a que día
             */

            //1) Aries: 21 de marzo-19 de abril (3-4)
            horoscopo="Aries";
            System.out.println("Eres "+ horoscopo);
            
        } else if ((mes==4 && dia >=20 && dia <=30) || (mes == 5 && dia >=1 && dia <=20)) {
            //2) Tauro: 20 de abril-20 de mayo(4-5)
            horoscopo="Tauro";
            System.out.println("Eres "+horoscopo);

        }else if ((mes == 5 &&  dia >= 21 && dia <=31) || (mes == 6 && dia >=1 && dia <=20)) {
            //3) Géminis: 21 de mayo - 20 de junio(5-6)
            horoscopo = "Geminis";
            System.out.println("Eres "+horoscopo);

        } else if ((mes == 6 && dia>=21 && dia<=30) || (mes==7 && dia >=1 && dia<=22)) {
            //4) Cancer: 21 de junio - 22 de julio(6-7)
            horoscopo ="Cancer";
            System.out.println("Eres "+ horoscopo);

        } else if ((mes== 7 && dia >=23 && dia <= 31) || (mes == 8 && dia>=1 && dia<= 22 )) {
            //5) Leo: 23 de julio - 22 de agosto (7-8)
            horoscopo="Leo";
            System.out.println("Eres "+horoscopo);

        } else if ((mes == 8 && dia >= 23 && dia <= 30) || (mes == 9 && dia >=1 && dia <=22)) {
            //6) Virgo: 23 de agosto - 22 de septiembre(8-9)
            horoscopo="Virgo";
            System.out.println("Eres "+horoscopo);

        } else if ((mes == 9 && dia >= 23 && dia <= 31) || (mes == 10 && dia >=1 && dia <= 22)) {
            //7) Libra: 23 de septiembre - 22 de octubre(9-10)
            horoscopo="Libra";
            System.out.println("Eres "+ horoscopo);

        }else if ((mes == 10 && dia >=23 && dia <= 30) || (mes==11 && dia>=1 && dia <=21)) {
            //8) Escorpio: 23 de octubre- 21 de noviembre(10-11)
            horoscopo="Escorpio";
            System.out.println("Eres "+ horoscopo);

        }else if ((mes==11 && dia>=22 && dia <= 31) || (mes==12 && dia>=1 && dia<=21)) {
            //9) Sagitario: 22 de noviembre  21 de diciembre(11-12)
            horoscopo= "Sagitario";
            System.out.println("Eres "+horoscopo);

        }else if((mes == 12 && dia >= 22 && dia <=30) || (mes == 1 && dia >=1 && dia <= 19)){
            //10) Capricornio: 22 de diciembre - 19 de enero(12-1)
            horoscopo= "Capricornio";
            System.out.println("Eres "+horoscopo);

        }else if((mes==1 && dia >= 20 && dia <=31) || (mes == 2 && dia >= 1 && dia <= 18)){
            //11) Acuario: 20 de enero - 18 de febrero (1-2)
            horoscopo= "Acuario";
            System.out.println("Eres "+horoscopo);

        }else if((mes == 2 && dia>=19 && dia <= 30) || (mes == 3 && dia>=1 && dia<=20 )){
            //12) Piscis: 19 de febrero - 20 de marzo(2-3)
            horoscopo="Piscis";
            System.out.println("Eres "+horoscopo);
            
        } else{
            System.out.println("Lo sentimos mucho pero esa fecha no existe");
        }
        
        datos.close();
    }
}
