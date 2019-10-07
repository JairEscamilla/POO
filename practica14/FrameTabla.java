package practica14;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.*;

public class FrameTabla extends JFrame {
    public FrameTabla(int x[], int li){
        super("Resultados de la evaluacion");
        setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        String columnas[] = {"x", "y"};
        String datos[][] = new String[x.length][2];
        for(int i = 0; i < x.length; i++){
            datos[i][0] = String.valueOf(li);
            li++;
        }
        for(int i = 0; i < x.length; i++){
            datos[i][1] = String.valueOf(x[i]);
        }
        JLabel lbl = new JLabel("Resultados de evaluación");
        this.add(lbl);
        JTable tabla = new JTable(datos, columnas);
        this.add(tabla);
    }
}