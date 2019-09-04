package practica4;

public class Energia{
  double masa, velocidad, altura;
  static final double gravedad = 9.81;
  public Energia(double masa, double velocidad, double altura){
    this.masa = masa;
    this.velocidad = velocidad;
    this.altura = altura;
  }

  public double ec(){
    return (masa*velocidad*velocidad)*0.5;
  }
  public double ep(){
    return masa*gravedad*altura;
  }
}
