package practica8;

import java.util.ArrayList;
import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("numbers[" + i + "]: ");
            int value = sc.nextInt();
            numbers.add(value);
        }

        System.out.println("List: " + numbers);
    }
}

