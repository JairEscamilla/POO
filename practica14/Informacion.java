package practica14;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Informacion extends JPanel{
    public static JTextField txt;
    public Informacion(){
        setLayout(null);
        setBackground(new Color(3, 169, 244));
        JLabel lbl = new JLabel("Ingresar funcion: ", SwingConstants.CENTER);
        txt = new JTextField();
        lbl.setBounds(0, 30, 200, 20);
        lbl.setFont(new java.awt.Font("Roboto", 1, 20));
        lbl.setForeground(Color.white);
        this.add(lbl);
        txt.setBounds(180, 30, 180, 20);
        this.add(txt);
    }
}   