package practica5;

public class MainEstudiante {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Juan", 20, 8.5);

        System.out.println("=== Datos iniciales ===");
        e1.mostrar();

        System.out.println("\n=== Modificando datos ===");
        e1.setNombre("Carlos");
        e1.setPromedio(9.0);

        e1.mostrar();

        System.out.println("\n=== Acceso con getters ===");
        System.out.println("Nombre: " + e1.getNombre());
        System.out.println("Edad: " + e1.getEdad());
        System.out.println("Promedio: " + e1.getPromedio());
    }
}

