package practica7;

public class MainMatrices {
    public static void main(String[] args) {

        System.out.println("=== Suma de Matrices 2x2 ===");
        Matriz2x2 m1 = new Matriz2x2();
        Matriz2x2 m2 = new Matriz2x2();

        // Inicializar matrices manualmente
        m1.data[0][0] = 1; m1.data[0][1] = 2;
        m1.data[1][0] = 3; m1.data[1][1] = 4;

        m2.data[0][0] = 5; m2.data[0][1] = 6;
        m2.data[1][0] = 7; m2.data[1][1] = 8;

        System.out.println("Matriz 1:");
        m1.imprimir();

        System.out.println("Matriz 2:");
        m2.imprimir();

        Matriz2x2 suma = m1.sumar(m2);
        System.out.println("Suma (M1 + M2):");
        suma.imprimir();

        Matriz2x2 resta = m1.restar(m2);
        System.out.println("Resta (M1 - M2):");
        resta.imprimir();

        Matriz2x2 producto = m1.multiplicar(m2);
        System.out.println("Producto (M1 * M2):");
        producto.imprimir();

        System.out.println("Suma de elementos: " + m1.sumaElementos());

        Matriz2x2 trans = m1.transpuesta();
        System.out.println("Transpuesta de M1:");
        trans.imprimir();
    }
}

