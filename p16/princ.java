package p16;
import java.util.ArrayList;

public class princ{
    public static void main(String[] args){
        Thread clock = new Count();
        ArrayList<Runnable> ev = new ArrayList<>();
        ev.add(new Launch(30, "Verde"));
        ev.add(new Launch(10, "Amarillo"));
        ev.add(new Launch(5, "Rojo"));
        clock.start();
        for(Runnable e: ev)
            new Thread(e).start();
            
    }
}