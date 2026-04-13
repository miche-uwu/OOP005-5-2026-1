package practica8;

import java.util.ArrayList;

public class Example3 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.set(1, 99);

        System.out.println(numbers);
    }
}

