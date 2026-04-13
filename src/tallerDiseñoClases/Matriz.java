package tallerDiseñoClases;

import java.util.Scanner;

class Matriz {
    int n;
    int[][] A;

    // Constructor vacío
    public Matriz() {}

    // Constructor sobrecargado
    public Matriz(int n) {
        this.n = n;
        A = new int[n][n];
    }

    public void ingresar() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
    }

    public int[][] suma(Matriz B) {
        int[][] R = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                R[i][j] = A[i][j] + B.A[i][j];
        return R;
    }

    public int[][] resta(Matriz B) {
        int[][] R = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                R[i][j] = A[i][j] - B.A[i][j];
        return R;
    }

    public int[][] transpuesta() {
        int[][] T = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                T[j][i] = A[i][j];
        return T;
    }

    public int[][] multiplicacion(Matriz B) {
        int[][] R = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    R[i][j] += A[i][k] * B.A[k][j];
        return R;
    }

    // Determinante (2x2 simplificado)
    public int determinante() {
        if (n == 2) {
            return A[0][0]*A[1][1] - A[0][1]*A[1][0];
        }
        return 0;
    }
}