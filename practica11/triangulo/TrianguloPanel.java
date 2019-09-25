package practica11.triangulo;
import javax.swing.*;
import java.awt.GridLayout;

public class TrianguloPanel extends JPanel{
  static JLabel result1;
  public TrianguloPanel(){
    // Imagen de cuadrado
    Icon Cuadrado  = new ImageIcon(getClass().getResource("imagenes/triangulo.jpg"));
    JLabel label = new JLabel();
    label.setIcon(Cuadrado);
    setLayout(new GridLayout(1, 5));
    // Imagen de cubo
    Icon Cubo  = new ImageIcon(getClass().getResource("imagenes/index.jpeg"));
    JLabel label2 = new JLabel();
    label2.setIcon(Cubo);
    ladoareaT lbl = new ladoareaT();
    //JLabel prueba = new JLabel();
    inputT inp = new inputT();
    result1 = new JLabel("Resultado a calcular", SwingConstants.CENTER);
    this.add(label);
    this.add(label2);
    //this.add(prueba);
    this.add(lbl);
    this.add(inp);
    this.add(result1);
    Event1 ev = new Event1();
    ladoareaT.btn.addActionListener(ev);
    ladoareaT.btn.addActionListener(ev);

    inputT.btn2.addActionListener(ev);
    inputT.btn2.addActionListener(ev);
  }
}
