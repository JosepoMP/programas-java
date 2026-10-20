// hecho por Daniela Guzman
 
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Nota 1: ");
        double n1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = scanner.nextDouble();

        double promedio = (n1 + n2 + n3) / 3;
        String resultado = (promedio >= 3.0) ? "Aprobado" : "Reprobado";

        System.out.printf("%s, tu promedio es %.2f -> %s%n", nombre, promedio, resultado);
        scanner.close();
    }
}
            

