package p17;
import java.lang.Runnable;

public class escritorArreglo implements Runnable{
    private final arregloSimple arregloSimpleCompartido;
    private final int valorInicial, number;
    public escritorArreglo(int valor, arregloSimple arreglo, int number){
        valorInicial = valor;
        arregloSimpleCompartido = arreglo;
        this.number = number;
    }
    public void run(){
        for(int i = valorInicial; i < number; i++){
            arregloSimpleCompartido.agregar(i);
        }
    }
}