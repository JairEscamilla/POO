package practica2;
import java.util.Scanner;

public class testRecta{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float y2, y1, x2, x1;
    System.out.println("(Recta 1)Ingresar y2: ");
    y2 = sc.nextFloat();
    System.out.println("(Recta 1)Ingresar y1: ");
    y1 = sc.nextFloat();
    System.out.println("(Recta 1)Ingresar x2: ");
    x2 = sc.nextFloat();
    System.out.println("(Recta 1)Ingresar x1: ");
    x1 = sc.nextFloat();
    Recta r1 = new Recta();
    r1.calculaPendiente(y2, y1, x2, x1);
    r1.calculaB(x2, y2);
    System.out.println(r1);
    System.out.println("La pendiente es " + r1.getPendiente());
    System.out.println("La ordenada al origen es "+ r1.getB());
    System.out.println("(Recta 2)Ingresar y2: ");
    y2 = sc.nextFloat();
    System.out.println("(Recta 2)Ingresar y1: ");
    y1 = sc.nextFloat();
    System.out.println("(Recta 2)Ingresar x2: ");
    x2 = sc.nextFloat();
    System.out.println("(Recta 2)Ingresar x1: ");
    x1 = sc.nextFloat();
    Recta r2 = new Recta();
    r2.calculaPendiente(y2, y1, x2, x1);
    r2.calculaB(x1, y1);
    System.out.println(r2);
    System.out.println("La pendiente es "+r2.getPendiente());
    System.out.println("La ordenada al origen es "+r2.getB());
    if (r1.compararRectas(r1, r2)) {
      System.out.println("Son paralelas");
      System.out.println("Son la misma recta \nEl angulo es 0");
    }else{
      System.out.println("No son paralelas");
      r1.interseccion(r1, r2);
      System.out.println("Angulo: "+ r1.angulo(r1, r2));
    }
  }
}
