package practica11;
import practica11.cuadrado.*;
import practica11.triangulo.*;
import practica11.circulo.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class Frame extends JFrame{
  public Frame(){
    super("Figuras 6");
    setSize(700, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocation(300, 300);
    setResizable(true);
    setLayout(new GridLayout(3, 1));
    CuadradoPanel cp = new CuadradoPanel();
    TrianguloPanel tp = new TrianguloPanel();
    CirculoPanel ep = new CirculoPanel();
    JLabel lbl = new JLabel();
    JLabel lbl2 = new JLabel();
    this.add(cp);
    //this.add(lbl);
    this.add(tp);
    //this.add(lbl2);
    this.add(ep);
  }
}
