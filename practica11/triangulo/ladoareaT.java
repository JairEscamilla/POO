package practica11.triangulo;
import javax.swing.*;
import java.awt.GridLayout;

public class ladoareaT extends JPanel{
  static JButton btn, btn2;
  public ladoareaT(){
    setLayout(new GridLayout(5, 1));
    JLabel lbl = new JLabel("Base: ");
    JLabel lbl2 = new JLabel("Altura: ");
    JLabel lbl3 = new JLabel("Profundidad: ");
    JLabel space = new JLabel();
    JLabel space1 = new JLabel();
    JLabel space2 = new JLabel();
    JLabel space3 = new JLabel();
    btn = new JButton("Área");
    btn2 = new JButton("Volumen");
    this.add(lbl);
    this.add(lbl2);
    this.add(lbl3);
    this.add(btn);
    //this.add(btn2);
  }
}
