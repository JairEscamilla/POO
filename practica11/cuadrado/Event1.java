package practica11.cuadrado;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class Event1 implements ActionListener{
  public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == ladoareaC.btn){
      try{
        int lado = Integer.parseInt(inputC.txt1.getText().toString());
        CuadradoPanel.result1.setText("El area es " + lado*lado);
      }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error):");
      }
    }
    if(evento.getSource() == inputC.btn){
      try{
        int lado = Integer.parseInt(inputC.txt1.getText().toString());
        CuadradoPanel.result1.setText("El volumen es " + lado*lado*lado);
      }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error):");
      }

    }
  }
}
