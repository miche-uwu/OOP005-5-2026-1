package practica8;

import java.util.ArrayList;

public class Example5 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}

