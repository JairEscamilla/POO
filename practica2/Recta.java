package practica2;
import java.lang.Math;

public class Recta{
  float m;
  float b;
  public void calculaPendiente(float y2, float y1, float x2, float x1){
    this.m = (y2-y1)/(x2-x1);
  }
  public void calculaB(float x, float y){
    this.b = m*x + y;
  }
  public String toString(){
    return "La ecuacion de la recta es y = " +m+ "x + " + b;
  }
  public float getPendiente(){
    return m;
  }
  public float getB(){
    return b;
  }
  public boolean compararRectas(Recta r1, Recta r2){
    return r1.m == r2.m;
  }
  public void interseccion(Recta r1, Recta r2){
    float x = (r2.b - r1.b)/(r1.m - r2.m);
    float y = r1.m*x+r1.b;
    System.out.println("La interseccion es en ("+x+", "+y+")");
  }
  public double angulo(Recta r1, Recta r2){
    double x = (r2.m - r1.m)/(1+r1.m*r2.m);
    return Math.atan(x);
  }
}
