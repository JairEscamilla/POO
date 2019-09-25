package practica11.circulo;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class Event1 implements ActionListener{
  public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == ladoareaCirc.btn){
      try{
        int lado = Integer.parseInt(inputCirc.txt1.getText().toString());
        CirculoPanel.result1.setText("El area es " + 3.141*lado*lado);
      }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error):");
      }
    }
    if(evento.getSource() == inputCirc.btn){
      try{
        int lado = Integer.parseInt(inputCirc.txt1.getText().toString());
        CirculoPanel.result1.setText("El volumen es " + (4/3)*3.14*lado*lado*lado);
      }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error):");
      }

    }
  }
}
