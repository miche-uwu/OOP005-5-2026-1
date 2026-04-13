package practica4;

public class MainPunto {
    public static void main(String[] args) {

        // usando constructor vacío
        Punto p1 = new Punto();

        // usando constructor con parámetros
        Punto p2 = new Punto(3, 5);
        Punto p3 = new Punto(-2, 10);

        System.out.println("Punto 1:");
        p1.mostrar();

        System.out.println("\nPunto 2:");
        p2.mostrar();

        System.out.println("\nPunto 3:");
        p3.mostrar();
    }
}