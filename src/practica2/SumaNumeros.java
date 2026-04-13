package practica2;

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese segundo número: ");
        double num2 = sc.nextDouble();

        double suma = num1 + num2;

        System.out.println("La suma es: " + suma);
    }
}