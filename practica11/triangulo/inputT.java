package practica11.triangulo;
import javax.swing.*;
import java.awt.GridLayout;

public class inputT extends JPanel{
  static JTextField txt1, txt2, txt3;
  static JButton btn2;
  public inputT(){
    setLayout(new GridLayout(5, 1));
    txt1 = new JTextField("Base");
    this.add(txt1);
    txt2 = new JTextField("Altura");
    this.add(txt2);
    txt3 = new JTextField("Profundidad");
    this.add(txt3);
    btn2 = new JButton("Volumen");
    this.add(btn2);
  }
}
