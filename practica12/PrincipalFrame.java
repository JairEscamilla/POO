package practica12;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class PrincipalFrame extends JFrame{
    static String datos[][];
    static JTable tabla;
    static String columnNames[] = {"Dato", "Valor"};
    static JPanel panelTable;
    public PrincipalFrame(){
        super("Medidas de tendencia");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLayout(new GridLayout(2, 1));
        PanelDatos ingD = new PanelDatos();
        this.add(ingD);
        panelTable = new JPanel();
        panelTable.setLayout(new BorderLayout());
        this.add(panelTable);
        Eventos manejador = new Eventos();
        PanelDatos.imprimir.addActionListener(manejador);
    }
}