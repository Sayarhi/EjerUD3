package EjemplosIfSwitch;

import java.util.Scanner;

public class MenuConSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Variables
        int eleccion;
        double lado;
        double base;
        double altura;

        //Menu
        System.out.println("\nCALCULO DE AREAS");
        System.out.println("-----------------");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Trángulo");
        System.out.print("\nElije una opción del 1 - 3: ");
        eleccion = teclado.nextInt();

        switch (eleccion) {
            case 1:
                System.out.print("\nIntroduce el lado del cuadrado en cm: ");
                lado=teclado.nextDouble();

                double resultadoCuadrado = lado*lado;
                
                System.out.print("\nEl área del cuadrado es: "+ resultadoCuadrado +" cm2");
                break;
            
            case 2:
                System.out.print("\nIntroduce la base del rectángulo en cm: ");
                base= teclado.nextDouble();

                System.out.print("\nAhora la altura del rectángulo: ");
                altura=teclado.nextDouble();

                double areaRectangulo = base*altura;

                System.out.println("El resultaddo es: "+areaRectangulo);
                break;
            
            case 3:
                System.out.print("\nIntroduzca la base del triángulo en cm: ");
                base=teclado.nextDouble();

                System.out.print("\nAhora la altura: ");
                altura= teclado.nextDouble();

                double areaTriangulo = (base*altura)/2;
                System.out.println("El resultado del área del triángulo es: "+ areaTriangulo+"cm2");
                break;

            default:
                System.out.print("\nLo siento, pero esa opción no es correcta");
        }
        teclado.close();
    }
}
