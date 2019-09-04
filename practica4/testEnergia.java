package practica4;
import java.util.Scanner;

public class testEnergia{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double m, h, v;
    Energia e;
    System.out.println("Ingresar masa-> ");
    m = sc.nextDouble();
    System.out.println("Ingresar velocidad-> ");
    v = sc.nextDouble();
    System.out.println("Ingresar altura-> ");
    h = sc.nextDouble();
    e = new Energia(m, v, h);
    System.out.println("La energia cinetica es " + e.ec() + " Joules");
    System.out.println("La energia potencial es " + e.ep() + " Joules");
  }
}
