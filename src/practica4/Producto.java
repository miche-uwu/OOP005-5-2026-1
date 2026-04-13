package practica4;

public class Producto {

    public String nombre;
    public double precio;

    // Constructor 1
    public Producto() {
        nombre = "Sin nombre";
        precio = 0.0;
    }

    // Constructor 2
    public Producto(String nombre) {
        this.nombre = nombre;
        this.precio = 0.0;
    }

    // Constructor 3
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Precio = " + precio);
    }
}

