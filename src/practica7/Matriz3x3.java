package practica7;

import java.util.Scanner;

public class Matriz3x3 {

    public int[][] data;
    public int filas;
    public int columnas;

    public Matriz3x3() {

        filas = 3;
        columnas = 3;

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

    public Matriz3x3 sumar(Matriz3x3 otra) {

        Matriz3x3 resultado = new Matriz3x3();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.data[i][j] = this.data[i][j] + otra.data[i][j];
            }
        }

        return resultado;
    }

    public Matriz3x3 restar(Matriz3x3 otra) {

        Matriz3x3 resultado = new Matriz3x3();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.data[i][j] = this.data[i][j] - otra.data[i][j];
            }
        }

        return resultado;
    }

    public Matriz3x3 multiplicar(Matriz3x3 otra) {

        Matriz3x3 resultado = new Matriz3x3();

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

    public static void main(String[] args) {

        Matriz3x3 m = new Matriz3x3();

        m.cargar();
        m.imprimir();
    }
}

