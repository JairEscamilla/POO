package practica14;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Eventos implements ActionListener{
    public void actionPerformed(ActionEvent evento){
        try{
            boolean numbers = true;
            int ni, nf;
            String funcion = Informacion.txt.getText().toString();
            int a = Integer.parseInt(funcion.substring(1, funcion.indexOf("x2")));
            int b = Integer.parseInt(funcion.substring(funcion.indexOf("x2") + 2, funcion.indexOf("x1")));
            int c = Integer.parseInt(funcion.substring(funcion.indexOf("x1") + 2));
            System.out.println(a + ", " + b + ", "+ c);//+ ", " + b + ", " +c);
           // System.out.println(funcion.substring(funcion.indexOf("x2") + 2, funcion.indexOf("x1")));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Haa ocurrido un error", "error", JOptionPane.ERROR_MESSAGE);
        }
    }
}