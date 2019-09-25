package practica11.cuadrado;
import javax.swing.*;
import java.awt.GridLayout;

public class ladoareaC extends JPanel{
  static JButton btn;
  public ladoareaC(){
    setLayout(new GridLayout(2, 1));
    JLabel lbl = new JLabel("LADO");
    JLabel lbl2 = new JLabel();
    JLabel lbl3 = new JLabel();
    btn = new JButton("Área");
   // this.add(lbl2);
    this.add(lbl);
    //this.add(lbl3);
    this.add(btn);
  }
}
