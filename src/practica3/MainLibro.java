package practica3;

public class MainLibro {
    public static void main(String[] args) {

        // crear objetos
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        libro1.titulo = "Cien años de soledad";
        libro1.autor = "Gabriel García Márquez";

        libro2.titulo = "El principito";
        libro2.autor = "Antoine de Saint-Exupéry";

        // mostrar datos
        System.out.println("Libro 1:");
        libro1.mostrar();

        System.out.println("\nLibro 2:");
        libro2.mostrar();
    }
}