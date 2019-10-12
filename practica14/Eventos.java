package practica14;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

import practica13.PanelRadioButton;
import practica6.Integral;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Eventos implements ActionListener{
    public void actionPerformed(ActionEvent evento){
        try{
            boolean numbers = true;
            int ni, nf;
            String funcion = Informacion.txt.getText().toString();
            int a = Integer.parseInt(funcion.substring(0, funcion.indexOf("x2")));
            int b = Integer.parseInt(funcion.substring(funcion.indexOf("x2") + 2, funcion.indexOf("x1")));
            int c = Integer.parseInt(funcion.substring(funcion.indexOf("x1") + 2));
            System.out.println(a + ", " + b + ", "+ c);
            if(evento.getSource() == practica13.PanelRadioButton.ninguna){
                Integral area;
                int li = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el limite inferior:"));
                int ls = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el limite superior:"));
                double dx = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar el tamaño del salto dx: "));
                area = new Integral(a, b, c, dx, li, ls);
                double resultado = area.resolver();
                JOptionPane.showMessageDialog(null, "El resultado de la integral es " + resultado, "Resultado integral", JOptionPane.INFORMATION_MESSAGE);
            }
            if(evento.getSource() == practica13.PanelRadioButton.media){
                int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar un valor donde evaluar la función: "));
                int result = a*value*value + b*value + c;
                JOptionPane.showMessageDialog(null, "El resultado de la evaluación es " + result, "Resultado evaluación", JOptionPane.INFORMATION_MESSAGE);
            }
            if(evento.getSource() == practica13.PanelRadioButton.mucha){
                Frame.panelTable.removeAll();
                int li = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el limite inferior:"));
                int ls = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el limite superior:"));
                Frame.datos = new String[ls - li + 1][2];
                int counter = li;
                for (int fila = 0; fila < Frame.datos.length; fila++) {
                        Frame.datos[fila][0] =  String.valueOf(counter);
                        Frame.datos[fila][1] = String.valueOf(a * counter * counter + b * counter + c);
                        counter++;
                }
                Frame.panelTable.updateUI();
                Frame.panelTable.repaint();
                Frame.tabla = new JTable(Frame.datos, Frame.columnNames);
                // Importante para ver el encabezado
                JScrollPane tableContainer = new JScrollPane(Frame.tabla);
                Frame.panelTable.add(tableContainer);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha introducido mal los datos", "error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
}

