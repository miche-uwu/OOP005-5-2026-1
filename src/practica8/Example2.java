package practica8;

import java.util.ArrayList;

public class Example2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(8);
        numbers.add(12);

        System.out.println("First element: " + numbers.get(0));
        System.out.println("Second element: " + numbers.get(1));
        System.out.println("Third element: " + numbers.get(2));
    }
}

