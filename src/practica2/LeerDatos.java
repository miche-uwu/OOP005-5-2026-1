package practica2;

import java.util.Scanner;

public class LeerDatos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();

        System.out.print("Semestre: ");
        int semestre = sc.nextInt();

        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();

        System.out.println("\nDatos ingresados:");
        System.out.println("Ciudad = " + ciudad);
        System.out.println("Semestre = " + semestre);
        System.out.println("Promedio = " + promedio);
    }
}