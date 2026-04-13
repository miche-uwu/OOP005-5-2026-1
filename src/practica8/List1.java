package practica8;

import java.util.ArrayList;
import java.util.Scanner;

public class List1 {

    public ArrayList<Integer> data;
    public int n;

    public List1(int n) {
        this.n = n;
        data = new ArrayList<Integer>();
    }

    public void load() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("data[" + i + "]: ");
            data.add(sc.nextInt());
        }
    }

    public void print(String name) {
        System.out.println(name + " = " + data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size n: ");
        int n = sc.nextInt();

        List1 v = new List1(n);

        v.load();
        v.print("v");
    }
}

