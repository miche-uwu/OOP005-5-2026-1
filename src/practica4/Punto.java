package practica4;

public class Punto {

    public double x;
    public double y;

    // Constructor vacío
    public Punto() {
        x = 0;
        y = 0;
    }

    // Constructor con parámetros
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // método para mostrar datos
    public void mostrar() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}