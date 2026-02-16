public class calculadora {

    public int x1, x2;

    public calculadora(int a, int b) {
        x1 = a;
        x2 = b;
    }

    public int add() {
        return x1 + x2;
    }

    public int subs() {
        return x1 - x2;
    }

    public int mul() {
        return x1 * x2;
    }

    public int div() {
        if (x2 == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        return x1 / x2;
    }

    static void main(String[] args) {

        calculadora m = new calculadora(34, 43);
        calculadora n = new calculadora(50, 258);

        System.out.println("Calculadora m:");
        System.out.println(m.add());
        System.out.println(m.subs());
        System.out.println(m.mul());
        System.out.println(m.div());

        System.out.println("Calculadora n:");
        System.out.println(n.add());
        System.out.println(n.subs());
        System.out.println(n.mul());
        System.out.println(n.div());
    }
}
