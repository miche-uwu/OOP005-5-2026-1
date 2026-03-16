import java.util.Scanner;
public class matriz2x2 {

    public int[][]data;
    public int filas;
    public int columnas;

    public matriz2x2() {
        filas = 2;
        columnas = 2;
        data = new int[filas][columnas];
    }
    public void set (){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.println("data ["+ i + "][" + j + "]: ");
                data [i][j] = sc.nextInt();
            }
        }
    }
    public void get(){
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        matriz2x2 m = new matriz2x2();
        m.set();
        m.get();
        // Crear otra matriz y pedir datos
        System.out.println("Ingrese los datos de la segunda matriz:");
        matriz2x2 n = new matriz2x2();
        n.set();
        // Suma
        matriz2x2 suma = m.sumar(n);
        System.out.println("Suma de matrices:");
        suma.get();
        // Multiplicación
        matriz2x2 producto = m.multiplicar(n);
        System.out.println("Multiplicación de matrices:");
        producto.get();
    }


    public matriz2x2 sumar(matriz2x2 otra) {
        matriz2x2 resultado = new matriz2x2();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.data[i][j] = this.data[i][j] + otra.data[i][j];
            }
        }
        return resultado;
    }

    public matriz2x2 multiplicar(matriz2x2 otra) {
        matriz2x2 resultado = new matriz2x2();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.data[i][j] = 0;
                for (int k = 0; k < columnas; k++) {
                    resultado.data[i][j] += this.data[i][k] * otra.data[k][j];
                }
            }
        }
        return resultado;
    }
}