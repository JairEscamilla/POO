package examen;

public class Percentiles{
    public int arreglo[];
    public Percentiles(int array[]){
        this.arreglo = array;
    }
    public int[] ordenar(){
        int aux;
        for(int i = 0; i < arreglo.length; i++){
          for(int j = 0; j < arreglo.length; j++){
            if(arreglo[i] < arreglo[j]){
              aux = arreglo[i];
              arreglo[i] = arreglo[j];
              arreglo[j] = aux;
            }
          }
        }
        return arreglo;
      }
    
      public void percentil(int arreglo[], int per){
        try{
            double i = (double)(arreglo.length * per)/100;
            double prom;
            if(i % (int) i == 0){
                prom = (double)(arreglo[(int)i] + arreglo[(int)i-1])/2;
            }else{
                prom = arreglo[(int)i];
            }
            System.out.println(prom);
        }catch(Exception e){
            System.out.println("No se puede obtener ese valor");
        }
        
      }
}