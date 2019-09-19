package GUI;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class primerPanel extends JPanel{
    public primerPanel(){
        setSize(300, 300);
        JLabel etiqueta = new JLabel("Nombre: ");
        this.add(etiqueta);
    }
}