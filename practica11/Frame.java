package practica11;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class Frame extends JFrame{
  public Frame(){
    super("Figuras 6");
    setSize(700, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocation(300, 300);
    setResizable(true);
    setLayout(new GridLayout(3, 1));
    CuadradoPanel cp = new CuadradoPanel();
    this.add(cp);
  }
}
