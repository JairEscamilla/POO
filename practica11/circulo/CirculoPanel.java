package practica11.circulo;
import javax.swing.*;
import java.awt.GridLayout;

public class CirculoPanel extends JPanel{
  static JLabel result1;
  public CirculoPanel(){
    // Imagen de cuadrado
    Icon Cuadrado  = new ImageIcon(getClass().getResource("imagenes/indexCirc.png"));
    JLabel label = new JLabel();
    label.setIcon(Cuadrado);
    setLayout(new GridLayout(1, 5));
    // Imagen de cubo
    Icon Cubo  = new ImageIcon(getClass().getResource("imagenes/index.png"));
    JLabel label2 = new JLabel();
    label2.setIcon(Cubo);
    ladoareaCirc lbl = new ladoareaCirc();
    inputCirc inp = new inputCirc();
    result1 = new JLabel("Resultado a calcular", SwingConstants.CENTER);
    this.add(label);
    this.add(label2);
    this.add(lbl);
    this.add(inp);
    this.add(result1);
    Event1 ev = new Event1();
    ladoareaCirc.btn.addActionListener(ev);
    inputCirc.btn.addActionListener(ev);

  }
}
