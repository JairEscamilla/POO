package practica12;
import javax.swing.*;
import java.awt.event.*;


public class Eventos implements ActionListener{
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource() == PanelDatos.imprimir){
            try{
                PrincipalFrame.panelTable.removeAll();
                int numero1 = Integer.parseInt(PanelDatos.numValores.getText().toString());
                PrincipalFrame.datos = new String[numero1][2];
                for(int fila = 0; fila < PrincipalFrame.datos.length; fila++){
                    for(int col = 0; col < PrincipalFrame.datos[0].length; col++){
                        PrincipalFrame.datos[fila][col] = String.valueOf(fila);
                    }
                }
                PrincipalFrame.panelTable.updateUI();
                PrincipalFrame.panelTable.repaint();
                PrincipalFrame.tabla = new JTable(PrincipalFrame.datos, PrincipalFrame.columnNames);
                // Importante para ver el encabezado
                JScrollPane tableContainer = new JScrollPane(PrincipalFrame.tabla);
                PrincipalFrame.panelTable.add(tableContainer);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(evento.getSource() == Resultados.calc){
            try{
                double counter = 0, media = 0;
                int i;
                for(i = 0; i < PrincipalFrame.tabla.getRowCount(); i++){
                    counter += Integer.parseInt(PrincipalFrame.tabla.getValueAt(i, 1).toString());
                }
                media = counter / i;
                Resultados.lbl.setText("El valor de la media es: " + media);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error):", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
