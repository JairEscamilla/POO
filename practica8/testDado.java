package practica8;
import java.util.Scanner;

public class testDado{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Dado d = new Dado();
    String opcion = "s";
    do {
      d.lanzarDado();
      d.jugar();
      System.out.println("Desea seguir jugando? (s/n)");
      opcion = sc.nextLine();
    } while (opcion.equals("s") );
    d.desplegarDatos();
  }
}
