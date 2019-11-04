package p17;
import java.util.concurrent.*;
public class pruebaArreglo{
    public static void main(String args[]){
        arregloSimple arregloSimpleCompartido = new arregloSimple(8);
        escritorArreglo escritor1 = new escritorArreglo(5, arregloSimpleCompartido, 9);
        escritorArreglo escritor2 = new escritorArreglo(10, arregloSimpleCompartido, 13);
        escritorArreglo escritor3 = new escritorArreglo(20, arregloSimpleCompartido, 21);
        ExecutorService ejecutor = Executors.newCachedThreadPool();
        ejecutor.execute(escritor1);
        ejecutor.execute(escritor2);
        ejecutor.execute(escritor3);
        ejecutor.shutdown();
        try {
            boolean tareas = ejecutor.awaitTermination(1, TimeUnit.MINUTES);
            if(tareas)
                System.out.println(arregloSimpleCompartido);
            else 
                System.out.println("Se agotoo el tiempo para las tareas");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }
    }
}