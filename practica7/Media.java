package practica7;

public class Media{
  int arreglo[], arreglo2[];
  float media;
  int mayor, counter, contadorGlobal = 0, contadorFrecuencias = 0;
  public Media(int arr[]){
    this.arreglo = arr;
    arreglo2 = new int[arreglo.length];
  }
  public void media(){
    int counter = 0, i;
    for(i = 0; i < arreglo.length; i++){
      counter+= arreglo[i];
    }
    System.out.println("La media es " + (float)counter/arreglo.length);
  }

  private void ordenar(){
    int aux;
    for(int i = 0; i < arreglo.length; i++){
      for(int j = 0; j < arreglo.length; j++){
        if(arreglo[i] > arreglo[j]){
          aux = arreglo[i];
          arreglo[i] = arreglo[j];
          arreglo[j] = aux;
        }
      }
    }
  }

  private void copiaArreglo(){
    int cant = 0;
    counter = 0;
    for(int i = 0; i < arreglo.length; i++){
      //System.out.println("Aqui");
      arreglo2[i] = 0;
    }
    for(int i = 0; i < arreglo.length; i++){
      cant = 0;
      for(int j = 0; j < arreglo2.length; j++){
        if(arreglo[i] == arreglo2[j]){
          cant++;
        }
      }
      if(cant == 0){
        arreglo2[counter] = arreglo[i];
        counter++;
      }
    }
  }

  public void tablaFrecuencias(){
    ordenar();
    copiaArreglo();
    int contador = 0;// array[] = new int[];
    System.out.println("La tabla de frecuencias es: ");
    for(int i = counter - 1; i >= 0; i--){
      contador = 0;
      for(int j = 0; j < arreglo.length; j++){
        if(arreglo2[i] == arreglo[j])
          contador++;
      }
      System.out.println(arreglo2[i] + " " + contador);
      contadorFrecuencias+= contador*arreglo2[i];
      contadorGlobal+= contador;
    }
    System.out.println("La media aritmetica con frecuencias es " + (float)contadorFrecuencias / arreglo.length);
  }

  public void imprimirArreglo(){
    System.out.println("El arreglo ordenado es: ");
    for(int i = arreglo.length - 1; i >= 0; i--){
      System.out.println(arreglo[i]);
    }
  }

  public void mediana(){
    double mediana;
    if((arreglo.length + 1) % 2 == 0){
        mediana = arreglo[((arreglo.length+1)/2) - 1];
        System.out.println("Aqui");
    }else{
      mediana = arreglo[(arreglo.length + 1) / 2] + arreglo[((arreglo.length + 1) / 2) - 1];
    }
    System.out.println("La mediana es "+ mediana);
  }
}
// 10, 12, 3, 11, 10, 10, 5, 19, 2, 13, 12, 12, 12, 7
