package practica12;
import javax.swing.*;
import java.awt.event.*;

public class Eventos implements ActionListener{
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource() == PanelDatos.imprimir){
            try{
                int numero1 = Integer.parseInt(PanelDatos.numValores.getText().toString());
                System.out.println(numero1);
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
                System.out.println("Ha ocurrido un error");
            }
        }
    }
}