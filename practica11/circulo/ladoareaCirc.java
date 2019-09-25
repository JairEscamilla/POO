package practica11.circulo;
import javax.swing.*;
import java.awt.GridLayout;

public class ladoareaCirc extends JPanel{
  static JButton btn;
  public ladoareaCirc(){
    setLayout(new GridLayout(2, 1));
    JLabel lbl = new JLabel("LADO");
    JLabel lbl2 = new JLabel();
    JLabel lbl3 = new JLabel();
    btn = new JButton("Área");
    //this.add(lbl2);
    this.add(lbl);
    //this.add(lbl3);
    this.add(btn);
  }
}
