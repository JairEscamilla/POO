package p17;
import java.util.Random;
public class arregloSimple{
    private final int arreglo[];
    private int indiceEscritura = 0;
    private final static Random generador = new Random();

    public arregloSimple(int tamanio){
        arreglo = new int[tamanio];
    }

    public synchronized void agregar(int valor){
        int posicion = indiceEscritura;
        try {
            Thread.sleep(generador.nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        arreglo[posicion] = valor;
        System.out.printf("%s escribio %2d en el elemento %d.\n", Thread.currentThread().getName(), valor, posicion);
        ++indiceEscritura;
        System.out.println("Siguiente indice de escritura: " + indiceEscritura);
    }
    public String toString(){
        String cadenaArreglo = "\nContenido arreglo simple: \n";
        for(int i = 0; i < arreglo.length; i++){
            cadenaArreglo += arreglo[i] + " ";
        }
        return cadenaArreglo;
    }
}