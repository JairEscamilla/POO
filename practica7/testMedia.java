package practica7;

public class testMedia{
  public static void main(String[] args){
    int arreglo[] = {10, 12, 3, 11, 10, 10, 5, 19, 2, 13, 12, 12, 12, 7};
    Media md = new Media(arreglo);
    md.media();
    md.tablaFrecuencias();
  //  System.out.println("La media es " + md.media);
  //  md.tablaFrecuencias();
  }
}
