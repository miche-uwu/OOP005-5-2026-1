package practica6;

public class VectorInt {

    // (didáctico) todo público
    public int[] data;
    public int n;

    // Constructor: crea vector de tamaño n
    public VectorInt(int n) {
        this.n = n;
        this.data = new int[n];
    }

    public void print(String name) {
        System.out.print(name + " = [");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public int sum() {
        int s = 0;
        for (int i = 0; i < n; i++) s += data[i];
        return s;
    }

    public double mean() {
        if (n == 0) return 0.0;
        return (double) sum() / (double) n;
    }

    public int max() {
        int m = data[0];
        for (int i = 1; i < n; i++) {
            if (data[i] > m) m = data[i];
        }
        return m;
    }

    public int min() {
        int m = data[0];
        for (int i = 1; i < n; i++) {
            if (data[i] < m) m = data[i];
        }
        return m;
    }

    public int countEven() {
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (data[i] % 2 == 0) c++;
        }
        return c;
    }

    public int countOdd() {
        return n - countEven();
    }
}

