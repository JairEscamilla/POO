package practica13;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosCheck implements ActionListener{
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource() == CheckBuit.diagnostico){
            try{
                int c = 0;
                if(CheckBuit.mayorPeso.isSelected())
                    c+= 1;
                if(CheckBuit.frecuenciaAlta.isSelected())
                    c+= 1;
                if(CheckBuit.mayorEdad.isSelected())
                    c+= 1;
                System.out.println(c);
                if(c >= 2){
                    JOptionPane.showMessageDialog(null, "Validar mas datos", "Salida Diagnostico", JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Todo ok", "Salida diagnostico", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Introducir solo numeros", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(PanelRadioButton.ninguna.isSelected()){
            JOptionPane.showMessageDialog(null, "Opcion ninguna", "Respiracion", JOptionPane.ERROR_MESSAGE);
        }
    }
}