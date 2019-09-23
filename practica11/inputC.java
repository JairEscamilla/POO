package practica11;
import javax.swing.*;
import java.awt.GridLayout;

public class inputC extends JPanel{
  static JTextField txt1;
  static JButton btn;
  public inputC(){
    setLayout(new GridLayout(2, 1));
    txt1 = new JTextField("Número", 3);
    this.add(txt1);
    btn = new JButton("Volumen");
    this.add(btn);
  }
}
