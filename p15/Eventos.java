package p15;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Eventos implements ActionListener{
    public void actionPerformed(ActionEvent action){
        if(action.getSource() == frame.registro){
            try {
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha introducido mal alguno de sus datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}