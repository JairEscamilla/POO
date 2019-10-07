package practica6;

public class Integral{
  int a, b, aa, bb, cc, li, ls;
  double dx;
  public Integral(int aa, int bb, int cc, double dx, int li, int ls){
    this.aa = aa;
    this.bb = bb;
    this.cc = cc;
    this.dx = dx;
    this.li = li;
    this.ls = ls;
  }
  private double f(double x){
    return aa*x*x+bb*x+cc;
  }
  public double resolver(){
    double res = 0;
    for(float i = li; i <= ls; i+= dx){
      res+= dx*f(i);
    }
    return res;
  }
}
