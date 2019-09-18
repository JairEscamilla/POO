package practica8;
import java.util.Scanner;
public class Dado{
  int number;
  static int aciertos = 0, fallos = 0, total = 0;
  Scanner sc = new Scanner(System.in);
  public void lanzarDado(){
    this.number = (int)(Math.random() * 6) + 1;
  }
  public void jugar(){
    int num;
    boolean ac = true;
    do {
      System.out.print("Ingresar numero que piensa es correcto-> ");
      num = sc.nextInt();
      if(num == this.number){
        aciertos+= 1;
        ac = false;
        System.out.println("Haz acertado!\n");
      }else{
        System.out.println("Haz fallado):\nIntenta de nuevo\n");
        fallos += 1;
      }
      total += 1;
    } while (ac);
  }
  public void desplegarDatos(){
    System.out.println("Aciertos: "+ aciertos + "\nFallos: "+ fallos + "\nTotal de intentos: " + total);
  }
}
