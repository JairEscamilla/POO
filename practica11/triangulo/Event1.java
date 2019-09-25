package practica11.triangulo;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class Event1 implements ActionListener{
  public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == ladoareaT.btn){
      try{
        int base = Integer.parseInt(inputT.txt1.getText().toString());
        int altura = Integer.parseInt(inputT.txt2.getText().toString());

        TrianguloPanel.result1.setText("El area esd " + (base*altura)/2);
      }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error):");
      }
    }
    if(evento.getSource() ==inputT.btn2){
      try{
        int base = Integer.parseInt(inputT.txt1.getText().toString());
        int altura = Integer.parseInt(inputT.txt2.getText().toString());
        int profundidad = Integer.parseInt(inputT.txt3.getText().toString());
        TrianguloPanel.result1.setText("El volumen esd " + ((base*altura)/2)*profundidad);
      }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error):");
      }

    }
  }
}
