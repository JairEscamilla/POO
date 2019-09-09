package practica6;

public class Integral{
  int a, b;
  double dx;
  public Integral(double dx){
    this.a = -1;
    this.b = 2;
    this.dx = dx;
  }
  private double f(double x){
    return Math.pow(x, 4) + 2;
  }
  public double resolver(){
    double res = 0;
    for(float i = a; i <= b; i+= dx){
      res+= dx*f(i);
    }
    return res;
  }
}
