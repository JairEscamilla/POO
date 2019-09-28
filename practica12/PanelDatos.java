package practica12;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelDatos extends JPanel{
    static JLabel texto1;
    static JTextField numValores;
    static JButton imprimir;
    public PanelDatos(){
        setLayout(null);
        texto1 = new JLabel("Numero de datos: ", SwingConstants.CENTER);
        // (X, Y, width, height) -> Esquina superior izquierda
        texto1.setBounds(20, 22, 200, 25);
        this.add(texto1);
        numValores = new JTextField("Cantidad de valores: ", 3);
        numValores.setBounds(195, 22, 130, 25);
        this.add(numValores);
        imprimir = new JButton("Ingresar datos");
        imprimir.setBounds(340, 22, 150, 25);
        this.add(imprimir);
    }
}