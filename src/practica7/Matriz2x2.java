package practica7;

import java.util.Scanner;

public class Matriz2x2 {

    public int[][] data;
    public int filas;
    public int columnas;

    public Matriz2x2() {

        filas = 2;
        columnas = 2;

        data = new int[filas][columnas];
    }

    public void cargar() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("data[" + i + "][" + j + "]: ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    public void imprimir() {

        System.out.println("\nMatrix:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matriz2x2 sumar(Matriz2x2 otra) {

        Matriz2x2 resultado = new Matriz2x2();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.data[i][j] = this.data[i][j] + otra.data[i][j];
            }
        }

        return resultado;
    }

    public Matriz2x2 restar(Matriz2x2 otra) {

        Matriz2x2 resultado = new Matriz2x2();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.data[i][j] = this.data[i][j] - otra.data[i][j];
            }
        }

        return resultado;
    }

    public Matriz2x2 multiplicar(Matriz2x2 otra) {

        Matriz2x2 resultado = new Matriz2x2();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                resultado.data[i][j] = 0;

                for (int k = 0; k < columnas; k++) {
                    resultado.data[i][j] = resultado.data[i][j] + this.data[i][k] * otra.data[k][j];
                }
            }
        }

        return resultado;
    }

    public int sumaElementos() {
        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += data[i][j];
            }
        }
        return suma;
    }

    public Matriz2x2 transpuesta() {
        Matriz2x2 resultado = new Matriz2x2();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.data[j][i] = this.data[i][j];
            }
        }
        return resultado;
    }

    public static void main(String[] args) {

        Matriz2x2 m = new Matriz2x2();

        m.cargar();
        m.imprimir();
    }
}

