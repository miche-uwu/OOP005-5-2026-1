package tallerDiseñoClases;

import java.util.Scanner;

class Estadistica {
    private double[] datos;

    // Constructor vacío
    public Estadistica() {
    }

    // Constructor sobrecargado
    public Estadistica(double[] datos) {
        this.datos = datos;
    }

    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de datos: ");
        int n = sc.nextInt();

        datos = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Dato " + (i + 1) + ": ");
            datos[i] = sc.nextDouble();
        }
    }

    public double media() {
        double suma = 0;
        for (double d : datos) suma += d;
        return suma / datos.length;
    }

    public double varianza() {
        double media = media();
        double suma = 0;
        for (double d : datos) {
            suma += Math.pow(d - media, 2);
        }
        return suma / datos.length;
    }

    public double desviacion() {
        return Math.sqrt(varianza());
    }
}