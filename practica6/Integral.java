package practica6;

public class Integral{
  int a, b;
  double dx;
  public Integral(double dx){
    this.a = -3;
    this.b = 3;
    this.dx = dx;
  }
  private double f(double x){
    return x;
  }
  public double resolver(){
    double res = 0;
    for(float i = a; i <= b; i+= dx){
      res+= dx*f(i);
    }
    return res;
  }
}
