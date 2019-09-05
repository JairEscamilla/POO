package practica5;

import java.util.Scanner;

import practica5.Cuadratica;

public class testCuadratica{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float x1, x2;
        int a, b, c;
        Cuadratica c1;
        System.out.print("Ingresar a: ");
        a = sc.nextInt();
        System.out.print("Ingresar b: ");
        b = sc.nextInt();
        System.out.print("Ingresar c: ");
        c = sc.nextInt();
        c1 = new Cuadratica(a, b, c);
        c1.Solve();
        c1.vertice();
        c1.apertura();
    }
}