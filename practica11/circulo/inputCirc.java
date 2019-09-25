package practica11.circulo;
import javax.swing.*;
import java.awt.GridLayout;

public class inputCirc extends JPanel{
  static JTextField txt1;
  static JButton btn;
  public inputCirc(){
    setLayout(new GridLayout(2, 1));
    txt1 = new JTextField("Radio", 3);
    this.add(txt1);
    btn = new JButton("Volumen");
    this.add(btn);
  }
}
