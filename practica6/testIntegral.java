package practica6;

import java.util.Scanner;

public class testIntegral{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double dx;
    Integral in;
    System.out.println("Ingresa dx: ");
    dx = sc.nextDouble();
    in = new Integral(dx);
    System.out.println("El resultado es " + in.resolver());
  }
}
