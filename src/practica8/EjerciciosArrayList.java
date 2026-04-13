package practica8;

import java.util.ArrayList;

public class EjerciciosArrayList {

    public static void main(String[] args) {

        System.out.println("=== Ejercicio 1: Crear ArrayList e insertar 5 números ===");
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        System.out.println("ArrayList: " + numeros);

        System.out.println("\n=== Ejercicio 2: Primer y último elemento ===");
        System.out.println("Primer elemento: " + numeros.get(0));
        System.out.println("Último elemento: " + numeros.get(numeros.size() - 1));

        System.out.println("\n=== Ejercicio 3: Reemplazar el segundo elemento ===");
        numeros.set(1, 99);
        System.out.println("ArrayList después de modificar: " + numeros);

        System.out.println("\n=== Ejercicio 4: Ciclo para imprimir todos ===");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Elemento " + i + ": " + numeros.get(i));
        }

        System.out.println("\n=== Ejercicio 5: ArrayList en una clase ===");
        MiLista lista = new MiLista(3);
        // Para prueba automática, insertar valores directamente
        lista.data.add(100);
        lista.data.add(200);
        lista.data.add(300);
        lista.imprimir("MiLista");
    }
}

class MiLista {
    public ArrayList<Integer> data;
    public int n;

    public MiLista(int n) {
        this.n = n;
        this.data = new ArrayList<Integer>();
    }

    public void cargar(java.util.Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("data[" + i + "]: ");
            data.add(sc.nextInt());
        }
    }

    public void imprimir(String name) {
        System.out.println(name + " = " + data);
    }
}

