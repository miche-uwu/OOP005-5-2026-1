
package arreglos3;

import java.util.Scanner;

public class Arreglos3 {

    public int [] data ;
    public int n ;

// Constructor : crea vector de t a m a o n
    public Arreglos3( int n ) {
       this . n = n ;
       this . data = new int[n];
    }

    public void ingresarDatos () {
    Scanner sc = new Scanner(System.in);
       for (int i = 0; i < n ; i ++) {
           System . out . print (" ingrese el dato en la posicion " +i + ": ");
           data[i] = sc.nextInt();
       }
}
    //SUMA
    public int sum() {
        int s = 0;
        for (int i = 0; i < n; i++)
            s += data[i];
        return s;
    }
    //RESTA
    public int subtract() {
        if (n == 0) return 0;
        
        int r = data[0];
        for (int i = 1; i < n; i++)
            r -= data[i];
        return r;
    }
    //PROMEDIO
    public double mean() {
        if (n == 0) return 0.0;
        return (double) sum() / (double) n;
    }
    //MAXIMO 
    public int max() {
        int m = data[0];
        for (int i = 1; i < n; i++)
            if (data[i] > m)
                m = data[i];
        return m;
    }
    //MINIMO
    public int min() {
        int m = data[0];
        for (int i = 1; i < n; i++)
            if (data[i] < m)
                m = data[i];
        return m;
    }
    public void print(String name ) {
    System . out . print( name + " = [ " );
    for (int i = 0; i < n ; i++) {
    System . out . print( data [ i ]) ;
    if(i < n-1) System.out.println ( " , ");
    }
    System.out.println(" , ");
 }

  
    public static void main(String[] args) {
        Arreglos3 ob1 = new Arreglos3(8);
        ob1.ingresarDatos();
        ob1.print("Hola"); 
        System.out.println(ob1.data [0]);
        System.out.println(ob1.data [1]);
        System.out.println(ob1.data [2]);
        System.out.println(ob1.data [3]);
        System.out.println("Suma: " + ob1.sum());
        System.out.println("Resta: " + ob1.subtract());
        System.out.println("Promedio : " + ob1.mean());
        System.out.println("Maximo: " + ob1.max());
        System.out.println("Minimo: " + ob1.min());     
    }
}
