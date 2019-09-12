package practica7;

public class testMedia{
  public static void main(String[] args){
    int arreglo[] = {50, 20, 0, 56, 7, 0, 0};
    Media md = new Media(arreglo);
    md.media();
    md.tablaFrecuencias();
    md.imprimirArreglo();
    md.mediana();
  //  System.out.println("La media es " + md.media);
  //  md.tablaFrecuencias();
  }
}
