package tallerDiseñoClases;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Estadística");
            System.out.println("2. Figuras");
            System.out.println("3. Carro");
            System.out.println("4. Matrices");
            System.out.println("5. Robot");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    menuEstadistica(sc);
                    break;
                case 2:
                    menuFiguras(sc);
                    break;
                case 3:
                    menuCarro(sc);
                    break;
                case 4:
                    menuMatrices(sc);
                    break;
                case 5:
                    menuRobot(sc);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);
    }

    // ================== ESTADISTICA ==================
    public static void menuEstadistica(Scanner sc) {
        Estadistica e = new Estadistica();
        e.ingresarDatos();

        System.out.println("Media: " + e.media());
        System.out.println("Varianza: " + e.varianza());
        System.out.println("Desviación: " + e.desviacion());
    }

    // ================== FIGURAS ==================
    public static void menuFiguras(Scanner sc) {
        Figuras f = new Figuras();
        int op;

        do {
            System.out.println("\n--- FIGURAS ---");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triángulo");
            System.out.println("3. Pentágono");
            System.out.println("4. Trapecio");
            System.out.println("5. Rombo");
            System.out.println("6. Círculo");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Lado: ");
                    double lado = sc.nextDouble();
                    System.out.println("Área: " + f.areaCuadrado(lado));
                    break;
                case 2:
                    System.out.print("Base: ");
                    double b = sc.nextDouble();
                    System.out.print("Altura: ");
                    double h = sc.nextDouble();
                    System.out.println("Área: " + f.areaTriangulo(b, h));
                    break;
                case 3:
                    System.out.print("Perímetro: ");
                    double p = sc.nextDouble();
                    System.out.print("Apotema: ");
                    double a = sc.nextDouble();
                    System.out.println("Área: " + f.areaPentagono(p, a));
                    break;
                case 4:
                    System.out.print("Base mayor: ");
                    double B = sc.nextDouble();
                    System.out.print("Base menor: ");
                    double b2 = sc.nextDouble();
                    System.out.print("Altura: ");
                    double h2 = sc.nextDouble();
                    System.out.println("Área: " + f.areaTrapecio(B, b2, h2));
                    break;
                case 5:
                    System.out.print("Diagonal mayor: ");
                    double D = sc.nextDouble();
                    System.out.print("Diagonal menor: ");
                    double d = sc.nextDouble();
                    System.out.println("Área: " + f.areaRombo(D, d));
                    break;
                case 6:
                    System.out.print("Radio: ");
                    double r = sc.nextDouble();
                    System.out.println("Área: " + f.areaCirculo(r));
                    break;
            }

        } while (op != 0);
    }

    // ================== CARRO ==================
    public static void menuCarro(Scanner sc) {
        System.out.print("Marca: ");
        String marca = sc.next();
        System.out.print("Modelo: ");
        String modelo = sc.next();
        System.out.print("Color: ");
        String color = sc.next();

        Carro c = new Carro(marca, modelo, color);

        int op;
        do {
            System.out.println("\n--- CARRO ---");
            System.out.println("1. Encender");
            System.out.println("2. Acelerar");
            System.out.println("3. Frenar");
            System.out.println("0. Volver");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    c.encender();
                    break;
                case 2:
                    System.out.print("Velocidad a aumentar: ");
                    int v = sc.nextInt();
                    c.acelerar(v);
                    break;
                case 3:
                    c.frenar();
                    break;
            }
        } while (op != 0);
    }

    // ================== MATRICES ==================
    public static void menuMatrices(Scanner sc) {
        System.out.print("Tamaño de matriz: ");
        int n = sc.nextInt();

        Matriz A = new Matriz(n);
        Matriz B = new Matriz(n);

        System.out.println("Ingrese matriz A:");
        A.ingresar();

        System.out.println("Ingrese matriz B:");
        B.ingresar();

        int op;
        do {
            System.out.println("\n--- MATRICES ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Transpuesta (A)");
            System.out.println("4. Multiplicación");
            System.out.println("5. Determinante (A)");
            System.out.println("0. Volver");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    imprimir(A.suma(B));
                    break;
                case 2:
                    imprimir(A.resta(B));
                    break;
                case 3:
                    imprimir(A.transpuesta());
                    break;
                case 4:
                    imprimir(A.multiplicacion(B));
                    break;
                case 5:
                    System.out.println("Determinante: " + A.determinante());
                    break;
            }

        } while (op != 0);
    }

    public static void imprimir(int[][] M) {
        for (int[] fila : M) {
            for (int val : fila) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // ================== ROBOT ==================
    public static void menuRobot(Scanner sc) {
        Robot r = new Robot();

        int op;
        do {
            System.out.println("\n--- ROBOT ---");
            System.out.println("1. Encender");
            System.out.println("2. Preparar café");
            System.out.println("3. Limpiar");
            System.out.println("4. Cocinar");
            System.out.println("5. Recargar");
            System.out.println("6. Mantenimiento");
            System.out.println("0. Volver");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    r.encender();
                    break;
                case 2:
                    r.prepararCafe();
                    break;
                case 3:
                    r.limpiar();
                    break;
                case 4:
                    r.cocinar();
                    break;
                case 5:
                    r.recargar();
                    break;
                case 6:
                    r.mantenimiento();
                    break;
            }

        } while (op != 0);
    }
}