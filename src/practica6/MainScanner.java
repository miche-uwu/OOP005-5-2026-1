package practica6;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Tamano n: ");
        int n = sc.nextInt();

        VectorInt v = new VectorInt(n);

        for (int i = 0; i < v.n; i++) {
            System.out.print("v[" + i + "]: ");
            v.data[i] = sc.nextInt();
        }

        v.print("v");
        System.out.println("sum = " + v.sum());
        System.out.println("mean = " + v.mean());
        System.out.println("max = " + v.max());
        System.out.println("min = " + v.min());
        System.out.println("pares = " + v.countEven());
        System.out.println("impares = " + v.countOdd());
    }
}

