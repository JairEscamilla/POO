package practica14;

import javax.swing.JFrame;
import java.awt.*;

public class FrameTabla extends JFrame {
    public FrameTabla(int x[]){
        super("Resultados de la evaluacion");
        setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
    }
}