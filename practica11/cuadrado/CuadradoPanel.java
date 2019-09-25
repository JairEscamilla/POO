package practica11.cuadrado;
import javax.swing.*;
import java.awt.GridLayout;

public class CuadradoPanel extends JPanel{
  static JLabel result1;
  public CuadradoPanel(){
    // Imagen de cuadrado
    Icon Cuadrado  = new ImageIcon(getClass().getResource("imagenes/cuadrado.png"));
    JLabel label = new JLabel();
    label.setIcon(Cuadrado);
    setLayout(new GridLayout(1, 5));
    // Imagen de cubo
    Icon Cubo  = new ImageIcon(getClass().getResource("imagenes/cubo.jpg"));
    JLabel label2 = new JLabel();
    label2.setIcon(Cubo);
    ladoareaC lbl = new ladoareaC();
    inputC inp = new inputC();
    result1 = new JLabel("Resultado a calcular", SwingConstants.CENTER);
    this.add(label);
    this.add(label2);
    this.add(lbl);
    this.add(inp);
    this.add(result1);
    Event1 ev = new Event1();
    ladoareaC.btn.addActionListener(ev);
    inputC.btn.addActionListener(ev);
  }
}
