package practica8;
import java.util.Scanner;

public class testDado{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int juegos = 0;
    Dado d = new Dado();
    String opcion = "si";
    do {
      d.lanzarDado();
      d.jugar();
      juegos++;
      System.out.println("Desea seguir jugando? (s/n)");
      opcion = sc.nextLine();
    } while (opcion.equals("si") );
    d.desplegarDatos();
    System.out.println("Total de juegos: " + juegos);
  }
}
