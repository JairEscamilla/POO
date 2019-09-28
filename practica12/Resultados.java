package practica12;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
public class Resultados extends JPanel{
    static JButton calc;
    static JLabel lbl;
    public Resultados(){
        setLayout(null);
        calc = new JButton("Calc");
        calc.setBounds(100, 50, 120, 25);
        this.add(calc);
        lbl = new JLabel("El valor de la media es: ");
        lbl.setBounds(240, 50, 600, 25);
        this.add(lbl);
    }
}